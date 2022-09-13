package kjd.yahoo.fantasy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

import kjd.yahoo.fantasy.oauth.YahooApi20;
import kjd.yahoo.fantasy.oauth.YahooOAuthTokenReader;

@Disabled
class YahooOAuthServiceTest {
	
	static String clientId;
	static String clientSecret;
	static String refreshToken;
	static OAuth2AccessToken token;
	
	@BeforeAll
	static void beforeAll() throws IOException {
		clientId = System.getenv("YFS_CLIENT_ID");
		clientSecret = System.getenv("YFS_CLIENT_SECRET");
		refreshToken = System.getenv("YFS_REFRESH_TOKEN");
		token = YahooOAuthTokenReader.INSTANCE.read("token.json");
	}
	
	@Test
	void test_create_OAuthService() {
		OAuth20Service service = new ServiceBuilder(clientId)
				.apiSecret(clientSecret)
				.callback("oob")
				.build(YahooApi20.instance());
		
		String authUrl = service.getAuthorizationUrl();
		assertEquals("https://api.login.yahoo.com/oauth2/request_auth?response_type=code&client_id=dj0yJmk9S21aTldJV05BdEhSJmQ9WVdrOWVYZFZiMVJpTXpJbWNHbzlNQS0tJnM9Y29uc3VtZXJzZWNyZXQmeD04Zg--&redirect_uri=oob", 
				authUrl);
	}
	
	@Test
	void test_refresh_AccessToken() throws IOException, InterruptedException, ExecutionException {
		OAuth20Service service = new ServiceBuilder(clientId)
				.apiSecret(clientSecret)
				.callback("oob")
				.build(YahooApi20.instance());
		
		OAuth2AccessToken oauthToken = service.refreshAccessToken(refreshToken);
		assert(oauthToken.getAccessToken()).equals(token.getAccessToken());
		assert(oauthToken.getRefreshToken()).equals(token.getAccessToken());
	}

}

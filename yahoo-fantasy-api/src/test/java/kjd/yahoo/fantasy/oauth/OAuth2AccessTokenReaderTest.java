package kjd.yahoo.fantasy.oauth;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.github.scribejava.core.model.OAuth2AccessToken;

@Disabled
class OAuth2AccessTokenReaderTest {

	static YahooOAuthTokenReader reader;
	
	@BeforeAll
	public static void beforeAll() {
		reader = YahooOAuthTokenReader.INSTANCE;
	}

	@Test
	void read_accessToken() throws JsonParseException, JsonMappingException, IOException {
		OAuth2AccessToken token = reader.read("token.json");
		
		assertNotNull(token);		
	}
}

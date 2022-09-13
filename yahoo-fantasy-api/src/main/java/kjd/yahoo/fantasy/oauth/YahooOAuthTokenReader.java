package kjd.yahoo.fantasy.oauth;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public 
class YahooOAuthTokenReader {

	public static final YahooOAuthTokenReader INSTANCE = new YahooOAuthTokenReader();
	
	private ObjectMapper mapper;
	
	public YahooOAuthTokenReader() {
		this.mapper = new ObjectMapper();				
		this.mapper.addMixIn(YahooOAuthToken.class, YahooOAuthTokenMixin.class);
		this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}	
	
	public YahooOAuthToken read(String uri) throws IOException {
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource("token.json");
		YahooOAuthToken token = null;
		
		try(InputStream is = url.openStream()) {
			token = mapper.readValue(url.openStream(), YahooOAuthToken.class);			
		} 		
		
		return token;
	}
	
	public static abstract class YahooOAuthTokenMixin {		
		public YahooOAuthTokenMixin(
				@JsonProperty("access_token") String accessToken,			
				@JsonProperty("token_type") String tokenType,			
				@JsonProperty("expires_in") Integer expiresIn,			
				@JsonProperty("refresh_token") String refreshToken,			
				@JsonProperty("xoauth_yahoo_guid") String guid,	
				@JsonProperty("rawResponse") String rawResponse	
			) {}		
	}

}

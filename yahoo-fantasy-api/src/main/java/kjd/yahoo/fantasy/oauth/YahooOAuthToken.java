package kjd.yahoo.fantasy.oauth;

import com.github.scribejava.core.model.OAuth2AccessToken;

import lombok.Getter;

public class YahooOAuthToken extends OAuth2AccessToken {

	private static final long serialVersionUID = 1916579078903193530L;

	@Getter
	private String guid;
	
	public YahooOAuthToken(String accessToken, String tokenType, Integer expiresIn, String refreshToken, String guid,
			String rawResponse) {
		super(accessToken, tokenType, expiresIn, refreshToken, "fspt-w,sdps-r", rawResponse);	
		this.guid = guid;
	}

	public YahooOAuthToken(String accessToken, String guid, String rawResponse) {
		this(accessToken, null, null, null, guid, null);
	}

	public YahooOAuthToken(String accessToken, String guid) {
		this(accessToken, guid, null);
	}

}

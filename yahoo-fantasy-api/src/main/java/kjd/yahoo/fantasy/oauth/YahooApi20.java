package kjd.yahoo.fantasy.oauth;

import java.io.OutputStream;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.httpclient.HttpClient;
import com.github.scribejava.core.httpclient.HttpClientConfig;
import com.github.scribejava.core.oauth.OAuth20Service;

/**
 * Implements the {@link DefaultApi20} to provide a {@link YahooOAuthService} instead
 * of the standard {@link OAuth20Service}.  For more information on this, check out
 * the {@code https://github.com/scribejava/scribejava/tree/master/scribejava-apis}.
 * 
 * @author kdavidson
 *
 */
public class YahooApi20 extends DefaultApi20 {

    protected YahooApi20() {}

    private static class InstanceHolder {
        private static final YahooApi20 INSTANCE = new YahooApi20();
    }

    public static YahooApi20 instance() {
        return InstanceHolder.INSTANCE;
    }

    @Override
    public String getAccessTokenEndpoint() {
        return "https://api.login.yahoo.com/oauth2/get_token";
    }

    @Override
    protected String getAuthorizationBaseUrl() {
        return "https://api.login.yahoo.com/oauth2/request_auth";
    }

	@Override
	public OAuth20Service createService(String apiKey, String apiSecret, String callback, String defaultScope,
			String responseType, OutputStream debugStream, String userAgent, HttpClientConfig httpClientConfig,
			HttpClient httpClient) {
		return new OAuth20Service(this, apiKey, apiSecret, callback, defaultScope, responseType, debugStream, userAgent, httpClientConfig, httpClient);
	}
    
}

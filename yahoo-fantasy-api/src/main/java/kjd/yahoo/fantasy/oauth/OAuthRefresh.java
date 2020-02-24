package kjd.yahoo.fantasy.oauth;

/**
 * Provide configuration on when and how the Yahoo OAuth token is
 * refreshed.  The available options are:
 * <p>
 * <ul>
 * 	<li><strong>MANUAL</strong> will always fail the the current request and
 * 		require the implementation to manually call the refresh logic.</li>
 * 	<li><strong>ON_ERROR</strong> will automatically attempt a single refresh
 * 		during the execution of a request if it's required.</li>
 * 	<li><strong>AGGRESSIVE</strong> will perform the refresh request upon
 * 		creation of the API/Token.  This will also attempt to manage the
 * 		time of the token, to refresh prior to expiry.
 * </ul>
 * 
 * @author kendavidson
 *
 */
public enum OAuthRefresh {
	MANUAL,
	ON_ERROR,
	AGGRESSIVE
}

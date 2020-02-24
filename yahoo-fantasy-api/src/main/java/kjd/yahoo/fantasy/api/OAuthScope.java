package kjd.yahoo.fantasy.api;

public enum OAuthScope {
	FSPW_R("fspt-r", "Fantasy Sports Read"),
	FSPW_W("fspt-w", "Fantasy Sports Read/Write");
	
	public final String scope;
	public final String description;
	OAuthScope(String scope, String description) {
		this.scope = scope;
		this.description = description;
	}
}

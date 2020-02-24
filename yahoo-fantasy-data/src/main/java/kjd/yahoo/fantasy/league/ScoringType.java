package kjd.yahoo.fantasy.league;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ScoringType {
	HEAD("head"),
	ROTO("roto");
	
	@JsonValue
	public final String abbr;
	
	ScoringType(String abbr) {
		this.abbr = abbr;
	}
}

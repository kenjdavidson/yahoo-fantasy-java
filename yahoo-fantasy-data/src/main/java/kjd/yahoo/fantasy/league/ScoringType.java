package kjd.yahoo.fantasy.league;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ScoringType {
	HEAD("head"),
	ROTO("roto");
	
	@JsonValue
	public final String value;

}

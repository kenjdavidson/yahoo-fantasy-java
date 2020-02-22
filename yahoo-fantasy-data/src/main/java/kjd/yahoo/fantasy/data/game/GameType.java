package kjd.yahoo.fantasy.data.game;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum GameType {
	UNKNOWN(""),
	FULL("full");

	@JsonValue
	public final String abbr;
	
	public static final GameType[] VALUES = GameType.values();

	public static GameType fromAbbr(String abbr) {
		for (GameType code : VALUES) {
			if (code.abbr.equals(abbr)) {
				return code;
			}
		}
		
		return GameType.UNKNOWN;
	}
}

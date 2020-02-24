package kjd.yahoo.fantasy.data.game;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum GameCode {
	NFL("nfl", "National Footbal League"),
	NHL("nhl", "National Hockey League"),
	MLB("mlb", "Major League Baseball"),
	NBA("nba", "National Basketball Association");
	
	@JsonValue
	public final String abbr;
	public final String desc;
	
	public static final GameCode[] VALUES = GameCode.values();
	
	public static GameCode fromAbbr(String abbr) {
		for (GameCode code : VALUES) {
			if (code.abbr.equals(abbr)) {
				return code;
			}
		}
		
		throw new EnumConstantNotPresentException(GameCode.class, abbr);
	}
}

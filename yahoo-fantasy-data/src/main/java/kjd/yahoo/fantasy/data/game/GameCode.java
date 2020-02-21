package kjd.yahoo.fantasy.data.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import kjd.yahoo.fantasy.data.Abbreviated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GameCode implements Abbreviated<Enum<GameCode>> {
	UNKNOWN("", "Unknown Game Code"),
	NFL("nfl", "National Footbal League"),
	NHL("nhl", "National Hockey League"),
	MLB("mlb", "Major League Baseball"),
	NBA("nba", "National Basketball Association");
	
	public final String abbr;
	public final String desc;
	
	public static final GameCode[] VALUES = GameCode.values();
	
	@JsonValue
	@JsonCreator
	public static GameCode fromAbbr(String abbr) {
		for (GameCode code : VALUES) {
			if (code.getAbbr().equals(abbr)) {
				return code;
			}
		}
		
		return GameCode.UNKNOWN;
	}
}

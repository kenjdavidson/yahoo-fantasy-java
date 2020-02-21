package kjd.yahoo.fantasy.data.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import kjd.yahoo.fantasy.data.Abbreviated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum GameType implements Abbreviated<Enum<GameType>> {
	UNKNOWN(""),
	FULL("full");
	
	public final String abbr;	
	public static final GameType[] VALUES = GameType.values();
	
	@JsonValue
	@JsonCreator
	public static GameType fromAbbr(String abbr) {
		for (GameType code : VALUES) {
			if (code.getAbbr().equals(abbr)) {
				return code;
			}
		}
		
		return GameType.UNKNOWN;
	}
}

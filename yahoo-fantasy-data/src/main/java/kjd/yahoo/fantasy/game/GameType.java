package kjd.yahoo.fantasy.game;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum GameType {
	FULL("full"),
	PICKEM_TEAM("pickem-team"),
	PICKEM_GROUP("pickem-group"),
	PICKEM_TEAM_LIST("pickem-team-list");
	
	@JsonValue
	public final String abbr;
	
	public static final GameType[] VALUES = GameType.values();

	public static GameType fromAbbr(String abbr) {
		for (GameType code : VALUES) {
			if (code.abbr.equals(abbr)) {
				return code;
			}
		}
		
		throw new EnumConstantNotPresentException(GameType.class, abbr);
	}
}

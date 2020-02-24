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
	public final String value;
	
	public static final GameType[] VALUES = GameType.values();

}

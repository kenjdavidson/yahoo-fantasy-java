package kjd.yahoo.fantasy.game;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@XmlEnum
public enum GameType {
	@XmlEnumValue(value="full") FULL,
	@XmlEnumValue(value="pickem-team") PICKEM_TEAM,
	@XmlEnumValue(value="pickem-group") PICKEM_GROUP,
	@XmlEnumValue(value="pickem-team-list") PICKEM_TEAM_LIST;
	
	public static final GameType[] VALUES = GameType.values();

}

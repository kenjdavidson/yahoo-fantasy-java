package kjd.yahoo.fantasy.game;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlValue;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@XmlEnum
public enum GameCode {
	@XmlEnumValue(value="nfl") NFL("National Footbal League"),
	@XmlEnumValue(value="nhl") NHL("National Hockey League"),
	@XmlEnumValue(value="mlb") MLB("Major League Baseball"),
	@XmlEnumValue(value="nba") NBA("National Basketball Association");
	
	public final String desc;
	
	public static final GameCode[] VALUES = GameCode.values();
	
}

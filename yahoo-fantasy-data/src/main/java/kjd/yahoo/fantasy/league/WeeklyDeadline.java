package kjd.yahoo.fantasy.league;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import kjd.yahoo.fantasy.game.GameType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum WeeklyDeadline {
	INTRADAY("intraday");
	
	@JsonValue
	public final String value;	
	
	public static final WeeklyDeadline[] VALUES = WeeklyDeadline.values();
}

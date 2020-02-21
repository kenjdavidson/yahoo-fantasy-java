package kjd.yahoo.fantasy.data.league;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum WeeklyDeadline {
	INTRADAY("intraday");
	
	public final String abbr;	
	public static final WeeklyDeadline[] VALUES = WeeklyDeadline.values();
	
	@JsonValue
	@JsonCreator
	public static WeeklyDeadline fromAbbr(String abbr) {
		for (WeeklyDeadline code : VALUES) {
			if (code.getAbbr().equals(abbr)) {
				return code;
			}
		}
		
		return null;
	}
}

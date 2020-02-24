package kjd.yahoo.fantasy.data;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CoverageType {
	SEASON("season"),
	WEEK("week"),
	DATE("date");
	
	@JsonValue
	public final String abbr;
	
	CoverageType(String abbr) {
		this.abbr = abbr;
	}
}

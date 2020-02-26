package kjd.yahoo.fantasy;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class WeeklyCoverage implements Coverage<Integer> {

	private CoverageType type;
	
	private Integer value;
	
	@JsonCreator
	public WeeklyCoverage(
			@JsonProperty("coverageType") CoverageType type,
			@JsonProperty("week") Integer week) {
		this.type = type;
		this.value = week;
	}
	
}

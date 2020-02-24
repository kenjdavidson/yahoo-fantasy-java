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
			@JsonProperty(value="coverageType") CoverageType type,
			@JsonProperty(value="week") Integer week) {
		this.type = type;
		this.value = week;
	}
	
}

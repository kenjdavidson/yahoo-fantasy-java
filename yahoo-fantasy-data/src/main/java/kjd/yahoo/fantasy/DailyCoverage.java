package kjd.yahoo.fantasy;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class DailyCoverage implements Coverage<Date> {

	private CoverageType type;
	
	private Date value;
	
	@JsonCreator
	public DailyCoverage(
			@JsonProperty("coverageType") CoverageType type,
			@JsonProperty("date") Date date) {
		this.type = type;
		this.value = date;
	}
	
}

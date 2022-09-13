package kjd.yahoo.fantasy.player;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.CoverageType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StartingStatus {

	private CoverageType coverageType;
	
	private Integer week;
	
	private Integer season;
	
	private Date date;
	
	@JsonProperty("is_starting")
	private boolean starting;
}

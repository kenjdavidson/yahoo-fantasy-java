package kjd.yahoo.fantasy.data.player;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Coverage;
import kjd.yahoo.fantasy.data.CoverageType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StartingStatus {

	private CoverageType coverageType;
	
	private Integer week;
	
	private Integer season;
	
	private Date date;
	
	@JsonProperty(value="is_starting")
	private boolean starting;
}

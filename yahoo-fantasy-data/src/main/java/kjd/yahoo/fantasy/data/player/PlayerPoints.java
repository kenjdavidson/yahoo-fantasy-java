package kjd.yahoo.fantasy.data.player;

import java.util.Date;

import kjd.yahoo.fantasy.data.Coverage;
import kjd.yahoo.fantasy.data.CoverageType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerPoints {

	private CoverageType coverageType;
	
	private Integer week;
	
	private Integer season;
	
	private Date date;
	
	private double total;
	
	private double expected;
	
}

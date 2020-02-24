package kjd.yahoo.fantasy.player;

import java.util.Date;

import kjd.yahoo.fantasy.Coverage;
import kjd.yahoo.fantasy.CoverageType;
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

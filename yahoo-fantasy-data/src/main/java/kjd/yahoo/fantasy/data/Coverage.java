package kjd.yahoo.fantasy.data;

import lombok.Setter;

import java.util.Date;

import lombok.Getter;

/**
 * Different sports and leagues have different coverage types: date, season, week, etc.
 * A {@link Coverage} provides direct access to the specific interval which is being
 * referred.
 * 
 * @author kdavidson
 *
 */
@Getter
@Setter
public class Coverage {

	private String coverageType;
	
	private Date date;
	
	private int week;
	
	private int season;
	
}

package kjd.yahoo.fantasy.team;

import kjd.yahoo.fantasy.CoverageType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RosterAdds {

	private CoverageType coverageType;
	
	/**
	 * Coverage value is based on the {@link CoverageType} and will be
	 * either an Integer (season/week) or Date (date);
	 */
	private String coverageValue;
	
	private int value;
	
}

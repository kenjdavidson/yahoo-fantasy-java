package kjd.yahoo.fantasy.data.team;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
public class TeamStandings {

	private int rank;
	
	private int playoffSeed;
	
	private OutcomeTotals outcomeTotals;
	
}

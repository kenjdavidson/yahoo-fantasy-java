package kjd.yahoo.fantasy.team;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamStandings {

	private int rank;
	
	// HEAD
	private int playoffSeed;
	
	private OutcomeTotals outcomeTotals;
	
	// ROTO
	private double pointsFor;
	
	private double pointsChange;
	
	private double pointsBack;
	
}

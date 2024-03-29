package kjd.yahoo.fantasy.scoreboard;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.Subresource;
import kjd.yahoo.fantasy.league.StatWinner;
import kjd.yahoo.fantasy.team.Team;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Subresource
public class Matchup {
	
	private int week;
	
	private Date weekStart;
	
	private Date weekEnd;
	
	private String status;
	
	@JsonProperty("is_playoffs")
	private boolean playoffs;
	
	@JsonProperty("is_consolation")
	private boolean consolation;
	
	@XmlElementWrapper(name="stat_winners")
	private List<StatWinner> statWinners;
	
	@XmlElementWrapper(name="teams")
	private List<Team> teams;
			
}

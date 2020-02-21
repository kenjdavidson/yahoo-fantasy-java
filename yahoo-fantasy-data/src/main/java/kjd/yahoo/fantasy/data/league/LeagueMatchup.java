package kjd.yahoo.fantasy.data.league;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Subresource;
import kjd.yahoo.fantasy.data.team.Team;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeagueMatchup implements Subresource {
	
	private int week;
	
	private Date weekStart;
	
	private Date weekEnd;
	
	private String status;
	
	@JsonProperty(value="is_playoffs")
	private boolean playoffs;
	
	@JsonProperty(value="is_consolation")
	private boolean consolation;
	
	@XmlElementWrapper(name="stat_winners")
	private List<StatWinner> statWinners;
	
	@XmlElementWrapper(name="teams")
	private List<Team> teams;
			
}

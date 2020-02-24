package kjd.yahoo.fantasy.league;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.team.Team;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeagueStandings {

	@XmlElementWrapper(name="teams")
	private List<Team> teams;
	
}

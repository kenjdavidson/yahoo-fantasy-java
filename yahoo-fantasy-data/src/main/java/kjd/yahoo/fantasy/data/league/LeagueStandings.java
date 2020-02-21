package kjd.yahoo.fantasy.data.league;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.team.Team;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeagueStandings {

	@XmlElementWrapper(name="teams")
	private List<Team> teams;
	
}

package kjd.yahoo.fantasy.data.league;

import lombok.Setter;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.Subresource;
import lombok.Getter;

@Getter
@Setter
public class LeagueScoreboard implements Subresource {

	private int week;
	
	@XmlElementWrapper(name="matchups")
	private List<LeagueMatchup> matchups;
	
}

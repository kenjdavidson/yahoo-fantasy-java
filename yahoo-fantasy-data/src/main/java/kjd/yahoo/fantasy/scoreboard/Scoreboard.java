package kjd.yahoo.fantasy.scoreboard;

import lombok.Setter;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.Subresource;
import lombok.Getter;

@Getter
@Setter
@Subresource
public class Scoreboard {

	private int week;
	
	@XmlElementWrapper(name="matchups")
	private List<Matchup> matchups;
	
}

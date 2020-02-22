package kjd.yahoo.fantasy.data.scoreboard;

import lombok.Setter;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.Subresource;
import lombok.Getter;

@Getter
@Setter
@Subresource
public class Scoreboard {

	private int week;
	
	@XmlElementWrapper(name="matchups")
	private List<Matchup> matchups;
	
}

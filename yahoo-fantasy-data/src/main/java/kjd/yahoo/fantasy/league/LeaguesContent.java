package kjd.yahoo.fantasy.league;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.FantasyContent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaguesContent extends FantasyContent<League> {

	@XmlElementWrapper(name="leagues")
	private List<League> leagues;
	
}

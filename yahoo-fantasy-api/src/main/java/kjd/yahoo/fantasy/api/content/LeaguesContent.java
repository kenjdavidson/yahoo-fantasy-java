package kjd.yahoo.fantasy.data.league;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.FantasyContent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaguesCollection extends FantasyContent<LeaguesCollection> {

	@XmlElementWrapper(name="leagues")
	private List<League> leagues;
	
}

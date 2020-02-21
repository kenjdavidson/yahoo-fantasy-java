package kjd.yahoo.fantasy.data.team;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.FantasyContent;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class TeamsCollection extends FantasyContent<TeamsCollection> {

	@XmlElementWrapper(name="teams")
	private List<Team> teams;
	
}

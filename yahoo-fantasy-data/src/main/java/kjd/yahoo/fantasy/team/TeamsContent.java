package kjd.yahoo.fantasy.team;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.FantasyContent;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class TeamsContent extends FantasyContent<Team> {

	@XmlElementWrapper(name="teams")
	private List<Team> teams;
	
}

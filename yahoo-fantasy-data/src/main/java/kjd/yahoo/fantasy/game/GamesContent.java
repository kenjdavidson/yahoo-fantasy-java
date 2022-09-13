package kjd.yahoo.fantasy.game;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.FantasyContent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GamesContent extends FantasyContent<Game> {

	@XmlElementWrapper(name="games")
	List<Game> games;
	
}

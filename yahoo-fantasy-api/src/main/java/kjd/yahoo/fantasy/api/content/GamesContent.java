package kjd.yahoo.fantasy.api.content;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.game.Game;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GamesContent extends FantasyContent<Game> {

	@XmlElementWrapper(name="games")
	List<Game> games;
	
}

package kjd.yahoo.fantasy.data.game;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.FantasyContent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GamesCollection extends FantasyContent<GamesCollection> {

	@XmlElementWrapper(name="games")
	List<Game> games;
	
}

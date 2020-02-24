package kjd.yahoo.fantasy.data.player;

import lombok.Setter;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.FantasyContent;
import lombok.Getter;

@Getter
@Setter
public class PlayersCollection extends FantasyContent<PlayersCollection> {

	@XmlElementWrapper(name="players")
	private List<Player> players;
	
}

package kjd.yahoo.fantasy.player;

import lombok.Setter;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.FantasyContent;
import kjd.yahoo.fantasy.player.Player;
import lombok.Getter;

@Getter
@Setter
public class PlayersContent extends FantasyContent<Player> {

	@XmlElementWrapper(name="players")
	private List<Player> players;
	
}

package kjd.yahoo.fantasy.api.content;

import lombok.Setter;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.player.Player;
import lombok.Getter;

@Getter
@Setter
public class PlayersContent extends FantasyContent<Player> {

	@XmlElementWrapper(name="players")
	private List<Player> players;
	
}

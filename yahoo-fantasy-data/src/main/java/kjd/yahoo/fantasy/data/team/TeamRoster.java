package kjd.yahoo.fantasy.data.team;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Coverage;
import kjd.yahoo.fantasy.data.Subresource;
import kjd.yahoo.fantasy.data.player.Player;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Subresource
public class TeamRoster extends Coverage {
	
	@JsonProperty(value="is_editable")
	private boolean editable;
	
	@XmlElementWrapper(name="players")
	private List<Player> players;
		
}

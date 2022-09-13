package kjd.yahoo.fantasy.team;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.CoverageType;
import kjd.yahoo.fantasy.Subresource;
import kjd.yahoo.fantasy.player.Player;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Subresource
public class Roster {
	
	private CoverageType type;
	
	private int season;
	
	private int week;
	
	private Date date;
	
	@JsonProperty("is_editable")
	private boolean editable;
	
	@XmlElementWrapper(name="players")
	private List<Player> players;
		
}

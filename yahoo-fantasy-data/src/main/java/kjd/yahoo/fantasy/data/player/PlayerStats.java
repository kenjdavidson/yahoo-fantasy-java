package kjd.yahoo.fantasy.data.player;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.Coverage;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class PlayerStats extends Coverage {
	
	@XmlElementWrapper(name="stats")
	List<PlayerStat> stats;
	
}

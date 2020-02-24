package kjd.yahoo.fantasy.team;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.CoverageType;
import kjd.yahoo.fantasy.player.PlayerStat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamStats {
	
	private CoverageType coverageType;
	
	private Integer week;
	
	private Integer season;
	
	private Date date;
	
	@XmlElementWrapper(name="stats")
	List<PlayerStat> stats;

}

package kjd.yahoo.fantasy.data.player;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.Coverage;
import kjd.yahoo.fantasy.data.CoverageType;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class PlayerStats {
	
	private CoverageType coverageType;
	
	private Integer week;
	
	private Integer season;
	
	private Date date;
	
	@XmlElementWrapper(name="stats")
	List<PlayerStat> stats;
	
}

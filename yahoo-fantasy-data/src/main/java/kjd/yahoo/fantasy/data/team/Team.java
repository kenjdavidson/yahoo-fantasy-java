package kjd.yahoo.fantasy.data.team;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Resource;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team implements Resource {

	@JsonProperty(value="team_key")
	private String key;
	
	@JsonProperty(value="team_id")
	private long id;
	
	private String name;
	
	private String url;
	
	private List<TeamLogo> teamLogos;
	
	private int waiverPriority;
	
	private int numberOfMoves;
	
	private int numberOfTrades;
	
	private RosterAdds rosterAdds;
	
	@JsonProperty(value="clinched_playoffs")
	private boolean clinchedPlayoffs;
	
	@JsonProperty(value="league_scoring_type")
	private String scoringType;
	
	@JsonProperty(value="has_draft_grade")
	private boolean hasDraftGrade;
	
	private String draftGrade;
	
	private String draftRecapUrl;
	
	private List<Manager> managers;
	
	private TeamRoster roster;
	
	private TeamStats teamStats;

	private TeamPoints teamPoints;
	
	private TeamStandings teamStandings;
	
}

package kjd.yahoo.fantasy.team;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.Subresource;
import kjd.yahoo.fantasy.league.ScoringType;
import kjd.yahoo.fantasy.scoreboard.Matchup;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {

	final String KEY_FORMAT = "^((\\d+)\\.l\\.(\\d+))\\.t\\.(\\d+)$";
	final Pattern KEY_PATTERN = Pattern.compile(KEY_FORMAT);
	
	@JsonProperty("team_key")
	private String key;
	
	@JsonProperty("team_id")
	private long id;
	
	private String name;
	
	private String url;
	
	private List<TeamLogo> teamLogos;
	
	private int waiverPriority;
	
	private int numberOfMoves;
	
	private int numberOfTrades;
	
	private RosterAdds rosterAdds;
	
	@JsonProperty("clinched_playoffs")
	private boolean clinchedPlayoffs;
	
	@JsonProperty("league_scoring_type")
	private ScoringType scoringType;
	
	@JsonProperty("has_draft_grade")
	private boolean hasDraftGrade;
	
	private String draftGrade;
	
	private String draftRecapUrl;
	
	private List<Manager> managers;
	
	@Subresource
	private Roster roster;
	
	@Subresource
	private TeamStats teamStats;

	@Subresource
	private TeamPoints teamPoints;
	
	@Subresource
	private TeamStandings teamStandings;
	
	@Subresource
	private Matchup matchup;
	
	@JsonIgnore
	public String getLeagueKey() {
		Matcher m;
		if ((m = KEY_PATTERN.matcher(key)).matches()) {
			return m.group(1);
		}
		throw new IllegalStateException("Team key is not valid format");
	}
	
	@JsonIgnore
	public String getGameKey() {
		Matcher m;
		if ((m = KEY_PATTERN.matcher(key)).matches()) {
			return m.group(1);
		}		
		throw new IllegalStateException("Team key is not valid format");
	}
	
}

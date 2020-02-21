package kjd.yahoo.fantasy.data.league;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Subresource;
import kjd.yahoo.fantasy.data.stat.StatCategories;
import kjd.yahoo.fantasy.data.stat.StatModifiers;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeagueSettings implements Subresource {

	private String draftType;
		
	private boolean isAuctionDraft;
	
	private String scoringType;
	
	@JsonProperty(value="uses_playoff")
	private boolean usesPlayoff;
	
	@JsonProperty(value="has_playoff_consolation_games")
	private boolean hasConsolationGames;
			
	private int playoffStartWeek;
		
	@JsonProperty(value="uses_playoff_reseeding")
	private boolean playoffReseeding;
	
	@JsonProperty(value="uses_lock_eliminated_teams")
	private boolean lockEliminatedTeams;
		
	private int numPlayoffTeams;
		
	@JsonProperty(value="num_playoff_consolation_teams")
	private int numConsolationTeams;
	
	@JsonProperty(value="has_multiweek_championship")
	private boolean multiweekChampionship;
	
	@JsonProperty(value="uses_roster_import")
	private boolean rosterImport;
	
	private String waiverType;
	
	private String waiverRule;
		
	@JsonProperty(value="use_faab")
	private boolean useFaab;
		
	private Date draftTime;
	
	private int draftPickTime;
	
	private String postDraftPlayers;
	
	private int maxTeams;
	
	private int waiverTime;
	
	private Date tradeEndDate;
	
	private String tradeRatifyType;
	
	private int tradeRejectTime;
	
	private String playerPool;
		
	private String cantCutList;
	
	@JsonProperty(value="can_trade_draft_picks")
	private boolean tradeDraftPicks;

	@XmlElementWrapper(name="roster_positions")
	private List<RosterPosition> rosterPositions;
		
	private StatCategories statCategories;

	private StatModifiers statModifiers;
	
	private int maxAdds;
	
	@JsonProperty(value="is_pickem_enabled")
	private boolean pickemEnabled; 
	
	@JsonProperty(value="is_fractional_points")
	private boolean fractionalPoints;
	
	@JsonProperty(value="is_negative_points")
	private boolean negativePoints;
	
}


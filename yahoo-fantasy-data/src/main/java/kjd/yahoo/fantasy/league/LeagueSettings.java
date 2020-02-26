package kjd.yahoo.fantasy.league;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.Subresource;
import kjd.yahoo.fantasy.stat.StatCategories;
import kjd.yahoo.fantasy.stat.StatModifiers;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Subresource
public class LeagueSettings {

	private String draftType;
		
	private boolean isAuctionDraft;
	
	private String scoringType;
	
	@JsonProperty("uses_playoff")
	private boolean usesPlayoff;
	
	@JsonProperty("has_playoff_consolation_games")
	private boolean hasConsolationGames;
			
	private int playoffStartWeek;
		
	@JsonProperty("uses_playoff_reseeding")
	private boolean playoffReseeding;
	
	@JsonProperty("uses_lock_eliminated_teams")
	private boolean lockEliminatedTeams;
		
	private int numPlayoffTeams;
		
	@JsonProperty("num_playoff_consolation_teams")
	private int numConsolationTeams;
	
	@JsonProperty("has_multiweek_championship")
	private boolean multiweekChampionship;
	
	@JsonProperty("uses_roster_import")
	private boolean rosterImport;
	
	private String waiverType;
	
	private String waiverRule;
		
	@JsonProperty("use_faab")
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
	
	@JsonProperty("can_trade_draft_picks")
	private boolean tradeDraftPicks;

	@XmlElementWrapper(name="roster_positions")
	private List<RosterPosition> rosterPositions;
		
	private StatCategories statCategories;

	private StatModifiers statModifiers;
	
	private int maxAdds;
	
	@JsonProperty("is_pickem_enabled")
	private boolean pickemEnabled; 
	
	@JsonProperty("is_fractional_points")
	private boolean fractionalPoints;
	
	@JsonProperty("is_negative_points")
	private boolean negativePoints;
	
}


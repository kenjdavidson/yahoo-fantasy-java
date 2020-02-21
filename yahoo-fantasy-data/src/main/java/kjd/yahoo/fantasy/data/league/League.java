package kjd.yahoo.fantasy.data.league;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Resource;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@link League} resource/collection contains access to the following sub-resource(s):
 * <p>
 * <ul>
 * 	<li><strong>leagues;league_keys=key1;out=settings</strong> - {@link LeagueSettings}</li>
 * 	<li><strong>leagues;league_keys=key1;out=standings</strong> - {@link Standings}</li>
 * 	<li><strong>leagues;league_keys=key1;out=scoreboard</strong> - {@link Scoreboard}</li>
 * </ul>
 * <p>
 * <strong>Filters</strong> available are:
 * <p>
 * <ul>
 * 	<li><strong>league_key</strong></li>
 * </ul>
 * 
 * @author kdavidson
 *
 */
@Setter
@Getter
public class League implements Resource {

	@JsonProperty(value="league_key")
	private String key;
	
	@JsonProperty(value="league_id")
	private long id;
	
	private String name;
	
	private String url;
	
	private String logoUrl;
	
	private String draftStatus;
	
	private int numTeams;

	private String editKey;		// Seems to be number or date
	
	private String weeklyDeadline;
	
	private Date leagueUpdateTimestamp;
	
	private String scoringType;
	
	private String leagueType;
	
	@JsonProperty(value="renew")
	private String renewKey;
	
	@JsonProperty(value="renewed")
	private String rewnewedKey;
	
	private String irisGroupChatId;
	
	private String shortInvitationUrl;
	
	@JsonProperty(value="allow_add_to_dl_extra_pos")
	private boolean addToExtraPosition;
	
	@JsonProperty(value="is_pro_league")
	private boolean proLeague;
	
	@JsonProperty(value="is_cash_league")
	private boolean cashLeague;
	
	private int currentWeek;
	
	private int startWeek;
	
	private int endWeek;
	
	private Date startDate;
	
	private Date endDate;
	
	private String gameCode;
	
	private int season;
	
	@JsonProperty(value="is_finished")
	private boolean finished;
	
}

package kjd.yahoo.fantasy.league;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.Subresource;
import kjd.yahoo.fantasy.scoreboard.Scoreboard;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@link League} resource/collection contains access to the following sub-resource(s):
 * <p>
 * <ul>
 * 	<li><strong>leagues;league_keys=key1;out=settings</strong> - {@link LeagueSettings}</li>
 * 	<li><strong>leagues;league_keys=key1;out=standings</strong> - {@link TeamStandings}</li>
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
public class League {
	
	final String KEY_FORMAT = "^((\\d+)\\.l\\d+).(\\d+)$";
	final Pattern KEY_PATTERN = Pattern.compile(KEY_FORMAT);

	@JsonProperty("league_key")
	private String key;
	
	@JsonProperty("league_id")
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
	
	@JsonProperty("renew")
	private String renewKey;
	
	@JsonProperty("renewed")
	private String rewnewedKey;
	
	private String irisGroupChatId;
	
	private String shortInvitationUrl;
	
	@JsonProperty("allow_add_to_dl_extra_pos")
	private boolean addToExtraPosition;
	
	@JsonProperty("is_pro_league")
	private boolean proLeague;
	
	@JsonProperty("is_cash_league")
	private boolean cashLeague;
	
	private int currentWeek;
	
	private int startWeek;
	
	private int endWeek;
	
	private Date startDate;
	
	private Date endDate;
	
	private String gameCode;
	
	private int season;
	
	@JsonProperty("is_finished")
	private boolean finished;
	
	@Subresource
	private LeagueSettings settings;
	
	@Subresource
	private LeagueStandings standings;
	
	@Subresource
	private Scoreboard scoreboard;
	
	@JsonIgnore
	public String getGameKey() {
		Matcher m;
		if ((m = KEY_PATTERN.matcher(key)).matches()) {
			return m.group(1);
		}		
		throw new IllegalStateException("League key is not valid format");
	}	
		
}

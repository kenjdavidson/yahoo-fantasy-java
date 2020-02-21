package kjd.yahoo.fantasy.data.player;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Resource;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@link Player} has a number of contexts and will generally be used as a subresource,
 * although it is possible to use their resource directly:
 * <p>
 * <ul>
 *  <li><strong>players;player_keys=${playerKey};out=metadata</strong> (default)</li>
 * 	<li><strong>players;player_keys=${playerKey};out=stats</strong></li>
 * </ul>
 * <p>
 * <strong>Filters</strong> available are:
 * <p>
 * <ul>
 * 	<li><strong>team_key</strong></li>
 * </ul>
 * 
 * @author kdavidson
 *
 */
@Getter
@Setter
public class Player implements Resource {

	@JsonProperty(value="player_key")
	private String key;
	
	@JsonProperty(value="player_id")
	private long id;
	
	private PlayerName name;
	
	private String editorialPlayerKey;
	
	private String editorialTeamKey;
	
	@JsonProperty(value="editorial_team_full_name")
	private String teamName;
	
	@JsonProperty(value="editorial_team_abbr")
	private String teamAbbr;
	
	@XmlElementWrapper(name="bye_weeks")
	private List<Integer> byeWeeks;
	
	private int uniformNumber;
	
	private String displayPosition;
	
	private Headshot headshot;
	
	private String imageUrl;
	
	@JsonProperty(value="is_undroppable")
	private boolean undroppable;
	
	private String positionType;
	
	private String primaryPosition;
	
	private List<String> eligiblePositions;
	
	@JsonProperty(value="has_player_notes")
	private boolean playerNotes;
	
	@JsonProperty(value="player_notes_last_timestamp")
	private Date playerNotesDate;
	
	private SelectedPosition selectedPosition;
	
	private StartingStatus startingStatus;
		
	private PlayerStats playerStats;
	
	private PlayerStats advancedPlayerStats;
	
	private PlayerPoints playerPoints;
	
	public String getName() {
		return name.getFull();
	}
	
}

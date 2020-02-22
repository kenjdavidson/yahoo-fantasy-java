package kjd.yahoo.fantasy.data.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import kjd.yahoo.fantasy.data.Resource;
import kjd.yahoo.fantasy.data.league.League;
import kjd.yahoo.fantasy.data.player.Player;
import lombok.Getter;
import lombok.Setter;

/**
 * The game resource provides information about the high level Fantasy game available
 * (NHL, NFL, NBA, MLB, etc).  It is generally your first entry point to gather 
 * information available - as it provides leagues.  It should be requested using either
 * <p>
 * Games Collection access:
 * <p>
 * <ul>
 * 	<li><strong>/users;use_login=1/games</strong> - based on the logged in user</li>
 * 	<li><strong>/games;game_keys=key1,key2</strong> - looked up by game key</li>
 * </ul>
 * <p> 
 * Subresource(s) available:
 * <p>
 * <ul>
 * 	<li><strong>/games;game_keys=key1</strong> - metadata is the default</li>
 * <li><strong>/games;game_keys=key1/leagues</strong> - Within the context of a signed in user
 * 		the {@link League} subresource is available.</li>	
 * <li><strong>/games;game_keys=key1/players</strong> - due to this being limited there is now
 * 		direct {@link Player} item(s) available on the {@link Game} resource.</li>
 * </ul>
 * <p>
 * 
 * @author kdavidson
 *
 */
@Setter
@Getter
public class Game implements Resource {

	@JsonProperty(value="game_key")
	private String key;
	
	@JsonProperty(value="game_id")
	private long id;
	
	private String name;
	
	private GameCode code;
	
	private GameType type;
	
	private String url;
	
	private int season;
	
	@JsonProperty(value="is_registration_over")
	private boolean registrationOver;
	
	@JsonProperty(value="is_game_over")
	private boolean gameOver;
	
	@JsonProperty(value="is_offseason")
	private boolean offseason;
	
	private List<League> leagues;
		
	private List<Player> players;
}

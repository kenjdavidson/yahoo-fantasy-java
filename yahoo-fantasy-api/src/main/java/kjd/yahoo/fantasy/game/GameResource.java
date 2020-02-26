package kjd.yahoo.fantasy.game;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.RequestBuilder;
import kjd.yahoo.fantasy.ResourceBuilder;
import kjd.yahoo.fantasy.filter.Filter;
import kjd.yahoo.fantasy.league.LeaguesCollection;
import kjd.yahoo.fantasy.player.PlayersCollection;

public class GameResource extends ResourceBuilder<Game> {

	public static Map<String, Class<? extends RequestBuilder<?>>> SUBRESOURCES;
	
	static {
		HashMap<String, Class<? extends RequestBuilder<?>>> subresources 
			= new HashMap<>();
		subresources.put("leagues", LeaguesCollection.class);
		subresources.put("players", PlayersCollection.class);	
		
		SUBRESOURCES = Collections.unmodifiableMap(subresources);
	}
	
	@Override
	public String name() {
		return "game";
	}
	
	@Override
	public Map<String, Class<? extends Filter<?>>> availableFilters() {
		return Collections.emptyMap();
	}

	@Override
	public Map<String, Class<? extends RequestBuilder<?>>> availableSubresources() {
		return SUBRESOURCES;
	}
	
}

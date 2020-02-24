package kjd.yahoo.fantasy.game;

import java.util.Map;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

import kjd.yahoo.fantasy.ResourceRequestBuilder;
import kjd.yahoo.fantasy.filter.Filter;
import kjd.yahoo.fantasy.game.Game;

public class GameResource extends ResourceRequestBuilder<Game> {

	@Override
	public String name() {
		return "game";
	}

	@Override
	public Map<String, Class<? extends Filter<?>>> availableFilters() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

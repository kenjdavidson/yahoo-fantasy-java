package kjd.yahoo.fantasy.api.game;

import java.util.Map;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

import kjd.yahoo.fantasy.api.Filter;
import kjd.yahoo.fantasy.api.Resource;
import kjd.yahoo.fantasy.data.game.Game;

public class GameResource extends Resource<Game> {

	public GameResource(OAuth20Service service, OAuth2AccessToken token) {
		super(service, token);
	}

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

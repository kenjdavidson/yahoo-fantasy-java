package kjd.yahoo.fantasy.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.CollectionBuilder;
import kjd.yahoo.fantasy.RequestBuilder;
import kjd.yahoo.fantasy.filter.BooleanFilter;
import kjd.yahoo.fantasy.filter.Filter;
import kjd.yahoo.fantasy.game.GamesCollection;

public class UsersCollection extends CollectionBuilder<User> {

	private static Map<String, Class<? extends Filter<?>>> FILTERS;
	private static Map<String, Class<? extends RequestBuilder<?>>> SUBRESOURCES;
	
	static {
		HashMap<String, Class<? extends Filter<?>>> filters 
			= new HashMap<>();
		filters.put("use_login", BooleanFilter.class);		
		FILTERS = Collections.unmodifiableMap(filters);
		
		Map<String, Class<? extends RequestBuilder<?>>> subresources
			= new HashMap<>();
		subresources.put("profile", ProfileResource.class);
		subresources.put("games", GamesCollection.class);
		SUBRESOURCES = Collections.unmodifiableMap(subresources);
	}

	@Override
	public String name() {
		return "users";
	}

	@Override
	public Map<String, Class<? extends RequestBuilder<?>>> availableSubresources() {
		return SUBRESOURCES;
	}

	@Override
	public Map<String, Class<? extends Filter<?>>> availableFilters() {
		return FILTERS;
	}

	@Override
	public String path() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

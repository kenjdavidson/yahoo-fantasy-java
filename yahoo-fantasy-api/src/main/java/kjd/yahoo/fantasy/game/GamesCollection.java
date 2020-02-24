package kjd.yahoo.fantasy.game;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.CollectionRequestBuilder;
import kjd.yahoo.fantasy.filter.BooleanFilter;
import kjd.yahoo.fantasy.filter.Filter;
import kjd.yahoo.fantasy.filter.IntegerFilter;

public class GamesCollection extends CollectionRequestBuilder<GamesCollection> {
	
	private static Map<String, Class<? extends Filter<?>>> AVAIL_FILTERS;
	
	static {
		HashMap<String, Class<? extends Filter<?>>> filters 
			= new HashMap<>();
		filters.put("is_available", BooleanFilter.class);
		filters.put("game_codes", GameCodesFilter.class);
		filters.put("game_types", GameTypesFilter.class);
		filters.put("seasons", IntegerFilter.class);
		
		AVAIL_FILTERS = Collections.unmodifiableMap(filters);
	}

	public GamesCollection() {
		super("games");
	}

	@Override
	public Map<String, Class<? extends Filter<?>>> getAvailableFilters() {
		return AVAIL_FILTERS;
	}
	
}

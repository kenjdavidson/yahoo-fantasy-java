package kjd.yahoo.fantasy.game;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.filter.BooleanFilter;
import kjd.yahoo.fantasy.filter.Filter;
import kjd.yahoo.fantasy.filter.IntegerFilter;
import kjd.yahoo.fantasy.filter.StringFilter;

public class GamesCollection extends GameResource {
	
	private static Map<String, Class<? extends Filter<?>>> FILTERS;
	
	static {
		HashMap<String, Class<? extends Filter<?>>> filters 
			= new HashMap<>();
		filters.put("game_keys", StringFilter.class);
		filters.put("is_available", BooleanFilter.class);
		filters.put("game_codes", GameCodesFilter.class);
		filters.put("game_types", GameTypesFilter.class);
		filters.put("seasons", IntegerFilter.class);
		
		FILTERS = Collections.unmodifiableMap(filters);
	}

	@Override
	public String name() {
		return "games";
	}

	@Override
	public Map<String, Class<? extends Filter<?>>> availableFilters() {
		return FILTERS;
	}

}

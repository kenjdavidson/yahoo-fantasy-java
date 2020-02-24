package kjd.yahoo.fantasy.api.player;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.api.DateFilter;
import kjd.yahoo.fantasy.api.Filter;
import kjd.yahoo.fantasy.api.IntegerFilter;
import kjd.yahoo.fantasy.api.StringFilter;

public class PlayersCollection {

	private static Map<String, Class<? extends Filter<?>>> AVAIL_FILTERS;
	
	static {
		HashMap<String, Class<? extends Filter<?>>> filters 
			= new HashMap<>();
		filters.put("position", StringFilter.class);
		filters.put("status", StringFilter.class);
		filters.put("search", StringFilter.class);
		filters.put("sort", StringFilter.class);
		filters.put("sort_type", StringFilter.class);
		filters.put("sort_season", StringFilter.class);
		filters.put("sort_date", DateFilter.class);
		filters.put("sort_week", IntegerFilter.class);
		filters.put("start", IntegerFilter.class);
		filters.put("count", IntegerFilter.class);
		
		AVAIL_FILTERS = Collections.unmodifiableMap(filters);
	}
	
}

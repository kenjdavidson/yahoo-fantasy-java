package kjd.yahoo.fantasy.player;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.CollectionBuilder;
import kjd.yahoo.fantasy.RequestBuilder;
import kjd.yahoo.fantasy.filter.DateFilter;
import kjd.yahoo.fantasy.filter.Filter;
import kjd.yahoo.fantasy.filter.IntegerFilter;
import kjd.yahoo.fantasy.filter.StringFilter;

public class PlayersCollection extends CollectionBuilder<Player>{

	private static Map<String, Class<? extends Filter<?>>> FILTERS;
	
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
		
		FILTERS = Collections.unmodifiableMap(filters);
	}

	@Override
	public String name() {
		return "players";
	}

	@Override
	public Map<String, Class<? extends RequestBuilder<?>>> availableSubresources() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Class<? extends Filter<?>>> availableFilters() {
		return FILTERS;
	}
	
}

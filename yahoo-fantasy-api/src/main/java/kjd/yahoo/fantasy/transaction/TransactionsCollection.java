package kjd.yahoo.fantasy.transaction;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.filter.DateFilter;
import kjd.yahoo.fantasy.filter.Filter;
import kjd.yahoo.fantasy.filter.IntegerFilter;
import kjd.yahoo.fantasy.filter.StringFilter;

public class TransactionsCollection {

	private static Map<String, Class<? extends Filter<?>>> AVAIL_FILTERS;
	
	static {
		HashMap<String, Class<? extends Filter<?>>> filters 
			= new HashMap<>();
		filters.put("types", StringFilter.class);
		filters.put("team_key", StringFilter.class);
		filters.put("count", IntegerFilter.class);
		
		AVAIL_FILTERS = Collections.unmodifiableMap(filters);
	}
	
}

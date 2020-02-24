package kjd.yahoo.fantasy.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.BooleanFilter;
import kjd.yahoo.fantasy.Filter;

public class UsersCollection {

	private static Map<String, Class<? extends Filter<?>>> AVAIL_FILTERS;
	
	static {
		HashMap<String, Class<? extends Filter<?>>> filters 
			= new HashMap<>();
		filters.put("use_login", BooleanFilter.class);
		
		AVAIL_FILTERS = Collections.unmodifiableMap(filters);
	}
	
}

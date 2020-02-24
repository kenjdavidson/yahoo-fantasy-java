package kjd.yahoo.fantasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import kjd.yahoo.fantasy.filter.Filter;

/**
 * Yahoo Fantasy API requests are built by providing:
 * <ul>
 * 	<li>A type</li>
 * 	<li>A set of Filters</li>
 * 	<li>A set of sub-resources</li>
 * <ul>
 * <p>
 * 
 * @author kendavidson
 *
 * @param <T>
 */
public abstract class RequestBuilder<T> {
	
	private static final String BASE_URL = "https://fantasysports.yahooapis.com/fantasy/v2/";
	
	private Map<String,Filter<?>> filters = new HashMap<>();
	private Set<RequestBuilder<?>> subresources = new HashSet<>();
	
	public <F extends Filter<?>> RequestBuilder<T> filter(F filter) {
		if (!availableFilters().containsKey(filter.getName()))
			throw new IllegalArgumentException(filter.getName() + " is not a valid filter for " + this.getClass().getSimpleName());
				
		Class<?> allowed = availableFilters().get(filter.getName());
		if (!filter.getClass().isAssignableFrom(allowed))
			throw new IllegalArgumentException(filter.getClass().getSimpleName() + " is not a valid filter for " + filter.getName());
			
		this.filters.put(filter.getName(), filter);		
		return this;		
	}
	
	public RequestBuilder<T> subresource(RequestBuilder<?> subresource) {
		this.subresources.add(subresource);
		return this;
	}
	
	public abstract String name();
	
	public abstract Map<String, Class<? extends Filter<?>>> availableFilters();
	
	public String url(String key) {
		return BASE_URL + name();
	}
	 
}

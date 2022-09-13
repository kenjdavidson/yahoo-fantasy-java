package kjd.yahoo.fantasy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
	
	private Map<String,Filter<?>> filters = new HashMap<>();
	private Set<RequestBuilder<?>> subresources = new HashSet<>();
	
	public <F extends Filter<?>> RequestBuilder<T> filter(F filter) {
		if (!availableFilters().containsKey(filter.getName()))
			throw new IllegalArgumentException(filter.getName() 
					+ " is not a valid filter for " + this.getClass().getSimpleName());
				
		Class<?> allowed = availableFilters().get(filter.getName());
		if (!filter.getClass().isAssignableFrom(allowed))
			throw new IllegalArgumentException(filter.getClass().getSimpleName() 
					+ " is not a valid filter for " + filter.getName());
			
		this.filters.put(filter.getName(), filter);		
		return this;		
	}
	
	protected Map<String,Filter<?>> filters() {
		return filters;
	}
	
	public RequestBuilder<T> subresource(RequestBuilder<?> subresource) {
		if (!availableSubresources().containsKey(subresource.name())) 
			throw new IllegalArgumentException(subresource.name() 
					+ " is not a valid subresource for " + this.getClass().getSimpleName());
		
		Class<?> allowed = availableSubresources().get(subresource.name());
		if (!subresource.getClass().isAssignableFrom(allowed))
			throw new IllegalArgumentException(subresource.name()
					+ " is not a valid subresource for " + subresource.name());
			
		this.subresources.add(subresource);
		return this;
	}
	
	protected Set<RequestBuilder<?>> subresources() {
		return subresources;
	}
			
	public abstract String name();
	public abstract String path();
	public abstract Map<String, Class<? extends RequestBuilder<?>>> availableSubresources(); 
	public abstract Map<String, Class<? extends Filter<?>>> availableFilters();
	 
}

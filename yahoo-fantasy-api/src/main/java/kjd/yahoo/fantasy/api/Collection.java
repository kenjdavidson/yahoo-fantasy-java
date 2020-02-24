package kjd.yahoo.fantasy.api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.github.scribejava.core.model.OAuthRequest;

public abstract class Collection<T extends Collection<T>> {
	
	private static final String BASE_URL = "https://fantasysports.yahooapis.com/fantasy/v2/";
	
	/**
	 * Collection name;
	 */
	private String name;
	
	/**
	 * Collections are filter-able by key, this is a special filter which
	 * is available to each Collection.  If there is only one key, then
	 * this is actually a Resource request and will be managed 
	 * accordingly.
	 */
	private Set<String> keys = new HashSet<>();

	/**
	 * {@link Filter}s to be used when requesting this particular
	 * collection request.  Filters are semi-colon separated key/value
	 * pairs.
	 */
	private Map<String, Filter<?>> filters = new HashMap<>();
	
	/**
	 * Sub-resource (collections) to include in the request.  The sub-
	 * resources can get a little wonky - some collections allow only one
	 * and some allow more.  Based on the number of collections the request
	 * will contain:
	 * <ul>
	 * 	<li>Single sub-resource builds {@code /v2/collection/subresource}</li>
	 * 	<li>Multi sub-resources build {@code /v2/collection;out=subresource,...}</li>
	 * </ul>
	 */
	private Set<Collection<?>> subresources = new HashSet<>();
	
	/**
	 * Creates a new {@link Collection} with the specified name.
	 * 
	 * @param name
	 */
	public Collection(String name) {
		this.name = name;
	}
	
	/**
	 * Filters must be made available before they can be applied.
	 * 
	 * @return
	 */
	public abstract Map<String, Class<? extends Filter<?>>> getAvailableFilters();	
	
	/**
	 * Adds a number of keys to the {@link Collection}.
	 * 
	 * @param keys
	 * @return
	 */
	public Collection<T> key(String key) {
		this.keys.add(key);			
		return this;
	}
	
	/**
	 * Adds a number of sub-resources to the {@link Collection}. 
	 * 
	 * @param <T>
	 * @param <R>
	 * @param filters
	 * @return
	 */
	public <F extends Filter<?>> Collection<T> filter(F filter) {
		if (!getAvailableFilters().containsKey(filter.getName()))
			throw new IllegalArgumentException(filter.getName() + " is not a valid filter for " + this.getClass().getSimpleName());
				
		Class<?> allowed = getAvailableFilters().get(filter.getName());
		if (!filter.getClass().isAssignableFrom(allowed))
			throw new IllegalArgumentException(filter.getClass().getSimpleName() + " is not a valid filter for " + filter.getName());
			
		this.filters.put(filter.getName(), filter);		
		return this;		
	}
	
	/**
	 * Adds a sub-resource {@link Collection}.
	 * 
	 * @param subresource
	 * @return
	 */
	public Collection<T> subresource(Collection<?> subresource) {
		this.subresources.add(subresource);
		return this;
	}
	
	public String buildUrl() {

		return null;
	}
	
	public OAuthRequest buildRequest() {
		return null;
	}
}

package kjd.yahoo.fantasy;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

import lombok.Getter;

/**
 * A {@link Resource} is the primary building block to the Yahoo Fantasy
 * API, they describe chunks of data (types) that can be identified by
 * a unique key.
 * 
 * @author kendavidson
 *
 * @param <T>
 */
@Getter
public abstract class Resource<T> {
	
	private static final String BASE_URL = "https://fantasysports.yahooapis.com/fantasy/v2/";
	
	private WeakReference<OAuth20Service> oAuthService;
	private WeakReference<OAuth2AccessToken> oAuthToken;
	
	private Map<String,Filter<?>> filters = new HashMap<>();
	private Set<Collection<?>> subresources = new HashSet<>();
	
	public Resource(OAuth20Service service, OAuth2AccessToken token) {
		this.oAuthService = new WeakReference<>(service);
		this.oAuthToken = new WeakReference<>(token);
	}
	
	public <F extends Filter<?>> Resource<T> filter(F filter) {
		if (!availableFilters().containsKey(filter.getName()))
			throw new IllegalArgumentException(filter.getName() + " is not a valid filter for " + this.getClass().getSimpleName());
				
		Class<?> allowed = availableFilters().get(filter.getName());
		if (!filter.getClass().isAssignableFrom(allowed))
			throw new IllegalArgumentException(filter.getClass().getSimpleName() + " is not a valid filter for " + filter.getName());
			
		this.filters.put(filter.getName(), filter);		
		return this;		
	}
	
	public Resource<T> subresource(Collection<?> subresource) {
		this.subresources.add(subresource);
		return this;
	}
	
	public abstract String name();
	
	public abstract Map<String, Class<? extends Filter<?>>> availableFilters();
	
	public String url(String key) {
		return BASE_URL + name();
	}
	
	public T get(String key) {
		return null;
	}
	
	public Future<T> getAsync() {
		return null;
	}
	 
}

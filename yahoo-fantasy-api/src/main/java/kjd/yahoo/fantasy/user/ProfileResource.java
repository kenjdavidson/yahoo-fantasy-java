package kjd.yahoo.fantasy.user;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kjd.yahoo.fantasy.RequestBuilder;
import kjd.yahoo.fantasy.ResourceBuilder;
import kjd.yahoo.fantasy.filter.Filter;

public class ProfileResource extends ResourceBuilder<Profile> {

	@Override
	public String name() {
		return "profile";
	}

	@Override
	public Map<String, Class<? extends RequestBuilder<?>>> availableSubresources() {
		return Collections.unmodifiableMap(new HashMap<>());
	}

	@Override
	public Map<String, Class<? extends Filter<?>>> availableFilters() {
		return Collections.unmodifiableMap(new HashMap<>());
	}

}

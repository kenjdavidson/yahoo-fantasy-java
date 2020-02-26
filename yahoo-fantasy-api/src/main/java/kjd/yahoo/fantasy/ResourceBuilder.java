package kjd.yahoo.fantasy;

import java.util.Set;

public abstract class ResourceBuilder<T> extends RequestBuilder<T> {
	
	@Override
	public String path() {
		return path("");
	}
	
	public String path(String key) {
		StringBuilder url = new StringBuilder("/").append(name());
		
		if (key != null && !key.isEmpty())
			url.append("/").append(key);
		
		applyFilters(url);
		applySubresources(url);
		
		return url.toString();
	}
	
	private void applyFilters(StringBuilder url) {
		if (filters().size() > 0) {
			String filterString = filters().entrySet().stream()
					.map(e -> e.getValue().apply())
					.reduce(";", (p, e) -> p + ";" + e);
				url.append(filterString);	
		}
	}
	
	private void applySubresources(StringBuilder url) {
		Set<RequestBuilder<?>> subs = subresources();
		if (subs.size() == 1) {
			String subsStr = subs.stream()
				.map(e -> e.path())
				.reduce("", (p, e) -> p + e);
			url.append(subsStr);
		} else if (subresources().size() > 1) {			
			subs.stream()
				.map(e -> e.path())
				.map(s -> s.replaceAll("/", ","))
				.forEach(s -> url.append(s));
		}
	}
	
}

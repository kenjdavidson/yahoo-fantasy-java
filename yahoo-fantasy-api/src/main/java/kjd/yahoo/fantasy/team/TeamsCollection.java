package kjd.yahoo.fantasy.team;

import java.util.Map;

import kjd.yahoo.fantasy.RequestBuilder;
import kjd.yahoo.fantasy.filter.Filter;

public class TeamsCollection extends RequestBuilder<Team> {

	@Override
	public String name() {
		return "teams";
	}

	@Override
	public Map<String, Class<? extends RequestBuilder<?>>> availableSubresources() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Class<? extends Filter<?>>> availableFilters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String path() {
		// TODO Auto-generated method stub
		return null;
	}

}

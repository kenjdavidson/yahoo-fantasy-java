package kjd.yahoo.fantasy.league;

import java.util.Map;

import kjd.yahoo.fantasy.CollectionBuilder;
import kjd.yahoo.fantasy.RequestBuilder;
import kjd.yahoo.fantasy.filter.Filter;

public class LeaguesCollection extends CollectionBuilder<League> {
	
	@Override
	public String name() {
		return "leagues";
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

}

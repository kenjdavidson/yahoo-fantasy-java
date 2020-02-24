package kjd.yahoo.fantasy.api;

public class BooleanFilter extends Filter<Boolean> {
	
	public BooleanFilter(String name, Boolean value) {
		super(name, value);
	}

	@Override
	public String apply() {
		return getValue() ? getName() + "=1" : "";
	}
	
}

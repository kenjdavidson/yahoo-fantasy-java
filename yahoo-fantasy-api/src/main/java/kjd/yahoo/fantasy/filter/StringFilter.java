package kjd.yahoo.fantasy.filter;

import java.util.Arrays;

public class StringFilter extends Filter<String[]> {

	private String name;
	
	public StringFilter(String name, String[] value) {
		super(name, value);
	}

	@Override
	public String apply() {
		return getName() + "=" 
				+ Arrays.stream(getValue())
					.reduce("", (p, key) -> p + "," + key);
	}

}

package kjd.yahoo.fantasy.filter;

import java.util.Arrays;

public class IntegerFilter extends Filter<Integer[]> {

	public IntegerFilter(String name, Integer[] value) {
		super(name, value);
	}

	@Override
	public String apply() {
		return getName() + "=" 
				+ Arrays.stream(getValue())
					.map(season -> Integer.toString(season))
					.reduce("", (p, season) -> p + "," + season);			
	}

}

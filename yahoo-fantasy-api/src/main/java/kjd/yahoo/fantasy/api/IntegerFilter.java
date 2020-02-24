package kjd.yahoo.fantasy.api;

import java.util.Arrays;

import kjd.yahoo.fantasy.data.game.GameCode;

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

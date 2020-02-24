package kjd.yahoo.fantasy.api.game;

import java.util.Arrays;

import kjd.yahoo.fantasy.api.Filter;
import kjd.yahoo.fantasy.data.game.GameCode;

public class GameCodesFilter extends Filter<GameCode[]> {

	public GameCodesFilter(GameCode...value) {
		super("game_codes", value);
	}

	@Override
	public String apply() {
		return "game_codes=" 
				+ Arrays.stream(getValue())
					.map(type -> type.abbr)
					.reduce("", (p, abbr) -> p + "," + abbr);			
	}

}

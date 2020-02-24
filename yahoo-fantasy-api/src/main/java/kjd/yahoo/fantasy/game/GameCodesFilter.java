package kjd.yahoo.fantasy.game;

import java.util.Arrays;

import kjd.yahoo.fantasy.Filter;
import kjd.yahoo.fantasy.game.GameCode;

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

package kjd.yahoo.fantasy.game;

import java.util.Arrays;

import kjd.yahoo.fantasy.Filter;
import kjd.yahoo.fantasy.game.GameType;

public class GameTypesFilter extends Filter<GameType[]> {

	public GameTypesFilter(GameType[] value) {
		super("game_types", value);
	}

	@Override
	public String apply() {
		return "game_types=" 
				+ Arrays.stream(getValue())
					.map(type -> type.abbr)
					.reduce("", (p, abbr) -> p + "," + abbr);			
	}

}

package kjd.yahoo.fantasy.api.game;

import java.util.Arrays;

import kjd.yahoo.fantasy.api.Filter;
import kjd.yahoo.fantasy.data.game.GameType;

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

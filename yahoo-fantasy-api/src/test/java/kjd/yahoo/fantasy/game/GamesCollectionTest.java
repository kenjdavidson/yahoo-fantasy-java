package kjd.yahoo.fantasy.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import kjd.yahoo.fantasy.filter.BooleanFilter;
import kjd.yahoo.fantasy.game.GameCode;

class GamesCollectionTest {

	@Test
	void test_addGamesCodeFilter() {
		GamesCollection gc = new GamesCollection();
		gc.filter(new GameCodesFilter(GameCode.NFL));
	}
	
	@Test
	void test_invalidGameCodesFilterType() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			GamesCollection gc = new GamesCollection();
			gc.filter(new BooleanFilter("game_codes", true));
		});
	}
	
	@Test
	void test_games_collection() {
		GamesCollection gc = new GamesCollection();
		String url = gc.buildUrl();
		
		assertEquals("https://fantasysports.yahooapis.com/fantasy/v2", url);
	}

}

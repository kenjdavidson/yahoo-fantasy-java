package kjd.yahoo.fantasy.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import kjd.yahoo.fantasy.filter.BooleanFilter;
import kjd.yahoo.fantasy.filter.IntegerFilter;

class GamesCollectionTest {

	@Test
	public void test_resource_filters() {
		GamesCollection gr = new GamesCollection();
		
		assertEquals(5, gr.availableFilters().size());
		
		assertTrue(gr.availableFilters().containsKey("is_available"));
		assertEquals(BooleanFilter.class, gr.availableFilters().get("is_available"));
		
		assertTrue(gr.availableFilters().containsKey("game_codes"));
		assertEquals(GameCodesFilter.class, gr.availableFilters().get("game_codes"));
		
		assertTrue(gr.availableFilters().containsKey("game_types"));
		assertEquals(GameTypesFilter.class, gr.availableFilters().get("game_types"));
		
		assertTrue(gr.availableFilters().containsKey("seasons"));
		assertEquals(IntegerFilter.class, gr.availableFilters().get("seasons"));		
	}
	
	@Test
	void test_add_gamesCodeFilter() {
		GamesCollection gc = new GamesCollection();
		gc.filter(new GameCodesFilter(GameCode.NFL));
	}
	
	@Test
	void test_invalid_gameCodesFilterType() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			GamesCollection gc = new GamesCollection();
			gc.filter(new BooleanFilter("game_codes", true));
		});
	}

}

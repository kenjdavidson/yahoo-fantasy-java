package kjd.yahoo.fantasy.api.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.api.CollectionDeserializationTest;
import kjd.yahoo.fantasy.api.content.GamesContent;
import kjd.yahoo.fantasy.data.game.Game;

class GamesCollectionTest extends CollectionDeserializationTest {

	@Test
	void test_leagueContentDeserialization() throws JsonParseException, JsonMappingException, IOException {
		GamesContent gc = deserialize("nfl_games_collection.xml", GamesContent.class);
				
		assertNotNull(gc);
		assertNotNull(gc.getGames());
		assertEquals(2, gc.getGames().size());
		
		Game game = gc.getGames().get(0);
		assertEquals("396", game.getKey());
		
		game = gc.getGames().get(1);
		assertEquals("371", game.getKey());
	}

}

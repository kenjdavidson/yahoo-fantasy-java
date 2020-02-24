package kjd.yahoo.fantasy.data.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.data.ResourceDeserializationTest;

class GamesCollectionTest extends ResourceDeserializationTest {

	@Test
	void test_leagueContentDeserialization() throws JsonParseException, JsonMappingException, IOException {
		GamesCollection gc = deserialize("nfl_games_collection.xml", GamesCollection.class);
				
		assertNotNull(gc);
		assertNotNull(gc.getGames());
		assertEquals(2, gc.getGames().size());
		
		Game game = gc.getGames().get(0);
		assertEquals("396", game.getKey());
		
		game = gc.getGames().get(1);
		assertEquals("371", game.getKey());
	}

}

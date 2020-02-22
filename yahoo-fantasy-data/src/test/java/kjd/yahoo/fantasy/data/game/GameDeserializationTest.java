package kjd.yahoo.fantasy.data.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import kjd.yahoo.fantasy.data.ResourceDeserializationTest;
import kjd.yahoo.fantasy.data.game.Game;

public class GameDeserializationTest extends ResourceDeserializationTest {
	
	@Test
	public void testDeserialization() throws JsonParseException, JsonMappingException, IOException {
		Game nfl = deserialize("nfl_game.xml", Game.class);
		
		assertEquals("371", nfl.getKey());
		assertEquals(371, nfl.getId());
		assertEquals(GameCode.NFL, nfl.getCode());
		assertEquals(GameType.FULL, nfl.getType());
		assertEquals("https://football.fantasysports.yahoo.com/archive/nfl/2017", nfl.getUrl());
		assertEquals(2017, nfl.getSeason());
		assertTrue(nfl.isRegistrationOver());
		assertTrue(nfl.isGameOver());
		assertTrue(nfl.isOffseason());
	}	
}

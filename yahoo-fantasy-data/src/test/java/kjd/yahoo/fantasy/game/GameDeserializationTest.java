package kjd.yahoo.fantasy.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import kjd.yahoo.fantasy.ResourceDeserializationTest;
import kjd.yahoo.fantasy.game.Game;

public class GameDeserializationTest extends ResourceDeserializationTest {
	
	@Test
	public void game() throws JsonParseException, JsonMappingException, IOException {
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
	
	@Test
	public void gameContent() throws JsonParseException, JsonMappingException, IOException {
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

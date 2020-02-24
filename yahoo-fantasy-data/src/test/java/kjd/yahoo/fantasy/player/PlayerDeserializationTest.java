package kjd.yahoo.fantasy.player;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.ResourceDeserializationTest;

class PlayerDeserializationTest extends ResourceDeserializationTest {

	@Test
	void player_deserialization() throws JsonParseException, JsonMappingException, IOException {
		Player p = deserialize("player.xml", Player.class);
		
		assertNotNull(p);
		assertEquals("Alexander Radulov", p.getName().getFull());
		
		assertNotNull(p.getPlayerStats());
		assertNotNull(p.getPlayerStats().getStats());
		assertEquals(8, p.getPlayerStats().getStats().size());
	}

}

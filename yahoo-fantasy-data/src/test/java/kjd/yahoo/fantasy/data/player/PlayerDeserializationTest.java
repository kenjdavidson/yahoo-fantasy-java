package kjd.yahoo.fantasy.data.player;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.data.ResourceDeserializationTest;

class PlayerDeserializationTest extends ResourceDeserializationTest {

	@Test
	void test_playerDeserialization() throws JsonParseException, JsonMappingException, IOException {
		Player p = deserialize("player_nhl.xml", Player.class);
		
		assertNotNull(p);
	}

}

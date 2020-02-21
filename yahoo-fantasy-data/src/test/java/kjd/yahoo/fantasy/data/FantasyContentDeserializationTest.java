package kjd.yahoo.fantasy.data;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.data.game.Game;

class FantasyContentDeserializationTest extends ResourceDeserializationTest {

	@Test
	void test_leagueContentDeserialization() throws JsonParseException, JsonMappingException, IOException {
		FantasyContent<Game> lc = deserialize("fantasy_content.xml", new TypeReference<FantasyContent<Game>>() {});
				
		assertNotNull(lc);
	}

}

package kjd.yahoo.fantasy.data.team;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.data.ResourceDeserializationTest;
import kjd.yahoo.fantasy.data.team.Team;

class TeamDeserializationTest extends ResourceDeserializationTest {

	@Test
	void testDeserialization() throws JsonParseException, JsonMappingException, IOException {	
		Team t = deserialize("league_nfl.xml", Team.class);
		
		assertEquals("380.l.1055255.t.4", t.getKey());
	}

}

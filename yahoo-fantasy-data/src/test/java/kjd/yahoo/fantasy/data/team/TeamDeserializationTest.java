package kjd.yahoo.fantasy.data.team;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.data.ResourceDeserializationTest;
import kjd.yahoo.fantasy.data.team.Team;

class TeamDeserializationTest extends ResourceDeserializationTest {

	@Test
	void team_deserialization() throws JsonParseException, JsonMappingException, IOException {	
		Team t = deserialize("team.xml", Team.class);
		
		assertNotNull(t);
		assertEquals("396.l.3768.t.7", t.getKey());
		
		assertNotNull(t.getManagers());
		assertNotNull(t.getManagers().get(0));
		assertEquals("Kenneth", t.getManagers().get(0).getNickname());
	}

	@Test
	void team_stats_points_deserialization() throws JsonParseException, JsonMappingException, IOException {
		Team t = deserialize("team_stats.xml", Team.class);
		
		assertNotNull(t);
	}
}

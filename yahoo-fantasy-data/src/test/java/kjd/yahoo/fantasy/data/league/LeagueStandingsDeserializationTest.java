package kjd.yahoo.fantasy.data.league;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.data.ResourceDeserializationTest;

public class LeagueStandingsDeserializationTest extends ResourceDeserializationTest {

	@Test
	public void league_standings_deserialization() throws JsonParseException, JsonMappingException, IOException {
		LeagueStandings s = deserialize("nhl_league_standings.xml", LeagueStandings.class);
		
		assertNotNull(s);
		assertNotNull(s.getTeams());
		assertEquals(14, s.getTeams().size());
	}
}

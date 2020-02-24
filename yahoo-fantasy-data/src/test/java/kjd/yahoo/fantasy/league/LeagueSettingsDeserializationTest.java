package kjd.yahoo.fantasy.league;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.ResourceDeserializationTest;

public class LeagueSettingsDeserializationTest extends ResourceDeserializationTest {

	@Test
	public void league_standings_deserialization() throws JsonParseException, JsonMappingException, IOException {
		LeagueSettings s = deserialize("nhl_league_settings.xml", LeagueSettings.class);
		
		assertNotNull(s);		
		assertNotNull(s.getRosterPositions());
		assertEquals(8, s.getRosterPositions().size());
		
		assertNotNull(s.getStatCategories());		
		assertNotNull(s.getStatCategories().getStats());
		assertEquals(16, s.getStatCategories().getStats().size());
		
		assertNull(s.getStatModifiers());
	}
}

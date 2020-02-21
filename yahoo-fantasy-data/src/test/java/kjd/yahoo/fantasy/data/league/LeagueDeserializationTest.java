package kjd.yahoo.fantasy.data.league;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.data.ResourceDeserializationTest;
import kjd.yahoo.fantasy.data.league.League;
import kjd.yahoo.fantasy.data.league.LeagueSettings;

class LeagueDeserializationTest extends ResourceDeserializationTest {
	
	@Test
	void testDeserialization() throws JsonParseException, JsonMappingException, IOException {		
		League l = deserialize("league_nfl.xml", League.class);
		
		assertEquals("371.l.22626", l.getKey());
		assertEquals(22626, l.getId());
		assertEquals("AWKAWESOME FOOTBALL LEAGUE", l.getName());
		assertEquals("postdraft", l.getDraftStatus());
		assertEquals(12, l.getNumTeams());
		assertEquals("16", l.getEditKey());
		assertEquals(null, l.getWeeklyDeadline());
		assertEquals("head", l.getScoringType());
		assertEquals("private", l.getLeagueType());
		assertFalse(l.isProLeague());
		assertFalse(l.isCashLeague());
		assertEquals(16, l.getCurrentWeek());
		assertEquals(1, l.getStartWeek());
		assertEquals(16, l.getEndWeek());
		assertTrue(l.isFinished());
		assertEquals("nfl", l.getGameCode());
		assertEquals(2017, l.getSeason());
	}

	@Test
	public void test_settingsDeserialization() throws JsonParseException, JsonMappingException, IOException {
		LeagueSettings s = deserialize("settings_nfl.xml", LeagueSettings.class);
		
		assertEquals("live", s.getDraftType());
	}
}

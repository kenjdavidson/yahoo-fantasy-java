package kjd.yahoo.fantasy.league;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import kjd.yahoo.fantasy.ResourceDeserializationTest;

class LeagueDeserializationTest extends ResourceDeserializationTest {
	
	@Test
	void league_deserialization() throws JsonParseException, JsonMappingException, IOException {		
		League l = deserialize("nhl_league.xml", League.class);
		
		assertEquals("396.l.3768", l.getKey());
		assertEquals(3768, l.getId());
		assertEquals("MCS", l.getName());
		assertEquals("postdraft", l.getDraftStatus());
		assertEquals(14, l.getNumTeams());
		assertEquals("2020-02-21", l.getEditKey());
		assertEquals("intraday", l.getWeeklyDeadline());
		assertEquals("head", l.getScoringType());
		assertEquals("private", l.getLeagueType());
		assertFalse(l.isProLeague());
		assertFalse(l.isCashLeague());
		assertEquals(19, l.getCurrentWeek());
		assertEquals(1, l.getStartWeek());		
		assertFalse(l.isFinished());
		assertEquals("nhl", l.getGameCode());
		assertEquals(2019, l.getSeason());
	}

	@Test
	public void leagueSettings_deserialization() throws JsonParseException, JsonMappingException, IOException {
		LeagueSettings s = deserialize("nhl_league_settings.xml", LeagueSettings.class);
		
		assertNotNull(s);
		
		assertEquals("live", s.getDraftType());
		assertEquals(8, s.getRosterPositions().size());
		
	}
}

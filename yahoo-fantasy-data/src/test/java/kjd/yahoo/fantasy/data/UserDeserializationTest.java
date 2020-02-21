package kjd.yahoo.fantasy.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import kjd.yahoo.fantasy.data.user.User;
import kjd.yahoo.fantasy.data.xml.YahooModule;

public class UserDeserializationTest extends ResourceDeserializationTest {
	
	@Test
	public void testDeserialization() throws JsonParseException, JsonMappingException, IOException {				
		User u = deserialize("user.xml", User.class);
		
		assertEquals("HJXEGSOPDMQLLZFJIQ2BCZA3Z4", u.getGuid());
		
		assertNotNull(u.getProfile());
		assertEquals("Kenneth", u.getProfile().getDisplayName());
		assertEquals("https://profiles.sports.yahoo.com/user/HJXEGSOPDMQLLZFJIQ2BCZA3Z4", u.getProfile().getFantasyProfileUrl());
		assertEquals("https://s.yimg.com/ag/images/4587/25272199218_81d057_64sq.jpg", u.getProfile().getImageUrl());
		assertEquals("kenneth-G7BP4", u.getProfile().getUniqueName());
	}
}

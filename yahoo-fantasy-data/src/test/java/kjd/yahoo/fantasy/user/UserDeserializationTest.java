package kjd.yahoo.fantasy.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import kjd.yahoo.fantasy.ResourceDeserializationTest;
import kjd.yahoo.fantasy.user.User;

public class UserDeserializationTest extends ResourceDeserializationTest {
	
	@Test
	public void user_deserialization() throws JsonParseException, JsonMappingException, IOException {				
		User u = deserialize("user_profile.xml", User.class);
		
		assertNotNull(u);
		assertNotNull(u.getProfile());
		assertEquals("Kenneth", u.getProfile().getDisplayName());
		assertEquals("https://profiles.sports.yahoo.com/user/HJXEGSOPDMQLLZFJIQ2BCZA3Z4", u.getProfile().getFantasyProfileUrl());
		assertEquals("https://s.yimg.com/ag/images/4587/25272199218_81d057_64sq.jpg", u.getProfile().getImageUrl());
		assertEquals("kenneth-G7BP4", u.getProfile().getUniqueUsername());
	}
}

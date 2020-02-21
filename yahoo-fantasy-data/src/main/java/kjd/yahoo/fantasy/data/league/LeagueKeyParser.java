package kjd.yahoo.fantasy.data.league;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeagueKeyParser {

	static final String LEAGUE_KEY_PARSER = "^(\\d*).l.(\\d*)$";
	
	static final Pattern PATTERN = Pattern.compile(LEAGUE_KEY_PARSER);
	
	public static final Long getGameId(String key) {		
		return Long.parseLong(match(key).group(1));
	}
	
	public static final Long getLeagueId(String key) {
		return Long.parseLong(match(key).group(2));
	}
	
	private static final Matcher match(String key) {
		Matcher m = PATTERN.matcher(key);
		
		if (!m.matches())
			throw new IllegalArgumentException(key + " does not match expected format");
		
		return m;
	}
}

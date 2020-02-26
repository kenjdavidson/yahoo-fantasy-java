package kjd.yahoo.fantasy.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import kjd.yahoo.fantasy.RequestBuilder;
import kjd.yahoo.fantasy.league.LeaguesCollection;
import kjd.yahoo.fantasy.player.PlayersCollection;
import kjd.yahoo.fantasy.team.TeamsCollection;
import kjd.yahoo.fantasy.user.UsersCollection;

public class GameResourceTest {
	
	@Test
	public void test_resource_filters() {
		GameResource gr = new GameResource();		
		
		assertEquals(0, gr.availableFilters().size());		
	}
	
	@Test
	public void test_gameCodesFilter_illegalArgument() {
		final GameResource gr = new GameResource();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			gr.filter(new GameCodesFilter(GameCode.NFL));
		});
	}
	
	@Test
	public void test_gameTypesFilter_illegalArgument() {
		final GameResource gr = new GameResource();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			gr.filter(new GameTypesFilter(GameType.FULL));
		});
	}	
	
	@ParameterizedTest
	@ValueSource(strings = {"123","456","678"})
	public void test_game_key(String code) {
		GameResource gr = new GameResource();
		
		String expected = "/game/" + code;
		String url = gr.path(code);		
		
		assertEquals(expected, url);
	}
	
	
	@ParameterizedTest
	@EnumSource(GameCode.class)
	void test_game_filter_gamecode(GameCode code) {
		GameResource gr = new GameResource();
		
		String expected = "/game/" + code.abbr;			
		String url = gr.path(code.abbr);
		 		
		assertEquals(expected, url);
	}
	
	@ParameterizedTest
	@MethodSource("providesValidSubresources")
	public void test_valid_subresources(String code, RequestBuilder<?> subresource) {		
		GameResource gr = new GameResource();		
		gr.subresource(subresource);
		
		String expected = "/game/" + code + "/" + subresource.name();
		assertEquals(expected, gr.path(code));
	}
	
	private static Stream<Arguments> providesValidSubresources() {
		return Stream.of(
				Arguments.of("nfl", new LeaguesCollection()),
				Arguments.of("nfl", new PlayersCollection()));
	}
	
	@ParameterizedTest
	@MethodSource("providesInvalidSubresources")
	public void test_invalid_subresources(RequestBuilder<?> subresource) {		
		final GameResource gr = new GameResource();
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			gr.subresource(subresource);
		});									
	}
	
	private static Stream<Arguments> providesInvalidSubresources() {
		return Stream.of(
				Arguments.of(new UsersCollection()),
				Arguments.of(new TeamsCollection()));
	}

}

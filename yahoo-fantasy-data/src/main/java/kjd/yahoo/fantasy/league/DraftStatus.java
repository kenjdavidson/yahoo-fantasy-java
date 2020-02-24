package kjd.yahoo.fantasy.league;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import kjd.yahoo.fantasy.game.GameType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DraftStatus {
	PRE_DRAFT("predraft"),
	POST_DRAFT("postdraft");

	@JsonValue
	public final String value;
	
	public static final DraftStatus[] VALUES = DraftStatus.values();

}

package kjd.yahoo.fantasy.league;

import com.fasterxml.jackson.annotation.JsonValue;

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

package kjd.yahoo.fantasy.data.league;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DraftStatus {
	UNKNOWN(""),
	PRE_DRAFT("predraft"),
	POST_DRAFT("postdraft");
	
	public final String abbr;	
	public static final DraftStatus[] VALUES = DraftStatus.values();
	
	@JsonValue
	@JsonCreator
	public static DraftStatus fromAbbr(String abbr) {
		for (DraftStatus code : VALUES) {
			if (code.getAbbr().equals(abbr)) {
				return code;
			}
		}
		
		return DraftStatus.UNKNOWN;
	}
}

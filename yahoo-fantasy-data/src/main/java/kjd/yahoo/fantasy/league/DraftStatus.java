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
		
		throw new EnumConstantNotPresentException(DraftStatus.class, abbr);
	}
}

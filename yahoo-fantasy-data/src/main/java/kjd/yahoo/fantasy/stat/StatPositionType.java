package kjd.yahoo.fantasy.stat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatPositionType {

	private String positionType;
	
	@JsonProperty("is_only_display_stat")
	private boolean onlyDisplayStat;
	
}

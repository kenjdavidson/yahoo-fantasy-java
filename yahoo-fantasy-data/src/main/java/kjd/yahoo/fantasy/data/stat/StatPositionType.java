package kjd.yahoo.fantasy.data.stat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatPositionType {

	private String positionType;
	
	@JsonProperty(value="is_only_display_stat")
	private boolean onlyDisplayStat;
	
}

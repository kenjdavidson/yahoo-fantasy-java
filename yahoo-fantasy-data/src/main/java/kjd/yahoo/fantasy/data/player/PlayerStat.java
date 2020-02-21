package kjd.yahoo.fantasy.data.player;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerStat {

	@JsonProperty(value="stat_id")
	private long id;
	
	private double value;
	
}

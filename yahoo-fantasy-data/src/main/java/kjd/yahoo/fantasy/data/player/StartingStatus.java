package kjd.yahoo.fantasy.data.player;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Coverage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StartingStatus extends Coverage {

	@JsonProperty(value="is_starting")
	private boolean starting;
}

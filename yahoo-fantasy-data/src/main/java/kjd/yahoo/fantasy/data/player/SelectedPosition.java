package kjd.yahoo.fantasy.data.player;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import kjd.yahoo.fantasy.data.Coverage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectedPosition extends Coverage {
	
	private String position;
	
	@JsonProperty(value="is_flex")
	private boolean flex;
	
}

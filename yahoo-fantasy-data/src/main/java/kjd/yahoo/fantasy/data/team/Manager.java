package kjd.yahoo.fantasy.data.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager {

	@JsonProperty(value="manager_id")
	private long id;
	
	private String nickname;
	
	private String guid;
	
	@JsonProperty(value="is_commissioner")
	private boolean commissioner;
	
	private String email;
	
	private String imageUrl;
	
}

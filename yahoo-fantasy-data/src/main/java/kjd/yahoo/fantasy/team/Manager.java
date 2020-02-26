package kjd.yahoo.fantasy.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager {

	@JsonProperty("manager_id")
	private long id;
	
	private String nickname;
	
	private String guid;
	
	@JsonProperty("is_commissioner")
	private boolean commissioner;
	
	private String email;
	
	private String imageUrl;
	
}

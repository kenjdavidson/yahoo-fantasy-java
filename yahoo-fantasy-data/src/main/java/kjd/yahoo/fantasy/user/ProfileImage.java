package kjd.yahoo.fantasy.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileImage {

	private int height;
	
	private int width;
	
	@JsonProperty(value="imageUrl")
	private int imageUrl;
	
	private String size;
	
}

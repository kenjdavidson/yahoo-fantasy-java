package kjd.yahoo.fantasy.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Profile {

	private String displayName;
	
	private String fantasyProfileUrl;
	
	private String imageUrl;
	
	private String uniqueUsername;
	
}

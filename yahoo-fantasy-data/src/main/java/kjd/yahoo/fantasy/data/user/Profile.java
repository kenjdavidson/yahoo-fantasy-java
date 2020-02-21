package kjd.yahoo.fantasy.data.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Profile {

	private String displayName;
	
	private String fantasyProfileUrl;
	
	private String imageUrl;
	
	private String uniqueName;
	
}

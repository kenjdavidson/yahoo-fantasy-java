package kjd.yahoo.fantasy.data.transaction;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionData {

	private String type;
	
	private String sourceType;
	
	private String sourceTeamKey;
	
	private String sourceTeamName;
	
	private String destinationType;
	
	private String destinationTeamKey;
	
	private String destinationTeamName;
	
}

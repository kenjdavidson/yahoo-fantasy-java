package kjd.yahoo.fantasy.transaction;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * {@link Transaction} resource is used to manage waivers, trades, etc.  The sub-resources available
 * are:
 * <p>
 * <ul>
 *  <li><strong>transaction/${transactionKey};out=metadata</strong> (default)</li>
 * 	<li><strong>transaction/${transactionKey};out=players</strong> (default)</li>
 * </ul>
 * <p>
 * <strong>Filters</strong> available are:
 * <p>
 * <ul>
 * 	<li><strong>type</strong> - add, drop, trade, commish</li>
 * 	<li><strong>types</strong></li>
 * 	<li><strong>team_key</strong></li>
 * 	<li><strong>type with team_key</strong></li>
 * 	<li><strong>count</strong></li>
 * </ul>
 * 
 * @author kdavidson
 *
 */
@Getter
@Setter
public class Transaction {

	@JsonProperty(value="transaction_key")
	private String key;
	
	@JsonProperty(value="transaction_id")
	private long id;
	
	private String type;
	
	private String status;
	
	private Date timestamp;
	
	private List<TransactedPlayer> players;
	
	private String traderTeamKey;
	
	private String traderTeamName;
	
	private String tradeeTeamKey;
	
	private String tradeeTeamName;
	
}

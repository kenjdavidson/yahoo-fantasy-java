package kjd.yahoo.fantasy.transaction;

import kjd.yahoo.fantasy.player.Player;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactedPlayer extends Player {

	private TransactionData transactionData;
	
}

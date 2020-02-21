package kjd.yahoo.fantasy.data.transaction;

import kjd.yahoo.fantasy.data.player.Player;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactedPlayer extends Player {

	private TransactionData transactionData;
	
}

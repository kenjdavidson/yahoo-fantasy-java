package kjd.yahoo.fantasy.api.content;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.transaction.Transaction;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class TransactionsContent extends FantasyContent<Transaction> {

	@XmlElementWrapper(name="transactions")
	private List<Transaction> transactions;
	
}

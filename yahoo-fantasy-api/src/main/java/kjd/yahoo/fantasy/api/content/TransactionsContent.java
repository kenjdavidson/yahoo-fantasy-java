package kjd.yahoo.fantasy.data.transaction;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import kjd.yahoo.fantasy.data.FantasyContent;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class TransactionsCollection extends FantasyContent<TransactionsCollection> {

	@XmlElementWrapper(name="transactions")
	private List<Transaction> transactions;
	
}

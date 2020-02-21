package kjd.yahoo.fantasy.data.transaction;


public enum TransactionType {
	UNKNOWN("n/a"),
	ADD("add"),
	DROP("drop"),
	ADD_DROP("add/drop"),
	TRADE("trade"),
	COMMISH("commish");
	
	public final String code;
	TransactionType(String code) {
		this.code = code;
	}
	
	private static final TransactionType[] VALUES = TransactionType.values();
	public static final TransactionType ofCode(String code) {
		for (TransactionType value : VALUES) {
			if (value.code.equals(code)) {
				return value;
			}
		}
		
		return TransactionType.UNKNOWN;
	}
}

package kjd.yahoo.fantasy.transaction;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TransactionType {
	UNKNOWN("n/a"),
	ADD("add"),
	DROP("drop"),
	ADD_DROP("add/drop"),
	TRADE("trade"),
	COMMISH("commish");

	@JsonValue
	public final String value;
	
	public static final TransactionType[] VALUES = TransactionType.values();

}

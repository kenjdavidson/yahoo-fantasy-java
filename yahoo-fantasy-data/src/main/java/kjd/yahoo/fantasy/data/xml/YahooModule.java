package kjd.yahoo.fantasy.data.xml;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class YahooModule extends SimpleModule {

	private static final long serialVersionUID = 3034221199536201162L;

	public YahooModule() {
		super("YahooFantasyXMLModule");		
		
		// Yahoo transmits booleans as 1/0 
		this.addDeserializer(boolean.class, new IntegerBooleanDeserializer());
		this.addSerializer(boolean.class, new IntegerBooleanSerializer());
		
	}
	
}

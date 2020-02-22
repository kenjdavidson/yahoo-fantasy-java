package kjd.yahoo.fantasy.data.xml;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;

import kjd.yahoo.fantasy.data.game.GameCode;
import kjd.yahoo.fantasy.data.game.GameType;

public class YahooModule extends SimpleModule {

	private static final long serialVersionUID = 3034221199536201162L;

	public YahooModule() {
		super("YahooFantasyXMLModule");		
		
		// Yahoo transmits booleans as 1/0 
		this.addDeserializer(boolean.class, new IntegerBooleanDeserializer());
		this.addSerializer(boolean.class, new IntegerBooleanSerializer());
		
	}
	
}

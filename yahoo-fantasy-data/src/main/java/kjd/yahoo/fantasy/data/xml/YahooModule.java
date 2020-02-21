package kjd.yahoo.fantasy.data.xml;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import kjd.yahoo.fantasy.data.game.GameCode;
import kjd.yahoo.fantasy.data.game.GameType;

public class YahooModule extends SimpleModule {

	private static final long serialVersionUID = 3034221199536201162L;

	public YahooModule() {
		super("YahooFantasyXMLModule");
		
		this.addDeserializer(boolean.class, new IntBooleanDeserializer());
		this.addSerializer(boolean.class, new IntBooleanSerializer());
		
		this.addDeserializer(GameCode.class, new GameCodeDeserializer(GameCode.class));
		this.addDeserializer(GameType.class, new GameTypeDeserializer(GameType.class));
	}
	
}

package kjd.yahoo.fantasy.data.xml;

import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class YahooXmlMapper extends XmlMapper {

	private static final long serialVersionUID = -6609704562997855082L;

	public static final YahooXmlMapper INSTANCE = new YahooXmlMapper();
	
	private YahooXmlMapper() {
		super();
		
		this.registerModule(new YahooModule());
		
		this.configure(Feature.IGNORE_UNKNOWN, true);
	}
}

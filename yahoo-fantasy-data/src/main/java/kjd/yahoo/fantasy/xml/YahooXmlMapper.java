package kjd.yahoo.fantasy.xml;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

public class YahooXmlMapper extends XmlMapper {

	private static final long serialVersionUID = -6609704562997855082L;

	public static final YahooXmlMapper INSTANCE = new YahooXmlMapper();
	
	protected YahooXmlMapper() {
		super();
		
		this.registerModule(new JaxbAnnotationModule());
		this.registerModule(new YahooModule());		
		
		this.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}
}

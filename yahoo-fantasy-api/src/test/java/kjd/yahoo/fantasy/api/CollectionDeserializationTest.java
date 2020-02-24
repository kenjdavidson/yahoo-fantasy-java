package kjd.yahoo.fantasy.api;

import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import kjd.yahoo.fantasy.data.xml.YahooXmlMapper;

public class CollectionDeserializationTest {

	XmlMapper xmlMapper;
	
	@BeforeEach
	public void setupEach() {
		xmlMapper = YahooXmlMapper.INSTANCE;		
	}

	protected <T> T deserialize(String filename, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
		URL resource = this.getClass().getResource(filename);
			
		return xmlMapper.readValue(resource, clazz);
	}
	
	protected <T> T deserialize(String filename, TypeReference<T> ref) throws JsonParseException, JsonMappingException, IOException {
		URL resource = this.getClass().getResource(filename);
			
		return xmlMapper.readValue(resource, ref);
	}
	
	
}

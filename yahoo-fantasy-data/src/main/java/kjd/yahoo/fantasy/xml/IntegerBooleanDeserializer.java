package kjd.yahoo.fantasy.xml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class IntegerBooleanDeserializer extends StdDeserializer<Boolean>{

	private static final long serialVersionUID = -7866671901476034830L;

	public IntegerBooleanDeserializer() {
		super(Boolean.class);
	}
	
	@Override
	public Boolean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		int value = node.asInt();
		return 1 == value;
	}
}

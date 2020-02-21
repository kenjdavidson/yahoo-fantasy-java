package kjd.yahoo.fantasy.data.xml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import kjd.yahoo.fantasy.data.game.GameCode;

public class GameCodeDeserializer extends StdDeserializer<GameCode>{

	private static final long serialVersionUID = 1L;

	protected GameCodeDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public GameCode deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		String abbr = node.asText();
		return GameCode.fromAbbr(abbr);
	}

}

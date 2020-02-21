package kjd.yahoo.fantasy.data.xml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import kjd.yahoo.fantasy.data.game.GameType;

public class GameTypeDeserializer extends StdDeserializer<GameType>{

	private static final long serialVersionUID = -7943659231838323712L;

	protected GameTypeDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public GameType deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		String abbr = node.asText();
		return GameType.fromAbbr(abbr);
	}

}

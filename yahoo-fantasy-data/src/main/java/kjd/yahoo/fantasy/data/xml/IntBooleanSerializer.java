package kjd.yahoo.fantasy.data.xml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class IntBooleanSerializer extends StdSerializer<Boolean> {

	public IntBooleanSerializer() {
		super(Boolean.class);
	}

	@Override
	public void serialize(Boolean value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeString(value ? "1" : "0");
	}
	
}

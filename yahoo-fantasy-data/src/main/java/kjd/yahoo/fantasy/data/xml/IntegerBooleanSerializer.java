package kjd.yahoo.fantasy.data.xml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class IntegerBooleanSerializer extends StdSerializer<Boolean> {

	private static final long serialVersionUID = 6460507632440191630L;

	public IntegerBooleanSerializer() {
		super(Boolean.class);
	}

	@Override
	public void serialize(Boolean value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeString(value ? "1" : "0");
	}
	
}

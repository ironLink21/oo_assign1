package parser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

/**
 * Created by seth on 9/15/16.
 */
public class SafeDeserializer extends StdDeserializer<Integer> {
    public SafeDeserializer() {
        super(Integer.class);
    }

    @Override
    public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        try {
            return Integer.valueOf(jsonParser.getValueAsString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

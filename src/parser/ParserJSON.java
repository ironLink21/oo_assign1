package parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import person.PeopleBucket;
import person.Person;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by seth on 9/15/16.
 */
public class ParserJSON implements Parser {
    @Override
    public PeopleBucket openFile(String location) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

        TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>(){};
        ArrayList<Person> bucketArr = mapper.readValue(new File(location), type);

        return new PeopleBucket(bucketArr);
    }
}

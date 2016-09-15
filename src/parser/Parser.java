package parser;

import person.PeopleBucket;

import java.util.regex.Pattern;

/**
 * Created by seth on 9/15/16.
 */
public interface Parser {

    PeopleBucket openFile(String location) throws Exception;

    public static Parser create(String location) {
        Pattern json = Pattern.compile("(.json)$");
        Pattern xml = Pattern.compile("(.xml)$");

        if(json.matcher(location).find()) {
            return new ParserJSON();

        } else if (xml.matcher(location).find()) {
            return new ParserXML();

        } else {
            return null;
        }
    }
}

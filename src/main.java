import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import matcher.Matcher;
import matcher.MatchesBucket;
import parser.Parser;
import person.PeopleBucket;

import java.io.File;

/**
 * Created by seth on 9/15/16.
 */
public class main {
    public static void main(String[] args) throws Exception {
        File file = new File("documents/test_data/PersonTestSet_01.json");
//        File file = new File("documents/test_data/PersonTestSet_11.xml");

        if(file.exists()) {
            String fileSt = file.getAbsolutePath();
            Parser parser = Parser.create(fileSt);
            Matcher matcher = new Matcher();

            if(parser == null) {
                System.out.print("Incorrect File Type");
                return;
            }

            PeopleBucket bucket = parser.openFile(fileSt);

            // run matchers
            MatchesBucket matchesBucket = matcher.findMatches(bucket);

            // print results
            results print = new results();
            print.print(matchesBucket, "documents/matches.txt");


            System.out.print("finished");
        }
    }
}

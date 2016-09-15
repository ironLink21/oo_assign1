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

            if(parser == null) {
                System.out.print("Incorrect File Type");
                return;
            }

            PeopleBucket bucket = parser.openFile(fileSt);

            // run matchers

            // print results


            System.out.print("finished");
        }
    }
}

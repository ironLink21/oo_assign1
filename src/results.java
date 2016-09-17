import matcher.MatchesBucket;
import person.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Created by seth on 9/16/16.
 */
public class results {

    public void print(MatchesBucket matchesBucket, String outFile) {
        File file = new File(outFile);
        file.getAbsolutePath();

        try {
            FileWriter writer = new FileWriter(outFile, true);
            System.out.print("Matches: ");
            writer.write("Matches: " );

            for(Map.Entry<Person, Person> entry : matchesBucket.getMatchesBucket().entrySet()) {
                System.out.print("[" + entry.getKey().getObjectId() + " , " + entry.getValue().getObjectId() + "]");
                writer.write("[" + entry.getKey().getObjectId() + " , " + entry.getValue().getObjectId() + "]\n");
            }
            writer.close();

        } catch (IOException e ) {
            System.err.print(e.getMessage());
        }
    }
}

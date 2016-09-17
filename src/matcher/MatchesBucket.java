package matcher;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import person.Person;

import java.util.HashMap;

/**
 * Created by seth on 9/15/16.
 */
public class MatchesBucket {
    private HashMap<Person, Person> matchesBucket;


    //    constructor
    public MatchesBucket(){}

    public MatchesBucket(HashMap<Person, Person> matchesBucket) {
        this.matchesBucket = matchesBucket;
    }

    //    getters and setters
    public HashMap<Person, Person> getMatchesBucket() {
        return matchesBucket;
    }

    public void setMatchesBucket(HashMap<Person, Person> matchesBucket) {
        this.matchesBucket = matchesBucket;
    }

    public void addMatch(Person p1, Person p2) {
        this.matchesBucket.put(p1, p2);
    }
}

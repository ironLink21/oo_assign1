package person;

import java.util.ArrayList;

/**
 * Created by seth on 9/15/16.
 */
public class PeopleBucket {
    private ArrayList<Person> peopleBucket;

//    constructor
    public PeopleBucket(ArrayList<Person> peopleBucket) {
        this.peopleBucket = peopleBucket;
    }

//    getters and setters
    public ArrayList<Person> getPeopleBucket() {
        return peopleBucket;
    }

    public void setPeopleBucket(ArrayList<Person> peopleBucket) {
        this.peopleBucket = peopleBucket;
    }

//    other Methods
    public void addPerson(Person person) {
        this.peopleBucket.add(person);
    }
}

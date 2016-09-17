package matcher

import person.Adult
import person.Child

/**
 * Created by seth on 9/16/16.
 */
class MatchID_BirthDateTest extends GroovyTestCase {
    void testMatchID_BirthDate() {
        Adult goodAdult = new Adult(1, "1111 11111", "444-44-4444", "John", "", "Appleseed", "1990", 12, 10, "Male", "888-888-8888", "");
//        Adult badAdult = new Adult("1", 111111111, "444-44-4444", "John", null, "Appleseed", 1990, 12, 10, "Male", "888-888-8888", 1);

        Child goodChild = new Child(2, "1111 11111", "444-44-4444", "John", "", "Appleseed", "1990", 12, 10, "Male", "4444", "yes", 1, "cache", "jenna", "", "manning");
//        Child badChild = new Child(2, "1111 11111", "444-44-4444", "John", "", "Appleseed", "1990", "12", "10", "Male", "4444", java.lang.Boolean.FALSE, "1", "cache", "jenna", "", "manning");

        MatchID_BirthDate test = new MatchID_BirthDate();
        test.matching(goodAdult,goodAdult);



    }
}

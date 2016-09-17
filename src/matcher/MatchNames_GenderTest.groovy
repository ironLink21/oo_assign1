package matcher

import person.Adult
import person.Child

import static java.lang.Boolean.FALSE
import static java.lang.Boolean.TRUE

/**
 * Created by seth on 9/16/16.
 */
class MatchNames_GenderTest extends GroovyTestCase {
    void testMatchNames_Gender() {
        Adult Adult1 = new Adult(1, "1111 11111", "444-44-4444", "John", "", "Appleseed", "1990", 12, 10, "Male", "888-888-8888", "");
        Adult Adult2 = new Adult(2, "2222 22222", "888-88-8888", "Bob", "all", "right", "1991", 13, 11, "Male", "888-888-8888", "");

        Child Child1 = new Child(2, "1111 11111", "444-44-4444", "John", "", "Appleseed", "1990", 12, 10, "Male", "4444", "yes", 1, "cache", "jenna", "", "manning");
        Child Child2 = new Child(2, "3333 33333", "888-88-8888", "Jerry", "", "Thomas", "1995", 11, 9, "Male", "5556", "no", 0, "cache", "jenna", "", "manning");

        MatchNames_Gender test = new MatchNames_Gender();

        Boolean result = test.matching(Adult1,Adult1);
        assert result == TRUE;

        result = test.matching(Adult1,Adult2);
        assert !result == FALSE;

        result = test.matching(Child1,Child1);
        assert result == TRUE;

        result = test.matching(Child1,Child2);
        assert !result == FALSE;

    }
}

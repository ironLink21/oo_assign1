package matcher;

import person.Adult;
import person.Child;
import person.Person;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by seth on 9/16/16.
 */
public class MatchID_Names {
    Boolean StateFileNum = FALSE, SSN = FALSE, birthCounty = FALSE, firstName = FALSE, lastName = FALSE, gender = FALSE;

    public MatchID_Names() {
    }

    public Boolean matchID_Names(Person p1, Person p2) {

        if(p1 instanceof Child && p2 instanceof Child) {
            if(p1.getStateFileNumber() != null && p2.getStateFileNumber() != null && p1.getStateFileNumber().equals(p2.getStateFileNumber())) {
                StateFileNum = TRUE;
            }

            if(p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null && p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber())) {
                SSN = TRUE;
            }

            if(((Child) p1).getBirthCounty() != null && ((Child) p2).getBirthCounty() != null && ((Child) p1).getBirthCounty().equals(((Child) p2).getBirthCounty())) {
                birthCounty = TRUE;
            }

            if(p1.getFirstName() != null && p2.getFirstName() != null && p1.getFirstName().equals(p2.getFirstName())) {
                firstName = TRUE;
            }

            if(p1.getLastName() != null && p2.getLastName() != null && p1.getLastName().equals(p2.getLastName())) {
                lastName = TRUE;
            }

            if(p1.getGender() != null && p2.getGender() != null && p1.getGender().equals(p2.getGender())) {
                gender = TRUE;
            }

        } else if (p1 instanceof Adult && p2 instanceof Adult) {
            if(p1.getStateFileNumber() != null && p2.getStateFileNumber() != null && p1.getStateFileNumber().equals(p2.getStateFileNumber())) {
                StateFileNum = TRUE;
            }

            if(p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null && p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber())) {
                SSN = TRUE;
            }

            if(p1.getFirstName() != null && p2.getFirstName() != null && p1.getFirstName().equals(p2.getFirstName())) {
                firstName = TRUE;
            }

            if(p1.getLastName() != null && p2.getLastName() != null && p1.getLastName().equals(p2.getLastName())) {
                lastName = TRUE;
            }

            if(p1.getGender() != null && p2.getGender() != null && p1.getGender().equals(p2.getGender())) {
                gender = TRUE;
            }
        }

        if( StateFileNum || SSN || birthCounty || firstName || lastName || gender ) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}

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
            if(p1.getStateFileNumber().equals(p2.getStateFileNumber()) && p1.getStateFileNumber() != null && p2.getStateFileNumber() != null) {
                StateFileNum = TRUE;
            }

            if(p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber()) && p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null) {
                SSN = TRUE;
            }

            if(((Child) p1).getBirthCounty().equals(((Child) p2).getBirthCounty()) && ((Child) p1).getBirthCounty() != null && ((Child) p2).getBirthCounty() != null) {
                birthCounty = TRUE;
            }

            if(p1.getFirstName().equals(p2.getFirstName()) && p1.getFirstName() != null && p2.getFirstName() != null) {
                firstName = TRUE;
            }

            if(p1.getLastName().equals(p2.getLastName()) && p1.getLastName() != null && p2.getLastName() != null) {
                lastName = TRUE;
            }

            if(p1.getGender().equals(p2.getGender()) && p1.getGender() != null && p2.getGender() != null) {
                gender = TRUE;
            }

        } else if (p1 instanceof Adult && p2 instanceof Adult) {
            if(p1.getStateFileNumber().equals(p2.getStateFileNumber()) && p1.getStateFileNumber() != null && p2.getStateFileNumber() != null) {
                StateFileNum = TRUE;
            }

            if(p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber()) && p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null) {
                SSN = TRUE;
            }

            if(p1.getFirstName().equals(p2.getFirstName()) && p1.getFirstName() != null && p2.getFirstName() != null) {
                firstName = TRUE;
            }

            if(p1.getLastName().equals(p2.getLastName()) && p1.getLastName() != null && p2.getLastName() != null) {
                lastName = TRUE;
            }

            if(p1.getGender().equals(p2.getGender()) && p1.getGender() != null && p2.getGender() != null) {
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

package matcher;

import person.Adult;
import person.Child;
import person.Person;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by seth on 9/16/16.
 */
public class MatchNames_Gender {
    Boolean SSN = FALSE, motherFirst = FALSE, motherLast = FALSE, firstName = FALSE, lastName = FALSE, gender = FALSE;

    public MatchNames_Gender() {
    }

    public Boolean matchNames_Gender(Person p1, Person p2) {

        if(p1 instanceof Child && p2 instanceof Child) {
            if(p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber()) && p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null) {
                SSN = TRUE;
            }

            if(((Child) p1).getMotherFirstName().equals(((Child) p2).getMotherFirstName()) && ((Child) p1).getMotherFirstName() != null && ((Child) p2).getMotherFirstName() != null) {
                motherFirst = TRUE;
            }

            if(((Child) p1).getMotherLastName().equals(((Child) p2).getMotherLastName()) && ((Child) p1).getMotherLastName() != null && ((Child) p2).getMotherLastName() != null) {
                motherLast = TRUE;
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

        if( SSN || motherFirst || motherLast || firstName || lastName || gender ) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}

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
    Boolean SSN = FALSE, motherFirst = FALSE, motherLast = FALSE, firstName = FALSE, lastName = FALSE, gender = FALSE, phone2 = FALSE;

    public MatchNames_Gender() {
    }

    public Boolean matchNames_Gender(Person p1, Person p2) {

        if(p1 instanceof Child && p2 instanceof Child) {
            if(p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null && p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber())) {
                SSN = TRUE;
            }

            if(((Child) p1).getMotherFirstName() != null && ((Child) p2).getMotherFirstName() != null && ((Child) p1).getMotherFirstName().equals(((Child) p2).getMotherFirstName())) {
                motherFirst = TRUE;
            }

            if(((Child) p1).getMotherLastName() != null && ((Child) p2).getMotherLastName() != null && ((Child) p1).getMotherLastName().equals(((Child) p2).getMotherLastName())) {
                motherLast = TRUE;
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

            if(((Adult) p1).getPhone2() != null && ((Adult) p2).getPhone2() != null && ((Adult) p1).getPhone2().equals(((Adult) p2).getPhone2())) {
                phone2 = TRUE;
            }
        }

        if( SSN || motherFirst || motherLast || firstName || lastName || gender ) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}

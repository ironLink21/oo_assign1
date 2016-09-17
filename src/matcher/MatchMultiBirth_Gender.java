package matcher;

import person.Adult;
import person.Child;
import person.Person;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by seth on 9/16/16.
 */
public class MatchMultiBirth_Gender implements Strategy{
    Boolean StateFileNum = FALSE, SSN = FALSE, multiBirth = FALSE, birthOrder = FALSE, firstName = FALSE, lastName = FALSE, gender = FALSE, phone1 = FALSE, phone2 = FALSE;

    public MatchMultiBirth_Gender() {
    }

    @Override
    public Boolean matching(Person p1, Person p2) {
        if(p1 instanceof Child && p2 instanceof Child) {
            if(p1.getStateFileNumber() != null && p2.getStateFileNumber() != null && p1.getStateFileNumber().equals(p2.getStateFileNumber())) {
                StateFileNum = TRUE;
            }

            if(p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null && p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber())) {
                SSN = TRUE;
            }

            if(((Child) p1).getIsPartOfMultipleBirth() != null && ((Child) p2).getIsPartOfMultipleBirth() != null && ((Child) p1).getIsPartOfMultipleBirth().equals(((Child) p2).getIsPartOfMultipleBirth())) {
                multiBirth = TRUE;
            }

            if(((Child) p1).getBirthOrder() != null && ((Child) p2).getBirthOrder() != null && ((Child) p1).getBirthOrder().equals(((Child) p2).getBirthOrder())) {
                birthOrder = TRUE;
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

            if(((Adult) p1).getPhone1() != null && ((Adult) p2).getPhone1() != null && ((Adult) p1).getPhone1().equals(((Adult) p2).getPhone1())) {
                phone1 = TRUE;
            }

            if(((Adult) p1).getPhone2() != null && ((Adult) p2).getPhone2() != null && ((Adult) p1).getPhone2().equals(((Adult) p2).getPhone2())) {
                phone2 = TRUE;
            }
        }

        if( StateFileNum || SSN || multiBirth || birthOrder || firstName || lastName || gender || phone1 || phone2) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}

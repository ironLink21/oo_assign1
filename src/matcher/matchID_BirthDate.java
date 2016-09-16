package matcher;

import person.Adult;
import person.Child;
import person.Person;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by seth on 9/15/16.
 */
public class matchID_BirthDate {
    Boolean StateFileNum = FALSE, SSN = FALSE, newBornNum = FALSE, bDay = FALSE, bMonth = FALSE, bYear = FALSE, phone1 = FALSE;

    public Boolean matchID_BirthDate(Person p1, Person p2) {

        if(p1 instanceof Child && p2 instanceof Child) {
            if(p1.getStateFileNumber().equals(p2.getStateFileNumber()) && p1.getStateFileNumber() != null && p2.getStateFileNumber() != null) {
                StateFileNum = TRUE;
            }

            if(p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber()) && p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null) {
                SSN = TRUE;
            }

            if(((Child) p1).getNewbornScreeningNumber().equals(((Child) p2).getNewbornScreeningNumber()) && ((Child) p1).getNewbornScreeningNumber() != null && ((Child) p2).getNewbornScreeningNumber() != null) {
                newBornNum = TRUE;
            }

            if(p1.getBirthDay().equals(p2.getBirthDay()) && p1.getBirthDay() != null && p2.getBirthDay() != null) {
                bDay = TRUE;
            }

            if(p1.getBirthMonth().equals(p2.getBirthMonth()) && p1.getBirthMonth() != null && p2.getBirthMonth() != null) {
                bMonth = TRUE;
            }

            if(p1.getBirthYear().equals(p2.getBirthYear()) && p1.getBirthYear() != null && p2.getBirthYear() != null) {
                bYear = TRUE;
            }

        } else if (p1 instanceof Adult && p2 instanceof Adult) {
            if(p1.getStateFileNumber().equals(p2.getStateFileNumber()) && p1.getStateFileNumber() != null && p2.getStateFileNumber() != null) {
                StateFileNum = TRUE;
            }

            if(p1.getSocialSecurityNumber().equals(p2.getSocialSecurityNumber()) && p1.getSocialSecurityNumber() != null && p2.getSocialSecurityNumber() != null) {
                SSN = TRUE;
            }

            if(((Adult) p1).getPhone1().equals(((Adult) p2).getPhone1()) && ((Adult) p1).getPhone1() != null && ((Adult) p2).getPhone1() != null) {
                phone1 = TRUE;
            }

            if(p1.getBirthDay().equals(p2.getBirthDay()) && p1.getBirthDay() != null && p2.getBirthDay() != null) {
                bDay = TRUE;
            }

            if(p1.getBirthMonth().equals(p2.getBirthMonth()) && p1.getBirthMonth() != null && p2.getBirthMonth() != null) {
                bMonth = TRUE;
            }

            if(p1.getBirthYear().equals(p2.getBirthYear()) && p1.getBirthYear() != null && p2.getBirthYear() != null) {
                bYear = TRUE;
            }
        }

        if( StateFileNum || SSN || newBornNum || bDay || bMonth || bYear || phone1 ) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}

package matcher;

import person.Adult;
import person.Child;
import person.Person;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by seth on 9/16/16.
 */
public class MatchMotherName_BirthDate implements Strategy {
    Boolean StateFileNum = FALSE, motherFirst = FALSE, motherLast = FALSE, bDay = FALSE, bMonth = FALSE, bYear = FALSE;

    public MatchMotherName_BirthDate() {
    }

    @Override
    public Boolean matching(Person p1, Person p2) {
        if(p1 instanceof Child && p2 instanceof Child) {
            if(p1.getStateFileNumber() != null && p2.getStateFileNumber() != null && p1.getStateFileNumber().equals(p2.getStateFileNumber())) {
                StateFileNum = TRUE;
            }

            if(((Child) p1).getMotherFirstName() != null && ((Child) p2).getMotherFirstName() != null && ((Child) p1).getMotherFirstName().equals(((Child) p2).getMotherFirstName())) {
                motherFirst = TRUE;
            }

            if(((Child) p1).getMotherLastName() != null && ((Child) p2).getMotherLastName() != null && ((Child) p1).getMotherLastName().equals(((Child) p2).getMotherLastName())) {
                motherLast = TRUE;
            }

            if(p1.getBirthDay() != null && p2.getBirthDay() != null && p1.getBirthDay().equals(p2.getBirthDay())) {
                bDay = TRUE;
            }

            if(p1.getBirthMonth() != null && p2.getBirthMonth() != null && p1.getBirthMonth().equals(p2.getBirthMonth())) {
                bMonth = TRUE;
            }

            if(p1.getBirthYear() != null && p2.getBirthYear() != null && p1.getBirthYear().equals(p2.getBirthYear())) {
                bYear = TRUE;
            }

        } else if (p1 instanceof Adult && p2 instanceof Adult) {
            if(p1.getStateFileNumber() != null && p2.getStateFileNumber() != null && p1.getStateFileNumber().equals(p2.getStateFileNumber())) {
                StateFileNum = TRUE;
            }

            if(p1.getBirthDay() != null && p2.getBirthDay() != null && p1.getBirthDay().equals(p2.getBirthDay())) {
                bDay = TRUE;
            }

            if(p1.getBirthMonth() != null && p2.getBirthMonth() != null && p1.getBirthMonth().equals(p2.getBirthMonth())) {
                bMonth = TRUE;
            }

            if(p1.getBirthYear() != null && p2.getBirthYear() != null && p1.getBirthYear().equals(p2.getBirthYear())) {
                bYear = TRUE;
            }
        }

        if( StateFileNum || motherFirst || motherLast || bDay || bMonth || bYear ) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}

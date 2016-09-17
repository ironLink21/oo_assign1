package matcher;

import person.Adult;
import person.Child;
import person.PeopleBucket;
import person.Person;

import java.util.HashMap;

/**
 * Created by seth on 9/15/16.
 */
public interface Strategy {

    MatchesBucket matching(PeopleBucket bucket);

    public static MatchesBucket create(PeopleBucket bucket) {
        HashMap pairs = new HashMap();
        MatchID_BirthDate matchID_BirthDate = new MatchID_BirthDate();
        MatchMotherName_BirthDate matchMotherName_BirthDate = new MatchMotherName_BirthDate();
        MatchNames_Gender matchNames_Gender = new MatchNames_Gender();
        MatchID_Names matchID_Names = new MatchID_Names();
        MatchMultiBirth_Gender matchMultiBirth_Gender = new MatchMultiBirth_Gender();

        int size = bucket.getPeopleBucket().size();
        for (int i = 0; i < size; i++) {
            Person p1 = bucket.getPeopleBucket().get(i);
            for (int j = 0; j < size; j++) {
                Person p2 = bucket.getPeopleBucket().get(j);

                if(p1 instanceof Child && p2 instanceof Child) {
                    if (p1.getStateFileNumber() != null || p1.getSocialSecurityNumber() != null || ((Child) p1).getNewbornScreeningNumber() != null &&
                            p2.getStateFileNumber() != null || p2.getSocialSecurityNumber() != null || ((Child) p2).getNewbornScreeningNumber() != null &&
                            p1.getBirthDay() != null || p1.getBirthMonth() != null || p1.getBirthYear() != null &&
                            p2.getBirthDay() != null || p2.getBirthMonth() != null || p2.getBirthYear() != null) {
                        if(matchID_BirthDate.matchID_BirthDate(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getStateFileNumber() != null || ((Child) p1).getMotherFirstName() != null || ((Child) p1).getMotherLastName() != null &&
                            p2.getStateFileNumber() != null || ((Child) p2).getMotherFirstName() != null || ((Child) p1).getMotherLastName() != null &&
                            p1.getBirthDay() != null || p1.getBirthMonth() != null || p1.getBirthYear() != null &&
                            p2.getBirthDay() != null || p2.getBirthMonth() != null || p2.getBirthYear() != null) {
                        if(matchMotherName_BirthDate.MatchMotherName_BirthDate(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getSocialSecurityNumber() != null || ((Child) p1).getMotherFirstName() != null || ((Child) p1).getMotherLastName() != null &&
                            p2.getSocialSecurityNumber() != null || ((Child) p2).getMotherFirstName() != null || ((Child) p1).getMotherLastName() != null &&
                            p1.getFirstName() != null || p1.getLastName() != null || p1.getGender() != null &&
                            p2.getFirstName() != null || p2.getLastName() != null || p2.getGender() != null) {
                        if(matchNames_Gender.matchNames_Gender(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getStateFileNumber() != null || p1.getSocialSecurityNumber() != null || ((Child) p1).getBirthCounty() != null &&
                            p2.getStateFileNumber() != null || p2.getSocialSecurityNumber() != null || ((Child) p2).getBirthCounty() != null &&
                            p1.getFirstName() != null || p1.getLastName() != null || p1.getGender() != null &&
                            p2.getFirstName() != null || p2.getLastName() != null || p2.getGender() != null) {
                        if(matchID_Names.matchID_Names(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getStateFileNumber() != null || p1.getSocialSecurityNumber() != null || ((Child) p1).getIsPartOfMultipleBirth() != null || ((Child) p1).getBirthOrder() != null &&
                            p2.getStateFileNumber() != null || p2.getSocialSecurityNumber() != null || ((Child) p2).getIsPartOfMultipleBirth() != null || ((Child) p2).getBirthOrder() != null &&
                            p1.getFirstName() != null || p1.getLastName() != null || p1.getGender() != null &&
                            p2.getFirstName() != null || p2.getLastName() != null || p2.getGender() != null) {
                        if(matchMultiBirth_Gender.matchMultiBirth_Gender(p1,p2)) {
                            pairs.put(p1,p2);
                        }
                    }

                } else if (p1 instanceof Adult && p2 instanceof Adult) {
                    if (p1.getStateFileNumber() != null || p1.getSocialSecurityNumber() != null || ((Adult) p1).getPhone1() != null &&
                            p2.getStateFileNumber() != null || p2.getSocialSecurityNumber() != null || ((Adult) p2).getPhone1() != null &&
                            p1.getBirthDay() != null || p1.getBirthMonth() != null || p1.getBirthYear() != null &&
                            p2.getBirthDay() != null || p2.getBirthMonth() != null || p2.getBirthYear() != null) {
                        if(matchID_BirthDate.matchID_BirthDate(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getStateFileNumber() != null &&
                            p2.getStateFileNumber() != null &&
                            p1.getBirthDay() != null || p1.getBirthMonth() != null || p1.getBirthYear() != null &&
                            p2.getBirthDay() != null || p2.getBirthMonth() != null || p2.getBirthYear() != null) {
                        if(matchMotherName_BirthDate.MatchMotherName_BirthDate(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getStateFileNumber() != null || p1.getSocialSecurityNumber() != null || ((Adult) p1).getPhone2() != null &&
                            p2.getStateFileNumber() != null || p2.getSocialSecurityNumber() != null || ((Adult) p2).getPhone2() != null &&
                            p1.getFirstName() != null || p1.getLastName() != null || p1.getGender() != null &&
                            p2.getFirstName() != null || p2.getLastName() != null || p2.getGender() != null) {
                        if(matchNames_Gender.matchNames_Gender(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getStateFileNumber() != null || p1.getSocialSecurityNumber() != null &&
                            p2.getStateFileNumber() != null || p2.getSocialSecurityNumber() != null &&
                            p1.getFirstName() != null || p1.getLastName() != null || p1.getGender() != null &&
                            p2.getFirstName() != null || p2.getLastName() != null || p2.getGender() != null) {
                        if(matchID_Names.matchID_Names(p1,p2)) {
                            pairs.put(p1,p2);
                        }

                    } else if (p1.getStateFileNumber() != null || p1.getSocialSecurityNumber() != null || ((Adult) p1).getPhone1() != null || ((Adult) p1).getPhone2() != null &&
                            p2.getStateFileNumber() != null || p2.getSocialSecurityNumber() != null || ((Adult) p2).getPhone1() != null || ((Adult) p2).getPhone2() != null &&
                            p1.getFirstName() != null || p1.getLastName() != null || p1.getGender() != null &&
                            p2.getFirstName() != null || p2.getLastName() != null || p2.getGender() != null) {
                        if(matchMultiBirth_Gender.matchMultiBirth_Gender(p1,p2)) {
                            pairs.put(p1,p2);
                        }
                    }
                }
            }
        }

        return new MatchesBucket(pairs);
    }
}

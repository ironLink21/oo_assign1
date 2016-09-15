package matcher;

import person.PeopleBucket;

import java.util.HashMap;

/**
 * Created by seth on 9/15/16.
 */
public interface Strategy {

    MatchesBucket matching(PeopleBucket bucket);

    public static MatchesBucket create(PeopleBucket bucket) {
        HashMap pairs = new HashMap();
//        TODO: choose which matcher to use, based upon the Person fields that aren't null
        int size = bucket.getPeopleBucket().size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                






            }
        }

        return new MatchesBucket(pairs);
    }
}

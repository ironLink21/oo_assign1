package matcher;

import person.PeopleBucket;

/**
 * Created by seth on 9/15/16.
 */
public class Matcher {
    public Matcher() {}

    public MatchesBucket findMatches(PeopleBucket peopleBucket) {
        MatchesBucket bucket = Strategy.create(peopleBucket);
        return bucket;
    }
}

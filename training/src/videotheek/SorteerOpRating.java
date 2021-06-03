package videotheek;

import java.util.Comparator;

public class SorteerOpRating implements Comparator<Media> {


    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getRating() > o2.getRating()) {
            return -1;
        }
        if (o1.getRating() < o2.getRating()) {
            return 1;
        }
        else return 0;
    }
}

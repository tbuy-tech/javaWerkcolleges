package videotheek;

import java.util.Comparator;

public class SorteerOpTitel implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {

        return o1.getTitel().compareTo(o2.getTitel());
    }
}

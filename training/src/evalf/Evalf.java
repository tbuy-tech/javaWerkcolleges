package evalf;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class Evalf {

    List<Message> Screens =  new ArrayList<>();

    public abstract void post();

    public abstract void abort();

}

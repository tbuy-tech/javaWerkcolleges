package oefening1;

public abstract class NonFictie extends Boek {
    public NonFictie(String titel) {
        super(titel);
    }

    @Override
    public int compareTo(Boek o) {
        return super.compareTo(o);
    }
}

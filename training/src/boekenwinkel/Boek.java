package boekenwinkel;

public abstract class Boek {
    private String titel;
    private final int ISBNNummer;

    public Boek(String titel) {
        this.titel = titel;
        this.ISBNNummer = hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boek boek = (Boek) o;

        if (ISBNNummer != boek.ISBNNummer) return false;
        return titel.equals(boek.titel);
    }

    @Override
    public int hashCode() {
        int result = titel != null ? titel.hashCode() : 0;
        result = 31 * result + ISBNNummer;
        return result;
    }

    @Override
    public String toString() {
        return "Boek: " +
                "'" + titel + '\'' +
                ", ISBNNummer=" + ISBNNummer;
    }
}

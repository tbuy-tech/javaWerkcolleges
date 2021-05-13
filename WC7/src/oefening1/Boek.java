package oefening1;

public abstract class Boek implements Comparable<Boek>{
    private String titel;
    private int isbn;
    private static int aantalBoeken = 0;

    public Boek(String titel) {
        this.titel = titel;
        aantalBoeken++;
        this.isbn = hashCode();
    }





    public String getTitel() {
        return titel;
    }

    public int getIsbn() {
        return isbn;
    }

    public static int getAantalBoeken() {
        return aantalBoeken;
    }

    @Override
    public String toString() {
        return "Boek{" +
                "titel='" + titel + '\'' +
                ", isbn=" + isbn +
                '}';
    }


    @Override
    public int compareTo(Boek o) {
        if (this.isbn > o.isbn) {
            return 1;
        } else if (this.isbn == o.isbn){
            return 0;
        }
        return -1;
    }
    /*@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }
        Boek b = (Boek)o;

        if (this.isbn == b.isbn && this.titel.equals(b.titel)){
            return true;
        } else {
            return false;

        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boek boek = (Boek) o;

        if (isbn != boek.isbn) return false;
        return titel != null ? titel.equals(boek.titel) : boek.titel == null;
    }

    @Override
    public int hashCode() {
        int result = titel != null ? titel.hashCode() : 0;
        result = 31 * result + isbn;
        return result;
    }

    public int length() {
        return titel.length();
    }
}

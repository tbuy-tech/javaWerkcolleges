package luchthaven;

enum Type {
    MAALTIJD, FRISDRANK, ALCOHOL
}
public class Waardebon {
    private Type type;
    private int idNummer;

    public Waardebon(Type type) {
        this.type = type;
        this.idNummer = this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Waardebon waardebon = (Waardebon) o;

        if (idNummer != waardebon.idNummer) return false;
        return type == waardebon.type;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + idNummer;
        return result;
    }
}

package videotheek;

public abstract class Media implements Comparable{
    private String titel;
    private String beschrijving;
    private double rating;

    public Media(String titel, String beschrijving, double rating) {
        this.titel = titel;
        this.beschrijving = beschrijving;
        this.rating = rating;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        }


        Media media = (Media) o;
        if (this.titel == null) {
            if (media.titel != null) {
                return -1;
            } else {
                return 0;
            }
        }
        return this.titel.compareTo(media.titel);
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Media: " + titel + " - " + beschrijving +
                " - " + rating;
    }
}

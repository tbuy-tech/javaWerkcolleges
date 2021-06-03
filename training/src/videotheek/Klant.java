package videotheek;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Klant extends SorteerOpRating{
    private String naam;
    private Map<Film, LocalDate> verhuurdeFilms;
    private Map<Game, LocalDate> verhuurdeGames;

    public Klant(String naam) {
        this.naam = naam;
        this.verhuurdeFilms = new HashMap<>();
        this.verhuurdeGames = new HashMap<>();
    }


    public void huur(Film film) {
        verhuurdeFilms.put(film, LocalDate.now());
    }
    public void huur(Game game) {
        verhuurdeGames.put(game, LocalDate.now());
    }

    public void inlevering(Film film) throws NoSuchItemException, TooLateException {
        if (verhuurdeFilms.containsKey(film) && LocalDate.now().isBefore(verhuurdeFilms.get(film).plusDays(21))) {
            verhuurdeFilms.remove(film);

        }
        else if(!verhuurdeFilms.containsKey(film)) {
            throw new NoSuchItemException("Geen item gevonden.");
        }
        else if (!LocalDate.now().isBefore(verhuurdeFilms.get(film).plusDays(21))) {
            throw new TooLateException("Geen item gevonden.");
        }
    }

    public void inlevering(Game game) throws NoSuchItemException, TooLateException {
        if (verhuurdeGames.containsKey(game) && LocalDate.now().isBefore(verhuurdeGames.get(game).plusDays(21))) {
            verhuurdeGames.remove(game);

        }
        else if(!verhuurdeGames.containsKey(game)) {
            throw new NoSuchItemException("Geen item gevonden.");
        }
        else if (!LocalDate.now().isBefore(verhuurdeGames.get(game).plusDays(21))) {
            throw new TooLateException("Geen item gevonden.");
        }
    }




    public void save() throws IOException {
        FileWriter writer = new FileWriter("training/files/media.txt", true);
        for (Map.Entry<Film, LocalDate> entry : verhuurdeFilms.entrySet()) {
            writer.write(entry.getKey().toString());
            writer.write(" | ");
            writer.write(String.valueOf(entry.getValue()));
            writer.write("\r\n");
        }
        for (Map.Entry<Game, LocalDate> entry : verhuurdeGames.entrySet()) {
            writer.write(entry.getKey().toString());
            writer.write(" | ");
            writer.write(String.valueOf(entry.getValue()));
            writer.write("\r\n");
        }
        writer.close();
    }

    public Map<Film, LocalDate> getVerhuurdeFilms() {
        return verhuurdeFilms;
    }

    public Map<Game, LocalDate> getVerhuurdeGames() {
        return verhuurdeGames;
    }

    public String sorteerOpRating2() {
        String lijstOpRating = "";

        TreeMap<Film, LocalDate> sortedFilmMap = new TreeMap<>(new CustomComparator());
        sortedFilmMap.putAll(verhuurdeFilms);
        TreeMap<Game, LocalDate> sortedGameMap = new TreeMap<>(new CustomComparator());
        sortedGameMap.putAll(verhuurdeGames);

        for (Map.Entry<Film, LocalDate> entry :sortedFilmMap.entrySet()) {
          lijstOpRating += entry.getKey().toString();
        lijstOpRating += "\r\n";
        }
        for (Map.Entry<Film, LocalDate> entry :sortedFilmMap.entrySet()) {
            lijstOpRating += entry.getKey().toString();
            lijstOpRating += "\r\n";
        }
        return lijstOpRating;
    }

    public ArrayList<String> sorteerOpTitel() {
        ArrayList<String> lijstOpTitel = new ArrayList<>();

        ArrayList<Media> sortedKeys = new ArrayList<>(this.verhuurdeFilms.keySet());
        sortedKeys.addAll(verhuurdeGames.keySet());


        Collections.sort(sortedKeys, new SorteerOpTitel());

        for (Media media : sortedKeys) {
            lijstOpTitel.add(media.toString());
        }

        return lijstOpTitel;
    }

    public String getNaam() {
        return naam;
    }

    private class CustomComparator implements Comparator<Media> {
        @Override
        public int compare(Media o1, Media o2) {
            return (int) Math.round(o1.getRating() - o2.getRating());
        }
    }
}

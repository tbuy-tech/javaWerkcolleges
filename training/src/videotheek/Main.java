package videotheek;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> talen = new HashSet<>();
        talen.add("NL");
        talen.add("EN");
        talen.add("FR");
        talen.add("ES");
        Film film1 = new Film("Zorro", "Mexican/texan hero saving the day.", 6.8, "Random Dude", talen);
        Film film2 = new Film("LOTR", "High fantasy about middle earth", 10, "Random Dude", talen);
        Film film3 = new Film("Dumb and dumber", "Generic comedy", 0, "Random Dude", talen);
        Game game1 = new Game("GTAIV", "Open world game", (float) 8.8, "Rockstar");
        Game game2 = new Game("GTAV", "Open world game", (float) 7.8, "Rockstar");
        Game game3 = new Game("Skyrim", "Medieval fantasy.", (float) 5.8, "Betsheda");


        Klant klant1 = new Klant("Piet");
        klant1.huur(film1);
        klant1.huur(film2);
        klant1.huur(film3);
        klant1.huur(game1);
        klant1.huur(game2);
        klant1.huur(game3);

        Klant klant2 = new Klant("Jan");
        klant2.huur(film1);
        klant2.huur(film2);
        klant2.huur(film3);

        Klant klant3 = new Klant("Tom");
        klant3.huur(film1);
        klant3.huur(film2);


        Klant klant4 = new Klant("Steve");
        klant4.huur(film2);
        klant4.huur(film3);

        try {
            klant2.save();
        } catch (IOException e) {
            e.printStackTrace();
        }

        klant2.sorteerOpRating2();
        klant2.sorteerOpTitel();



        VideotheekSingleton.getInstance().add(klant1);
        VideotheekSingleton.getInstance().add(klant2);
        VideotheekSingleton.getInstance().add(klant3);
        VideotheekSingleton.getInstance().add(klant4);


        new Gui();

        FilmDAO filmDAO = new FilmDAO();
        GameDAO gameDAO = new GameDAO();
        filmDAO.uploadFilm(klant1.getVerhuurdeFilms());
        gameDAO.uploadGame(klant1.getVerhuurdeGames());
    }

}

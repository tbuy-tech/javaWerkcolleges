package videotheek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Game extends Media implements Archief{

    private String uitgever;

    public Game(String titel, String beschrijving, float rating, String uitgever) {
        super(titel, beschrijving, rating);
        this.uitgever = uitgever;
    }

    @Override
    public void verplaatsNaarArchief() throws IOException {

        FileWriter writer = new FileWriter("training/files/media.txt", true);

        writer.write(this.toString());
        writer.write("\r\n");   // write new line
        writer.close();

    }

    @Override
    public void haalUitArchief() throws IOException {


        FileReader reader = new FileReader("training/files/media.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public String getUitgever() {
        return uitgever;
    }

    @Override
    public String toString() {
        return super.toString() + " - Game - " + uitgever;
    }
}

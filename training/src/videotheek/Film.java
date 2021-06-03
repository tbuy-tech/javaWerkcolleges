package videotheek;



import java.io.*;
import java.util.Set;

public class Film extends Media implements  Archief{
    private String Regisseur;



    private enum Disktype {
        BD, DVD, HD_DVD
    }
    private Set<String> talen;

    public Film(String titel, String beschrijving, double rating, String regisseur, Set<String> talen) {
        super(titel, beschrijving, rating);
        Regisseur = regisseur;
        this.talen = talen;
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

    public String getRegisseur() {
        return Regisseur;
    }

    public Set<String> getTalen() {
        return talen;
    }

    @Override
    public String toString() {
        return super.toString() + " - Film - " + Regisseur +
                " - " + talen;
    }
}

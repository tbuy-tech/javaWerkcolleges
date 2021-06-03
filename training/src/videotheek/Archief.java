package videotheek;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Archief {


    public void verplaatsNaarArchief() throws IOException;


    public void haalUitArchief() throws IOException;
}

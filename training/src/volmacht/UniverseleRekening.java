package volmacht;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UniverseleRekening {
    List<VolmachtHebber> volmachtHebbers;

    public UniverseleRekening() {
        this.volmachtHebbers = new ArrayList<>();
    }

    public List<VolmachtHebber> getVolmachtHebbers() {
        return volmachtHebbers;
    }

    public void toevoegenVolmacht(VolmachtHebber a){
        volmachtHebbers.add(a);
    }

    public void  verwijderenVolmacht(VolmachtHebber a){
        if (volmachtHebbers.contains(a)) {
            volmachtHebbers.remove(a);
        }
    }

    public boolean controleerVolmacht(VolmachtHebber a){
        return volmachtHebbers.contains(a);
    }

    public void  toonVolmachtHebbers(){
        Iterator<VolmachtHebber> iter = volmachtHebbers.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

    public void haalGeldAf(VolmachtHebber a) throws PersoonHeeftGeenVolmacht {
        if (volmachtHebbers.contains(a)){
            System.out.println("BRRR printing cashh");
        } else {
            throw new PersoonHeeftGeenVolmacht();
        }
    }
}

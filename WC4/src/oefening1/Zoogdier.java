package oefening1;

import java.util.Date;

public abstract class Zoogdier extends Gewerveld {

    private  int zwangerschap;

    public Zoogdier(){
        super();
    }
    public Zoogdier(String naam, Date geboorteDatum, int lengte, Enum huidtype) {
        super(naam, geboorteDatum, lengte, huidtype);
    }

    public Zoogdier(String naam, Date geboorteDatum, int lengte, Enum huidtype, int zwangerschap) {
        super(naam, geboorteDatum, lengte, huidtype);
        this.zwangerschap = zwangerschap;
    }

    public int getZwangerschap() {
        return zwangerschap;
    }

    public void setZwangerschap(int zwangerschap) {
        this.zwangerschap = zwangerschap;
    }
    public abstract String maakGeluid();
}

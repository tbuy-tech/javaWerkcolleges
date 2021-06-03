package calculator;

public class Berekening {

    private float getal1;
    private float getal2;


    public Berekening(float getal1, float getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }

    public float som(){
        return getal1+getal2;
    }
    public float verschil(){
        return getal1-getal2;
    }
    public float maal(){
        return getal1*getal2;
    }
    public float deel(){
        return getal1/getal2;
    }
}

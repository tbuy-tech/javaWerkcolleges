package Werkcollege1.oef1;

public class Cirkel {
    private double straal;
    private String kleur;

    public Cirkel() {
        this.straal = 0;
        this.kleur = "wit";
    }
    public Cirkel(double straal) {
        this();
        this.straal = straal;
    }
    public Cirkel(String kleur) {
        this();
        this.kleur = kleur;
    }
    public Cirkel(double straal, String kleur) {
        this();
        this.straal = straal;
    }
    //SETTER

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    //GETTER
    public double getStraal() {
        return this.straal;
    }

    public String getKleur() {
        return this.kleur;
    }
    //METHODS
    public String toString() {
        return "straal: " + this.straal + ", kleur: " + this.kleur + ".";
    }
    public double geefOmtrek() {
        return this.straal*Math.PI*2;
    }
    public double geefOppervlakte() {
        return Math.PI*this.straal*this.straal;
    }
}



/*
    private double straal;
    private String kleur;
    // constructor
    public Cirkel () {
        this.straal = 0;
        this.kleur = "paars";
    }
    public Cirkel (double straal) {
        this();
        setStraal(straal);
        //this.straal = straal;
        //this.kleur = "wit";
    }
    public Cirkel (String kleur) {
        this();
        setKleur(kleur);
    }
    public Cirkel (double straal, String kleur){
        setStraal(straal);
        setKleur(kleur);
    }


    // setter
    public void setKleur (String kleur) {
        this.kleur = kleur;
    }
    public void setStraal (double straal) {
        this.straal = straal;
    }
    //getter
    public String getKleur () {
        return this.kleur;
    }
    public double getStraal () {
        return this.straal;
    }

    //methodes
    public double geefOmtrek () {
        return (2*Math.PI*straal);
    }

    public static void main(String[] args) {
        Cirkel a = new Cirkel(5);
        a.setKleur("oranje");
        System.out.println(a.getKleur());
        a.setKleur("rood");
        System.out.println(a.getKleur());

        System.out.println( a.geefOmtrek());
    }
    */
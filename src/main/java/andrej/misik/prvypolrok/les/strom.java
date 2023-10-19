package andrej.misik.prvypolrok.les;

public class strom {

    String typ;
    String nazov;
    int vyska;

    public strom(String typ,String nazov,int vyska) {
        this.typ = typ;
        this.nazov = nazov;
        this.vyska = 0;
    }

    public int getVyška() {
        return vyska;
    }

    public void setVyška(int vyska) {
        this.vyska = vyska;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}

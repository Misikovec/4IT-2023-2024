package andrej.misik.prvypolrok.les;

public class krik {

    String nazov;
    int pocetPlodov;

    public krik(String nazov, int pocetPlodov) {

        this.nazov = nazov;
        this.pocetPlodov = 0;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getPocetPlodov() {
        return pocetPlodov;
    }

    public void setPocetPlodov(int pocetPlodov) {
        this.pocetPlodov = pocetPlodov;
    }
}

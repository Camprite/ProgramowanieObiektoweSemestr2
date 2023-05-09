public abstract class Pojazd {
    private String nazwaZajezdni;
    private int predkoscMaksymalna;
    private int numerPojazdu;
    public Pojazd(int predkoscMaksymalna, int numerPojazdu){
    this.predkoscMaksymalna = predkoscMaksymalna;
    this.numerPojazdu = numerPojazdu;
    }

    public int getNumerPojazdu() {
        return numerPojazdu;
    }

    public int getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }

    public String getNazwaZajezdni() {
        return nazwaZajezdni;
    }

    public void setNazwaZajezdni(String nazwaZajezdni) {
        this.nazwaZajezdni = nazwaZajezdni;
    }

    public void setNumerPojazdu(int numerPojazdu) {
        this.numerPojazdu = numerPojazdu;
    }

    public void setPredkoscMaksymalna(int predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public abstract void opis();
}

import java.io.Serializable;

public class Produkt implements Serializable  {
    private String nazwa;
    private int cena;
    private int iloscWSklepie;

    public Produkt(String nazwa, int cena){
       this.nazwa = nazwa;
       this.cena = cena;
    }
    public void setIloscWSklepie(int iloscWSklepie){
        this.iloscWSklepie = iloscWSklepie;
    };

    public int getIloscWSklepie() {
        return iloscWSklepie;
    }

    public int getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }
}

import java.io.Serial;
import java.io.Serializable;

public abstract class Budynek implements Serializable {
    private String nazwa;
    private Adres adres;

    public Budynek(String nazwa, Adres adres){
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public abstract void wypisz();


    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String absgetNazwa() {
        return nazwa;
    }

    public Adres absgetAdres() {
        return adres;
    }
    public void setAdresINazwe(Adres adres, String nazwa){
     this.setAdres(adres);
     this.setNazwa(nazwa);
    }
}

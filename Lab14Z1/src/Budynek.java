import java.io.Serializable;

public abstract class Budynek implements Serializable {
    private String nazwa;
    private String adres;

    public Budynek(String nazwa, String adres){
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public abstract void wypisz();


    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String absgetNazwa() {
        return nazwa;
    }

    public String absgetAdres() {
        return adres;
    }
    public void setAdresINazwe(String adres, String nazwa){
     this.setAdres(adres);
     this.setNazwa(nazwa);
    }
}

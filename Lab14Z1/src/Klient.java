import java.io.Serializable;

public class Klient implements Serializable  {
    private String imie;
    private String nazwisko;
    private int pesel;

    public Klient(String imie, String nazwisko, int pesel){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;

    }
    public String getImieINazwisko(){
        return (this.imie + " " + this.nazwisko);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }
}

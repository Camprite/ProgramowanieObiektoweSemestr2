import java.io.Serializable;

public abstract class Osoba implements Serializable {
    private String imie;
    private String nazwisko;
    public static int id;
    public Osoba(){
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.id = ++id;
    }
    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = ++id;
    }
    public String getImie(){
        return this.imie;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public int getId(){
        return this.id;
    }
    public abstract void wypisz();

}

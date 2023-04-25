import java.io.Serializable;

public abstract class Osoba   implements Serializable {
    private String imie;
    private String nazwisko;

public Osoba(){
    this.imie = "Adam";
    this.nazwisko = "Miauczyński";
}
public Osoba(String imie, String nazwisko){
    this.imie = imie;
    this.nazwisko = nazwisko;
}
public String getImie(){
    return this.imie;
}
public String getNazwisko(){
    return this.nazwisko;
}
abstract double srednia();
abstract void info();
}


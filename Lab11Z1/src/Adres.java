import java.io.Serializable;

public class Adres implements Serializable  {
    private String miejscowosc;
    private String numer_budynku;
    private String kod_pocztowy;
    public Adres(String miejscowosc, String numer_budynku, String kod_pocztowy){
        this.miejscowosc = miejscowosc;
        this.numer_budynku = numer_budynku;
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public String getNumer_budynku() {
        return numer_budynku;
    }
    public void wypiszAdres(){
        System.out.println("Miejscowość: "+ this.miejscowosc + " "+this.numer_budynku);
        System.out.println("Kod pocztowy: "+ this.kod_pocztowy);
    }
}

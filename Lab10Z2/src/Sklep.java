import java.io.Serializable;

public class Sklep implements Serializable {
    private String nazwa;
    private String adres;
    private Obszar obszar;

    public Sklep(String nazwa, String adres,Obszar obszar){
        this.nazwa = nazwa;
        this.adres = adres;
        this.obszar = obszar;

    }


    public Obszar getObszar() {
        return obszar;
    }
}

import java.io.Serializable;
import java.util.ArrayList;

public class Dostawca implements Serializable {
    private String imie;
    private String nazwisko;
    public   ArrayList <String> firma = new ArrayList<String>();
    private Obszar obszar;
    public Dostawca(String imie, String nazwisko, Obszar obszar){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.obszar = obszar;
    }

    public void setFirma(String firma) {
        this.firma.add(firma);
    }

    public ArrayList<String> getFirma() {
        return firma;
    }

    public void setObszar(Obszar obszar) {
        this.obszar = obszar;
    }

    public Obszar getObszar() {
        return obszar;
    }
}

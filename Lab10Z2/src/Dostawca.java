import java.io.Serializable;

public class Dostawca implements Serializable {
    private String imie;
    private String nazwisko;
    private Obszar obszar;
    public Dostawca(String imie, String nazwisko, Obszar obszar){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.obszar = obszar;
    }

    public void setObszar(Obszar obszar) {
        this.obszar = obszar;
    }

    public Obszar getObszar() {
        return obszar;
    }
}

import java.io.Serializable;

public abstract class Bankier implements Serializable {
    private String imie;

    public Bankier(){
        this.imie = "Brak";
    }
    public Bankier(String imie){
        this.imie = imie;
    }
    public String getImie(){
        return this.imie;
    }
    abstract void wypisz();
    abstract float licz(float arg1,float arg2);

}

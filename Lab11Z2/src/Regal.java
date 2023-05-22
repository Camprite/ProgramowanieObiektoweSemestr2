import java.io.Serializable;
import java.util.ArrayList;

public class Regal implements Serializable {
    private String nazwa;
    private String centrala;
    private ArrayList<Polka> polki = new ArrayList<Polka>();

    public Regal(String nazwa){
        this.nazwa = nazwa;
    }

    public void wypiszRWM(boolean czywlaczone){
        for (Polka p: polki
             ) {
            p.wypiszPWM(czywlaczone);
        }

    }   public void wypiszRWM(){
        for (Polka p: polki
             ) {
            p.wypiszPWM();
        }

    }
    public void addPolka(Polka polka){
        polka.regal(this.nazwa);
        polki.add(polka);
        for (Polka p:polki
             ) {
            p.regal(this.nazwa);
        }
    }
    public String getNazwa() {
        return nazwa;
    }
    public void centrala(String centrala){
        this.centrala = centrala;
        for (Polka p: polki
             ) {
            p.setCentrala(this.centrala);
        }
    }

    public String getCentrala() {
        return centrala;
    }
}

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class CentralaTelefoniczna implements Serializable {
    private String nazwa;
    private ArrayList<Regal> regaly = new ArrayList<Regal>();
    public String getNazwa() {
        return nazwa;
    }
    public CentralaTelefoniczna(String nazwa){
        this.nazwa = nazwa;
    }

    public void addRegal(Regal regal){
        regal.centrala(this.nazwa);
        this.regaly.add(regal);
    }
    public void wypiszWszystkieModuly(){
        for (Regal r: regaly
             ) {
            r.wypiszRWM();
        }
    }
    public void wypiszWszystkieModulyWlaczone(){
        for (Regal r: regaly
             ) {
            r.wypiszRWM(true);
        }
    }
    public void wypiszWszystkieModulyWylaczone(){
        for (Regal r: regaly
             ) {
            r.wypiszRWM(false);
        }
    }

}

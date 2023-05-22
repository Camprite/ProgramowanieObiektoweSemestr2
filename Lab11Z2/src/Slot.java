import java.io.Serializable;

public class Slot implements Serializable {
    private String nazwa;
    private String polka;
    private String regal;
    private String centrala;
    private Modul modul;
    private boolean obsadzony = false;

    public Slot(String nazwa){
        this.nazwa=nazwa;
    }

    public void wylaczModul(){
        this.modul.wylaczModul();
    }
    public boolean czyModulWlaczony(){
        if(modul == null){
            return false;
        }
        return modul.getStan();
    }    public boolean czyObsadzony(){
        if(modul == null){
            return false;
        }
      return true;
    }
    public void setModul(Modul modul) throws Exception {
        if(this.obsadzony == true) throw new Exception("Slot nie jest pusty");
        obsadzony = true;
        this.modul = modul;

        modul.umiescModul(nazwa,polka,regal,centrala);
    }
    public void delModul(Modul modul) throws Exception {
        modul.wyjmijModul();
        this.obsadzony = false;
    }

    public void setPolka(String polka){
        this.polka = polka;
    }

    public void setCentrala(String centrala) {
        this.centrala = centrala;
    }

    public void setRegal(String regal) {
        this.regal = regal;
    }

    public void wypisz(){
        System.out.println(this.nazwa);
        System.out.println(this.polka);
        System.out.println(this.regal);
        System.out.println(this.centrala);
    }
}

import java.io.Serializable;
import java.util.ArrayList;

public class Polka implements Serializable {
    private String nazwa;
    private String regal;
    private String centrala;
    private ArrayList<Slot> slots = new ArrayList<Slot>();


    public Polka(String nazwa){
    this.nazwa = nazwa;
    }

    public void wypiszPWM(boolean czywlaczone){
        for (Slot s:slots
             ) {
            if(s.czyModulWlaczony()==czywlaczone){
                s.wypisz();
            }
        }

    }
    public void wypiszPWM(){

        for (Slot s:slots
        ) {

               if(s.czyObsadzony()==true){
                   s.wypisz();
               }

        }
    }
    public void regal(String regal){
        this.regal = regal;
        for (Slot s:slots
             ) {
            s.setRegal(this.regal);
        }
    }

    public String getRegal() {
        return regal;
    }
    public void setCentrala(String centrala){
        this.centrala = centrala;
        for (Slot s:slots
             ) {
            s.setCentrala(this.centrala);
        }
    }

    public void addSlot(Slot slot){
        slot.setPolka(this.nazwa);
        this.slots.add(slot);
    }

    public String getNazwa() {
        return nazwa;
    }
    public int iloscSlotow(){
        return slots.size();
    }
}

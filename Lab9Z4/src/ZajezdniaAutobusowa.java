import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ZajezdniaAutobusowa extends Zajezdnia{
    private ArrayList<Autobus> autobusy = new ArrayList<>();
    public ZajezdniaAutobusowa(String nazwa){
        super(nazwa);
    }
    public void addAutobus(Autobus aut){
        aut.setNazwaZajezdni(nazwa);
        autobusy.add(aut);
    }
    public void delAutobus(Autobus aut){
        aut.setNazwaZajezdni("");
        autobusy.remove(aut);
    }

    public int zuzyciePaliwaCalosc(){
        int wynik =0;
        for (Autobus aut:autobusy
        ) {
            wynik += aut.getZuzyciePaliwa();

        }
        return wynik;
    }
    @Override
    public void pojazdy() {
        for (Autobus aut:autobusy
               ) {
            aut.opis();

        }

    }

    @Override
    public void opis() {
        System.out.println(this.nazwa);
        pojazdy();

    }
}

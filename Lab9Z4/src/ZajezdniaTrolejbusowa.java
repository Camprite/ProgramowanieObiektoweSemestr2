import java.util.ArrayList;

public class ZajezdniaTrolejbusowa extends Zajezdnia{
    private ArrayList<Trolejbus> trolejbusy = new ArrayList<>();

    public ZajezdniaTrolejbusowa(String nazwa) {
        super(nazwa);
    }
    public void addTrolejbus(Trolejbus aut){
        aut.setNazwaZajezdni(nazwa);
        trolejbusy.add(aut);
    }
    public void delTrolejbus(Trolejbus aut){
        aut.setNazwaZajezdni("");
        trolejbusy.remove(aut);
    }
    public int zuzyciePraduCalosc(){
    int wynik =0;
        for (Trolejbus tram: trolejbusy
             ) {
            wynik += tram.getZuzyciekWh();

        }
        return wynik;
    }


    @Override
    public void pojazdy() {
        for (Trolejbus trol:trolejbusy
        ) {
            trol.opis();

        }

    }

    @Override
    public void opis() {
        System.out.println(this.nazwa);
        pojazdy();

    }
}

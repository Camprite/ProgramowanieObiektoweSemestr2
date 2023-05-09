import java.util.ArrayList;

public class ZajezdniaTramwajowa extends Zajezdnia{

    private ArrayList<Tramwaj> tramwaje = new ArrayList<>();
    public ZajezdniaTramwajowa(String nazwa){
        super(nazwa);
    }
    public void addTramwaj(Tramwaj tram){
        tram.setNazwaZajezdni(nazwa);
        tramwaje.add(tram);
    }
    public void delTramwaj(Tramwaj tram){
        tram.setNazwaZajezdni("");
        tramwaje.remove(tram);
    }
    public int iloscWagonowCalosc(){
        int wynik =0;
        for (Tramwaj tram:tramwaje
        ) {
            wynik += tram.getIlWagonow();

        }
        return wynik;
    }
    @Override
    public void pojazdy() {
        for (Tramwaj tram:tramwaje
        ) {
            tram.opis();

        }

    }

    @Override
    public void opis() {
        System.out.println(this.nazwa);
        pojazdy();

    }
}

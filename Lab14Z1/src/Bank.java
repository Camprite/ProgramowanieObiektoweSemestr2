import java.io.Serializable;
import java.util.ArrayList;

public class Bank extends Budynek implements Serializable  {
    private ArrayList<Sklep> sklepy = new ArrayList<Sklep>();
    private ArrayList<Kredyt> kredyty = new ArrayList<Kredyt>();

    public Bank(String nazwa,String adres) {
        super(nazwa,adres);
    }

    @Override
    public void wypisz() {
        System.out.println("Posiadane sklepy");
        this.sklepy();
        System.out.println("Posiadane Kredyty");
        this.informacjeOKredytach();
    }

    public void informacjeOKredytach(){
        for (Kredyt k:kredyty
             ) {
            System.out.println();
            System.out.println(k.getKoszyk().getKlient().getImieINazwisko());
            k.getKoszyk().podsumowanie();
            System.out.println();
        }
    }
        public void dodajSklep(Sklep sklep){
            sklepy.add(sklep);
        }
        public void udzielKredytu(Koszyk kosz,int il_rat){
            try {
                if(!this.czySklepNalezyDoBanku(kosz.getSklep())){ throw new Exception("Sklep nie nalezy do banku");}


            Kredyt kredyt = new Kredyt(kosz,il_rat);
            kredyty.add(kredyt);
            System.out.println("Kredyt udzielony pomyślnie");
            }catch (Exception ex){
                System.out.println(ex);
            }
        }

        public String sumaKredytowDlaKlienta(Klient klient){
        int wynik = 0;
        String tekst = "";
        for (Kredyt k:kredyty
                 ) {
            if(k.getKoszyk().getKlient().equals(klient)){
                wynik+= k.getKoszyk().getKoszt();
                }
            }
            tekst+=("Suma kredytów dla klienta: "+klient.getImieINazwisko()+" wynosi: "+ wynik + " zł \n");
        return tekst;
    }

        private boolean czySklepNalezyDoBanku(Sklep sklep){
            for (Sklep s:sklepy
                 ) {
            if(sklep.equals(s)){
                return true;
            }
            }
        return false;
        }
    public String sumaKredytowDlaSklepu(String sklep){
        int wynik = 0;
        String tekst = "";
        for (Kredyt k:kredyty
        ) {
            if(k.getKoszyk().getSklep().getNazwa().equals(sklep)){
                System.out.println("znaleziono sklep");
            wynik+= k.getKoszyk().getKoszt();
            }
        }
        tekst+=("Suma kredytów dla sklepu: "+sklep+" wynosi: "+ wynik);
        return tekst;
    }
    public String sumaKredytowDlaMiejscowosci(String adres){
        int wynik = 0;
        String tekst = "";
        for (Kredyt k:kredyty
        ) {
            if(k.getKoszyk().getSklep().getAdres().equals(adres)){
                wynik+= k.getKoszyk().getKoszt();
            }
        }
        tekst +=("Suma kredytów dla miejscowosci: "+adres+" wynosi: "+ wynik);
        return tekst;
    }
    public void sklepy(){
        for (Sklep s:sklepy
             ) {
            System.out.println(s.getNazwa());
            s.getAdres();
        }
    }
    public void sumaKredytów(){
        int wynik = 0;
        for (Kredyt k:kredyty
        ) {
                wynik+= k.getKoszyk().getKoszt();
            }

        System.out.println("Suma kredytów udzielonych przez bank wynosi: "+ wynik);
    }
    public boolean czySklepNalezy(Sklep sklep){
        for (Sklep s:sklepy
             ) {
            if(sklep.equals(s)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return absgetNazwa();
    }


}

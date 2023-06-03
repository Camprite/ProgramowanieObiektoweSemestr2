import java.io.Serializable;
import java.util.ArrayList;

public class Sklep extends Budynek  implements Serializable  {
    private ArrayList<Produkt> produkty = new ArrayList<Produkt>();


    public Sklep(String nazwa, String adres){
        super(nazwa,adres);
    }
    @Override
    public void wypisz(){
        System.out.println("Produkty w sklepie");
        for (Produkt p:produkty
             ) {
            p.wypiszProdukt();
        }

    }
    public void dodajProdukt(Produkt produkt, int ilosc){
        Produkt produktTemp = produkt;
        produktTemp.setIloscWSklepie(ilosc);
        produkty.add(produktTemp);
    }
    public boolean czyMożnaDodacProduktDoKoszyka(String produkt, int ilosc) throws Exception {

        for (Produkt p:produkty
             ) {
            if(p.getNazwa().equals(produkt)  && p.getIloscWSklepie()>=ilosc){
                System.out.println("Tak: "+p.getNazwa());
                System.out.println("Tak: "+p.getIloscWSklepie());
                return true;
            }
        }
        throw new Exception("Nie mozna dodac przedmiotuu");

    }
    public void odejmijProdukt(Produkt produkt, int ilosc){
        for (Produkt p:produkty
        ) {
            if(p.equals(produkt)){
            p.setIloscWSklepie(p.getIloscWSklepie()-ilosc);
            }
        }
    }
    public Produkt dajTenPrzedmiotJakoObiekt(String nazwa){
        for (Produkt p:produkty
        ) {
            if(p.getNazwa().equals(nazwa)){
                return p;
            }

        }

        return null;
    }

    public String getNazwa() {
        return this.absgetNazwa();
    }

    public String getAdres() {
        return this.absgetAdres();
    }
}

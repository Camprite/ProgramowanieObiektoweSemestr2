import java.io.Serializable;
import java.util.ArrayList;

public class Koszyk implements Serializable  {
    private Sklep sklep;
    private Klient klient;
    private ArrayList<ProduktWKoszyku> produkty = new ArrayList<ProduktWKoszyku>();
    private int koszt;

    public Koszyk(Sklep sklep, Klient klient){
        this.sklep = sklep;
        this.klient = klient;
    }
    public void dodajProdukt(Produkt produkt, int ilosc){
        try {
            if(sklep.czyMożnaDodacProduktDoKoszyka(produkt,ilosc)){
            ProduktWKoszyku produktWKoszyku = new ProduktWKoszyku(produkt,ilosc);
            produkty.add(produktWKoszyku);
            sklep.odejmijProdukt(produkt,ilosc);
            koszt+= produkt.getCena()*ilosc;
            }else {throw new Exception("Za mało produktów na stanie");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Klient getKlient() {
        return klient;
    }

    public Sklep getSklep() {
        return sklep;
    }

    public void podsumowanie(){
        System.out.println("-----------------------------------------");
        System.out.println("Produkty: ");
        for (ProduktWKoszyku p:produkty
             ) {
            p.podsumowanie();
        }


        System.out.println("Suma: "+this.koszt +" zł");
        System.out.println("-----------------------------------------");
        System.out.println();
    }

    public int getKoszt() {
        return koszt;
    }
}

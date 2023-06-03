import java.io.Serializable;

public class ProduktWKoszyku implements Serializable  {
    private Produkt produkt;
    private int ilosc;

    public ProduktWKoszyku(Produkt produkt, int ilosc){
        this.produkt = produkt;
        this.ilosc = ilosc;
    }
    public void podsumowanie(){
        System.out.println("Nazwa: "+produkt.getNazwa());
        System.out.println("Ilosc: "+this.ilosc);
        System.out.println("Cena: "+produkt.getCena() + " zł");
        System.out.println("Suma: "+produkt.getCena()*this.ilosc + " zł");
        System.out.println("");
    }
}

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Sklep extends Budynek  implements Serializable  {
    private ArrayList<Produkt> produkty = new ArrayList<Produkt>();


    public Sklep(String nazwa, Adres adres){
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
    public boolean czyMożnaDodacProduktDoKoszyka(Produkt produkt, int ilosc){

        for (Produkt p:produkty
             ) {
            if(p.equals(produkt)  && p.getIloscWSklepie()>=ilosc){
                return true;
            }
        }
        return false;
    }
    public void odejmijProdukt(Produkt produkt, int ilosc){
        for (Produkt p:produkty
        ) {
            if(p.equals(produkt)){
            p.setIloscWSklepie(p.getIloscWSklepie()-ilosc);
            }
        }
    }

    public String getNazwa() {
        return this.absgetNazwa();
    }

    public Adres getAdres() {
        return this.absgetAdres();
    }
}

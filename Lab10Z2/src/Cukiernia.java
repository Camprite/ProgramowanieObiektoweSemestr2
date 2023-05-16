import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Cukiernia implements Serializable {
    private String nazwa;
    private ArrayList<Produkt> produkty = new ArrayList<Produkt>();
    protected ArrayList<Zamowienie> zamowienia = new ArrayList<Zamowienie>();
    public Cukiernia(String nazwa){
        this.nazwa = nazwa;
    }
    public void setObszarDlaDostawcy(Dostawca dostawca, Obszar obszar){
        dostawca.setObszar(obszar);
    }
    public void addProdukt(Produkt produkt, int ilosc) throws Exception {
        produkt.setIlosc(ilosc);
        produkty.add(produkt);
    }
    public void delProdukt(Produkt produkt, int ilosc) throws Exception {
        produkt.setIlosc( produkt.getIlosc() - ilosc);

        produkty.add(produkt);
    }
    public void zlozZamowienie(Zamowienie zamowienie) throws Exception {
        zamowienia.add(zamowienie);
        ArrayList<ZamowionyProdukt> zamProd = zamowienie.getZamowioneProdukty();

            boolean czyZmienione = false;
            for (ZamowionyProdukt zamowionyProdukt: zamProd
                 ) {
                for (Produkt produkt: produkty) {
//                System.out.println("produkt1");
//                System.out.println(produkt.getNazwa());
//                System.out.println("produkt2");
//                System.out.println(zamowionyProdukt.getName());
                if(produkt.getNazwa()==zamowionyProdukt.getName()){
                    czyZmienione = true;
                    produkt.setIlosc(produkt.getIlosc()- zamowionyProdukt.getIloscZamowienia());
                }

            }
            if(czyZmienione == false){
                throw new Exception("Zamowienie przekracza stan");
            }

        }
    }
    public void wypiszZamownienia(){
        for (Zamowienie zam: zamowienia) {
            System.out.println("Informacje o towarach");
    zam.informacjeOTowarach();
            System.out.println("Wartosc zamowienia");
            System.out.println(zam.wartoscZamowienia());

        }

    }
}

import java.util.ArrayList;

public class Zamowienie {
    private Sklep sklep;
    private Dostawca dostawca;
    private ArrayList<ZamowionyProdukt> zamowioneProdukty = new  ArrayList<ZamowionyProdukt>();

    public ArrayList<ZamowionyProdukt> getZamowioneProdukty() {
        return zamowioneProdukty;
    }

    public Zamowienie(Sklep sklep, Dostawca dostawca) throws Exception {
        this.sklep = sklep;
        this.dostawca = dostawca;
        if(sklep.getObszar()!=dostawca.getObszar()){
            throw new Exception("OBSZARY NIE POKRYWAJĄ");
        }
    }
    public void dodajPrzedmiotDoZamowienia(Produkt produkt,int ilosc) throws Exception {
        zamowioneProdukty.add(new ZamowionyProdukt(produkt,ilosc));


    }
    public int wartoscZamowienia(){
        int wynik = 0;
        for (ZamowionyProdukt zamowienie: zamowioneProdukty
             ) {
            wynik += zamowienie.getIloscZamowienia()*zamowienie.getWartosc();

        }
        return wynik;
    }
    public void informacjeOTowarach(){
        int i = 1;
        for (ZamowionyProdukt zamowienie: zamowioneProdukty
        ) {
            System.out.println("-----"+i+"-----");
            System.out.println(zamowienie.getName());
            System.out.println("wartosc: "+zamowienie.getWartosc());
            System.out.println("ilosc: "+zamowienie.getIloscZamowienia());
            System.out.println("---------------");

        }
    }


}
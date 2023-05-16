import java.io.Serializable;

public class ZamowionyProdukt  implements Serializable {
    int iloscZamowienia;
    Produkt produkt;
    public ZamowionyProdukt(Produkt produkt,int iloscZamowienia) throws Exception {
        this.produkt = produkt;
        if (produkt.getIlosc()<iloscZamowienia) {
            throw new Exception("Brak wystarczającej ilosci towaru");
        }
            else{
                this.iloscZamowienia = iloscZamowienia;
        }
    }

    public int getIloscZamowienia() {
        return iloscZamowienia;
    }
    public String getName(){
        return produkt.getNazwa();
    }
    public int getWartosc(){
        return produkt.getCenaJednostkowa();
    }
//
//    public Produkt getProdukt() {
//        return produkt;
//    }
//
//    public void setProdukt(Produkt produkt) {
//        this.produkt = produkt;
//    }

    public void setIloscZamowienia(int iloscZamowienia) {
        this.iloscZamowienia = iloscZamowienia;
    }
}

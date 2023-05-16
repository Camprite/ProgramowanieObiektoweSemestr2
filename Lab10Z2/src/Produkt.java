import java.io.Serializable;

public class Produkt  implements Serializable {
    String nazwa;
    int ilosc=0;
    int cenaJednostkowa;
    private boolean czySprzedawanyNaSztuki;

    public Produkt(String nazwa, int cenaJednostkowa,boolean czySprzedawanyNaSztuki){
        this.nazwa = nazwa;
        this.cenaJednostkowa = cenaJednostkowa;
        this.czySprzedawanyNaSztuki = czySprzedawanyNaSztuki;
    }

    public int getCenaJednostkowa() {
        return cenaJednostkowa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setCenaJednostkowa(int cenaJednostkowa) {
        this.cenaJednostkowa = cenaJednostkowa;
    }

    public void setCzySprzedawanyNaSztuki(boolean czySprzedawanyNaSztuki) {
        this.czySprzedawanyNaSztuki = czySprzedawanyNaSztuki;
    }

    public void setIlosc(int ilosc) throws Exception {
        if(ilosc<0){
            throw new Exception("ZBYT MALA ILOSC PRODUKTOW");
        }
        this.ilosc = ilosc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}


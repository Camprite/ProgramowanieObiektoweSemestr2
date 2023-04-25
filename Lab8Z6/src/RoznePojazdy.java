import javax.swing.*;

public class RoznePojazdy {
    public static void main(String[] args) {
        Pojazd[]  pojazdy  = new Pojazd[5];
        pojazdy[0] = new Pociag("TGV",99);
        pojazdy[1] = new Samochod("Opel",100000,1,"Astra");
        pojazdy[2] = new Statek("Parostatek",40);
        pojazdy[3] = new Pociag("adsasd",132132);
        pojazdy[4] = new Samochod("Volkswagen",100020,40,"Polo");
        System.out.println("");
        System.out.println("");
        System.out.println("Odczyt");
        System.out.println("");
        System.out.println("");
        for (Pojazd poj: pojazdy
             ) {
            poj.info();

        }
    }


}

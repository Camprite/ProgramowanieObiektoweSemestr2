import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Produkt pr1 = new Produkt("Cukierek",32);
        Produkt pr2 = new Produkt("Baton",7);
        Produkt pr3 = new Produkt("Chipsy",12);
        Produkt pr4 = new Produkt("Ciastka",5);
        Produkt pr5 = new Produkt("Lizak",2);

        Adres ad1 = new Adres("Siedlce","21","08-110");
        Adres ad2 = new Adres("Wiśniew","42","08-112");
        Adres ad3 = new Adres("Choroszcz","4","10-052");

        Bank bank1 = new Bank("VeloBank",ad1);

        Sklep sklep1 = new Sklep("Pewex",ad2);

        sklep1.dodajProdukt(pr1,30);
        sklep1.dodajProdukt(pr2,30);
        sklep1.dodajProdukt(pr3,43);
        sklep1.dodajProdukt(pr4,21);
        sklep1.dodajProdukt(pr5,7);

        bank1.dodajSklep(sklep1);

        Klient klient1 = new Klient("Paulina","Wborodo",21372332);
        Klient klient2 = new Klient("Michał","Głuś",221312);


        Koszyk kosz1 = new Koszyk(sklep1,klient1);
        Koszyk kosz2 = new Koszyk(sklep1,klient2);
        kosz1.dodajProdukt(pr1,3);
        kosz1.dodajProdukt(pr2,1);
        kosz1.dodajProdukt(pr3,2);
        kosz1.podsumowanie();

        kosz2.dodajProdukt(pr3,4);
        kosz2.dodajProdukt(pr4,2);
        kosz2.dodajProdukt(pr5,3);

        bank1.udzielKredytu(kosz2,5);

        bank1.udzielKredytu(kosz1,3);

        bank1.sumaKredytowDlaKlienta(klient1);
        bank1.sumaKredytowDlaKlienta(klient2);

        bank1.sumaKredytowDlaSklepu(sklep1);

        bank1.sumaKredytowDlaMiejscowosci(ad2);
        bank1.sumaKredytów();

    String filename = "banki.ser";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(filename)));
        out.writeObject(bank1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(filename)));
        Bank input =(Bank) in.readObject();
        System.out.println("FROM FILE");
        input.informacjeOKredytach();
    }
}
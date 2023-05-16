import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        Obszar obszar1 = new Obszar("Wschod");
        Obszar obszar2 = new Obszar("Zachod");
        Obszar obszar3 = new Obszar("Polnoc");
        Obszar obszar4 = new Obszar("Poludnie");
        Obszar obszar5 = new Obszar("Centrum");

        Sklep sklep1 = new Sklep("Biedronka", "Szkolna 17", obszar1);
        Sklep sklep2 = new Sklep("Tesco", "Wiejska 6", obszar2);
        Sklep sklep3 = new Sklep("Lewiatan", "Forminskiego 2", obszar3);
        Sklep sklep4 = new Sklep("Zabka", "Jana Pawla II 21", obszar4);
        Sklep sklep5 = new Sklep("Archelan", "3 Maja 5", obszar5);

        Dostawca dostawca1 = new Dostawca("Kamil", "Zdun", obszar1);
        Dostawca dostawca2 = new Dostawca("Damian", "Wasik", obszar2);
        Dostawca dostawca3 = new Dostawca("Wieslaw", "Paleta", obszar3);

        Produkt produkt1 = new Produkt("Oscypek", 5, true);
        Produkt produkt2 = new Produkt("Grabie", 50, true);
        Produkt produkt3 = new Produkt("Kartofle", 3, false);
        Produkt produkt4 = new Produkt("Ziemniaki", 4, false);
        Produkt produkt5 = new Produkt("Czekolada", 10, true);
        Produkt produkt6 = new Produkt("Opona do STARa", 200, true);
        Produkt produkt7 = new Produkt("Choinka o zapachu kokosowym do malucha", 10, true);

        Cukiernia cukiernia = new Cukiernia("Pszczolka");
        cukiernia.addProdukt(produkt1,5);
        cukiernia.addProdukt(produkt2,5);
        cukiernia.addProdukt(produkt3,5);
        cukiernia.addProdukt(produkt4,5);
        cukiernia.addProdukt(produkt5,5);
        cukiernia.addProdukt(produkt6,5);

        Zamowienie zamowienie1 = new Zamowienie(sklep1,dostawca1);
        zamowienie1.dodajPrzedmiotDoZamowienia(produkt1,3);
        zamowienie1.dodajPrzedmiotDoZamowienia(produkt2,5);
        zamowienie1.dodajPrzedmiotDoZamowienia(produkt6,3);
        cukiernia.zlozZamowienie(zamowienie1);
//        System.out.println("wartosc zamowienia:");
//        System.out.println(zamowienie1.wartoscZamowienia());
//        System.out.println("INFO O TOWARACH:");
//        zamowienie1.informacjeOTowarach();

//        ----ZapisDoPliku-----
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("cukiernia.ser")));
        out.writeObject(cukiernia);
        ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(new File("sklepy.ser")));
        out1.writeObject(sklep1);
        out1.writeObject(sklep2);
        out1.writeObject(sklep3);
        out1.writeObject(sklep4);
        out1.writeObject(sklep5);
        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream(new File("dostawcy.ser")));
        out2.writeObject(dostawca1);
        out2.writeObject(dostawca2);
        out2.writeObject(dostawca3);
        out.close();
        out1.close();
        out2.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("cukiernia.ser")));
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(new File("sklepy.ser")));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(new File("dostawcy.ser")));
        System.out.println("CUKIERNIA Z PLIKU");
        Cukiernia cukierniaIn = (Cukiernia) in.readObject();

        cukierniaIn.wypiszZamownienia();


    }
}

import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//Bazuje na kodzie z Lab 11Z1

public class Window extends JFrame {
    //Bank
    public JLabel bankOpisNazwa;
    public JTextField nazwaBanku;
    public JLabel bankOpisAdres;
    public JTextField adresBanku;
    public final JButton dodawanieBanku;
    public ArrayList<Bank> banki = new ArrayList();;
    //Sklep
    public JLabel sklepOpisNazwa;
    public JTextField nazwaSklepu;
    public JLabel sklepOpisAdres;
    public JTextField adresSklepu;
    public JLabel  opisNazwaBankuDoKtoregoNalezy;
    public JTextField nazwaBankuDoKtoregoNalezy;
    public final JButton dodawanieSklepu;
    public ArrayList<Sklep> sklepy = new ArrayList();
    //Produkty
    public  ArrayList<Produkt> produkty = new ArrayList<>();
    Produkt pr1 = new Produkt("Cukierek",32);
    Produkt pr2 = new Produkt("Baton",7);
    Produkt pr3 = new Produkt("Chipsy",12);
    Produkt pr4 = new Produkt("Ciastka",5);
    Produkt pr5 = new Produkt("Lizak",2);
    public JTextArea listaProduktow;
    public JLabel stanOpisSklep;
    public JTextField stanSklep;
    public JLabel produktOpisNazwa;
    public JTextField produktNazwa;
    public JLabel produktOpisIlosc;
    public JTextField produktIlosc;
    public JButton dodajStan;

    //Klient
    public JLabel klientOpisImie;
    public JTextField imieKlient;
    public JLabel klientOpisNazwisko;
    public JTextField nazwiskoKlient;
    public JLabel  klientOpisPesel;
    public JTextField klientPesel;
    public JButton klientDodaj;
    public  ArrayList<Klient> klienci = new ArrayList<>();
    //koszyk
    public JLabel koszykOpisImieKlienta;
    public JTextField koszykImieKlienta;
    public JLabel koszykOpisNazwisko;
    public JTextField  koszykNazwiskoKlient;
    public JLabel koszykOpisSklep;
    public JTextField  koszykSklep;
    public JLabel  koszykOpisProdukt;
    public JTextField koszykOProdukt;
    public JLabel  koszykOpisProduktIlosc;
    public JTextField koszykOProduktIlosc;
    public JLabel  koszykOpisIloscRat;
    public JTextField koszykIloscRat;
    public JButton dodawajProdukt;
    public JButton zakonczZakupy;
    public JButton dodawajKoszyk;
    public Koszyk aktualnykoszyk;
    //
//
//        bank1.sumaKredytowDlaKlienta(klient1);
//        bank1.sumaKredytowDlaKlienta(klient2);
//        bank1.sumaKredytowDlaSklepu(sklep1);
//        bank1.sumaKredytowDlaMiejscowosci(ad2);
//            input.informacjeOKredytach();

    public JLabel sumaOpisKredytowDlaKlientaImie;
    public JTextField sumaKredytowDlaKlientaImie;
    public JLabel sumaOpisKredytowDlaKlientaNazwisko;
    public JTextField sumaKredytowDlaKlientaNazwisko;
    public JLabel sumaOpisKredytowDlaSklepu;
    public JTextField sumaKredytowDlaSklepu;
    public JLabel sumaOpisKredytowDlaMiejscowosci;
    public JTextField sumaKredytowDlaMiejscowosci;
    public JButton DlaMiejscowosci;
    public JButton DlaSklepu;
    public JButton DlaKlienta;
    public JTextArea output;






    public Window(){
produkty.add(pr1);
produkty.add(pr2);
produkty.add(pr3);
produkty.add(pr4);
produkty.add(pr5);


String lproduktow ="";
        for (Produkt pr:produkty
             ) {
            lproduktow += "Nazwa: "+pr.getNazwa() +" cena: " + pr.getCena() + "\n";
        }
        listaProduktow = new JTextArea(produkty.size(),20);

        listaProduktow.setText(lproduktow);
        listaProduktow.setEditable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));



        //dodawanie banku
        JPanel bank = new JPanel();
        bank.setLayout(new FlowLayout());
        bank.add(bankOpisNazwa = new JLabel("Nazwa banku"));
        bank.add(nazwaBanku = new JTextField(8));
        bank.add(bankOpisAdres = new JLabel("Adres: "));
        bank.add(adresBanku = new JTextField(8));
        bank.add(dodawanieBanku = new JButton("Dodaj Bank"));
        bank.setVisible(true);
        //dodawanie sklepów
        JPanel sklep = new JPanel();
        sklep.setLayout(new FlowLayout());
        sklep.add(sklepOpisNazwa = new JLabel("Nazwa sklepu"));
        sklep.add(nazwaSklepu = new JTextField(8));
        sklep.add(sklepOpisAdres = new JLabel("Adres: "));
        sklep.add(adresSklepu = new JTextField(8));
        sklep.add(opisNazwaBankuDoKtoregoNalezy = new JLabel("Podaj nazwe Banku do ktorego ma nalezec Sklep: "));
        sklep.add(nazwaBankuDoKtoregoNalezy = new JTextField(8));
        sklep.add(dodawanieSklepu = new JButton("Dodaj sklep"));
        sklep.setVisible(true);
        //lista produktow
        JPanel produktyJP = new JPanel();
        produktyJP.setLayout(new FlowLayout());
        produktyJP.add(listaProduktow );
        produktyJP.add(stanOpisSklep=new JLabel("Podaj sklep"));
        produktyJP.add(stanSklep=new JTextField(10));
        produktyJP.add(produktOpisNazwa=new JLabel("Podaj produkt"));
        produktyJP.add(produktNazwa=new JTextField(10));
        produktyJP.add(produktOpisIlosc=new JLabel("Podaj ilosc"));
        produktyJP.add(produktIlosc=new JTextField(10));
        produktyJP.add(dodajStan = new JButton("Dodaj stan"));


        produktyJP.setVisible(true);


        //klient
        JPanel klient = new JPanel();
        klient.setLayout(new FlowLayout());
        klient.add(klientOpisImie = new JLabel("Imie:"));
        klient.add(imieKlient = new JTextField(10));
        klient.add(klientOpisNazwisko = new JLabel("Nazwisko:"));
        klient.add(nazwiskoKlient= new JTextField(10));
        klient.add(klientOpisPesel = new JLabel("Pesel:"));
        klient.add(klientPesel= new JTextField(10));
        klient.add(klientDodaj= new JButton("Dodaj klienta"));
        klient.setVisible(true);
        //koszyk
        JPanel koszyk = new JPanel();
        koszyk.setLayout(new FlowLayout());
        koszyk.add(koszykOpisImieKlienta = new JLabel("Imie klienta"));
        koszyk.add(koszykImieKlienta = new JTextField(10));
        koszyk.add(koszykOpisNazwisko = new JLabel("Nazwisko klienta"));
        koszyk.add(koszykNazwiskoKlient = new JTextField(10));
        koszyk.add(koszykOpisSklep = new JLabel("Wpisz sklep w ktorym chcesz stworzyc koszyk"));
        koszyk.add(koszykSklep = new JTextField(10));
        koszyk.add(koszykOpisProdukt = new JLabel("Wpisz produkt ktory chcesz dodac"));
        koszyk.add(koszykOProdukt = new JTextField(10));
        koszyk.add(koszykOpisProduktIlosc = new JLabel("Wpisz ilosc ktora chcesz kupic"));
        koszyk.add(koszykOProduktIlosc = new JTextField(10));
        koszyk.add(koszykOpisIloscRat = new JLabel("Wpisz ilosc rat"));
        koszyk.add(koszykIloscRat = new JTextField(10));
        koszyk.add(dodawajKoszyk = new JButton("Dodaj koszyk"));
        koszyk.add(dodawajProdukt = new JButton("Dodaj produkt"));
        koszyk.add(zakonczZakupy = new JButton("Zakoncz Zakupy"));
        koszykOProdukt.setEnabled(false);
        koszykOProduktIlosc.setEnabled(false);
        koszykIloscRat.setEnabled(false);
        dodawajProdukt.setEnabled(false);
        zakonczZakupy.setEnabled(false);

        //podsumowanie
        JPanel podsumowanie = new JPanel();
        podsumowanie.setLayout(new FlowLayout());
        podsumowanie.add(sumaOpisKredytowDlaKlientaImie = new JLabel("Imie:"));
        podsumowanie.add(sumaKredytowDlaKlientaImie = new JTextField(10));
        podsumowanie.add(sumaOpisKredytowDlaKlientaNazwisko = new JLabel("Nazwisko:"));
        podsumowanie.add(sumaKredytowDlaKlientaNazwisko = new JTextField(10));

        podsumowanie.add(sumaOpisKredytowDlaSklepu = new JLabel("Sklep:"));
        podsumowanie.add(sumaKredytowDlaSklepu = new JTextField(10));

        podsumowanie.add(sumaOpisKredytowDlaMiejscowosci = new JLabel("Miejscowosc:"));
        podsumowanie.add(sumaKredytowDlaMiejscowosci = new JTextField(10));

        podsumowanie.add(DlaMiejscowosci = new JButton("Suma Kredytow Dla Miejscowosci"));
        podsumowanie.add(DlaSklepu = new JButton("Suma Kredytow Dla Sklepu"));
        podsumowanie.add(DlaKlienta = new JButton("Suma Kredytow Dla Klienta"));
        podsumowanie.add(output = new JTextArea(10,50));
        output.setEditable(false);


//
//        public JButton DlaMiejscowosci;
//        public JButton DlaSklepu;
//        public JButton DlaKlienta;






        container.add(bank);
        container.add(sklep);
        container.add(klient);
        container.add(produktyJP);
        container.add(koszyk);
        container.add(podsumowanie);
        add(container);
        setVisible(true);
        setSize(1000,1000);
        dodawanieBanku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Bank bank = new Bank(nazwaBanku.getText(),adresBanku.getText());
//                JOptionPane.showMessageDialog(null,"klinięto");
                    for (Bank b : banki
                    ) {

//                        System.out.println(b.absgetNazwa());
//                        System.out.println(nazwaBanku.getText());
//                        System.out.println(b.absgetAdres());
//                        System.out.println(adresBanku.getText());
                        if (b.absgetNazwa().equals(bank.absgetNazwa()) && b.absgetAdres().equals(bank.absgetAdres())) {
//                            System.out.println("SSSS");
                            throw new Exception("Bank już istnieje");
                        }

                    }
                    banki.add(bank);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.toString());
                }

            }
        });
        dodawanieSklepu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Sklep sklep = new Sklep(nazwaSklepu.getText(),adresSklepu.getText());
                    boolean val1 = true;
//                JOptionPane.showMessageDialog(null,"klinięto");
                    for (Sklep b : sklepy
                    ) {

//                        System.out.println(b.absgetNazwa());
//                        System.out.println(nazwaBanku.getText());
//                        System.out.println(b.absgetAdres());
//                        System.out.println(adresBanku.getText());
                        if (b.absgetNazwa().equals(sklep.absgetNazwa()) && b.absgetAdres().equals(sklep.absgetAdres())) {
//                            System.out.println("SSSS");
                            val1 = false;
                            throw new Exception("Sklep już istnieje");

                        }

                    }

                    boolean val2 = false;
                    for (Bank b:banki
                         ) {
                        if(b.absgetNazwa().equals(nazwaBankuDoKtoregoNalezy.getText())){
                            b.dodajSklep(sklep);
                            val2 = true;
                            JOptionPane.showMessageDialog(null,"Dodano sklep do banku");
                        }

                    }
                    if(!val2){
                        throw new Exception("Nie znaleziono banku do ktorego mozna przypisac sklep");
                    }
                    if(val1&&val2){
                        sklepy.add(sklep);
                    }

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.toString());
                }

            }
        });
        dodajStan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                Produkt produktDodajStan = null;
                try {
                boolean val1 = false;
                boolean val2 = false;
                for (Produkt p:produkty
                     ) {
                    System.out.println(produktNazwa.getText());
                    System.out.println(p.getNazwa());
                    if(produktNazwa.getText().equals(p.getNazwa())){
                        produktDodajStan = new Produkt(produktNazwa.getText(),p.getCena());
                        System.out.println("Znaleziono produkt");
                        val1 = true;
                    }
                }
                for (Sklep s:sklepy
                     ) {
                    if(s.getNazwa().equals(stanSklep.getText())){
                        s.dodajProdukt(produktDodajStan,Integer.parseInt(produktIlosc.getText()));
                        System.out.println("Dodano stan");
                        val2 = true;
                    }
                }
                if(!val1||!val2){

                        throw new Exception();
                    } }catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Nie udało się dodać produktu do sklepu"     );
                    }



            }
        });
        dodawajKoszyk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Klient k1 = null;
                    Sklep s1 = null;
                    boolean val1 = false;
                    boolean val2 = false;
                    for (Klient k: klienci
                         ) {
                        if(k.getNazwisko().equals(koszykNazwiskoKlient.getText()) && k.getImie().equals(koszykImieKlienta.getText())){
//                            JOptionPane.showMessageDialog(null,"Znaleziono klienta");
                        k1 = k;
                        val1 = true;
                        }
                    }
                    for (Sklep s: sklepy
                         ) {
                        if(s.getNazwa().equals(koszykSklep.getText())){
//                            JOptionPane.showMessageDialog(null,"Znaleziono sklep");
                            s1= s;
                            val2 = true;
                        }
                    }
                    if(val1==false||val2==false){
                        throw new Exception("NIE UDALO SIE STWORZYC KOSZYKA");
                    }
                    aktualnykoszyk = new Koszyk(s1,k1);
                    dodawajKoszyk.setEnabled(false);
                    koszykImieKlienta.setEnabled(false);
                    koszykNazwiskoKlient.setEnabled(false);
                    koszykOProdukt.setEnabled(true);
                    koszykOProduktIlosc.setEnabled(true);
                    koszykIloscRat.setEnabled(true);
                    koszykSklep.setEnabled(false);
                    dodawajProdukt.setEnabled(true);
                    zakonczZakupy.setEnabled(true);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }


            }
        });
        klientDodaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    klienci.add(new Klient(imieKlient.getText(),nazwiskoKlient.getText(),Integer.parseInt(klientPesel.getText())));
                    JOptionPane.showMessageDialog(null,"DODANO KLIENTA");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex);
                }




//                public JLabel klientOpisImie;
//                public JTextField imieKlient;
//                public JLabel klientOpisNazwisko;
//                public JTextField nazwiskoKlient;
//                public JLabel  klientOpisPesel;
//                public JTextField klientPesel;
//                public JButton klientDodaj;
//                public  ArrayList<Klient> klienci = new ArrayList<>();
            }
        });
        dodawajProdukt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Produkt pDodaj = null;
                try {
                   if(aktualnykoszyk.getSklep().czyMożnaDodacProduktDoKoszyka(koszykOProdukt.getText(),Integer.parseInt(koszykOProduktIlosc.getText())));
                    {
                   Produkt temporary = aktualnykoszyk.getSklep().dajTenPrzedmiotJakoObiekt(koszykOProdukt.getText());
                    aktualnykoszyk.dodajProdukt(temporary,Integer.parseInt(koszykOProduktIlosc.getText()));
                        JOptionPane.showMessageDialog(null,"Produkt dodany do koszyka");



                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,"Nie udało się dodać przedmiotu do koszyka");
                    System.out.println(ex);
                }

            }
        });
        zakonczZakupy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    if(Integer.parseInt(koszykIloscRat.getText())>0){
                        aktualnykoszyk.podsumowanie();
                        Bank bankTemp = null;
                        for (Bank b:banki
                             ) {
                            if(b.czySklepNalezy(aktualnykoszyk.getSklep())){
                                bankTemp = b;
                            }
                        }

                        bankTemp.udzielKredytu(aktualnykoszyk,Integer.parseInt(koszykIloscRat.getText()));
                        JOptionPane.showMessageDialog(null,"Kredyt został udzielony");
                        koszykImieKlienta.setEnabled(true);
                        koszykNazwiskoKlient.setEnabled(true);
                        koszykSklep.setEnabled(true);
                        koszykOProdukt.setEnabled(false);
                        koszykOProduktIlosc.setEnabled(false);
                        koszykIloscRat.setEnabled(false);
                        dodawajProdukt.setEnabled(false);
                        zakonczZakupy.setEnabled(false);
                        dodawajKoszyk.setEnabled(true);

                    }else throw new Exception("Niepoprawa ilosc rat");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
//        podsumowanie.add(DlaMiejscowosci = new JButton("Suma Kredytow Dla Miejscowosci"));
//        podsumowanie.add(DlaSklepu = new JButton("Suma Kredytow Dla Sklepu"));
//        podsumowanie.add(DlaKlienta = new JButton("Suma Kredytow Dla Klienta"));
//        podsumowanie.add(output = new JTextArea(10,50));
//        podsumowanie.add(sumaOpisKredytowDlaKlienta = new JLabel("Klient:"));
//        podsumowanie.add(sumaKredytowDlaKlienta = new JTextField(10));
//
//        podsumowanie.add(sumaOpisKredytowDlaSklepu = new JLabel("Sklep:"));
//        podsumowanie.add(sumaKredytowDlaSklepu = new JTextField(10));
//
//        podsumowanie.add(sumaOpisKredytowDlaMiejscowosci = new JLabel("Miejscowosc:"));
//        podsumowanie.add(sumaKredytowDlaMiejscowosci = new JTextField(10));

//           bank1.sumaKredytowDlaMiejscowosci(ad2);
        DlaSklepu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String wynik = "";


                for (Bank b: banki
                ) {
                    if(b.sumaKredytowDlaSklepu(sumaKredytowDlaSklepu.getText())!=""){
                        wynik+=b.sumaKredytowDlaSklepu(sumaKredytowDlaSklepu.getText());
                    }
                }




                output.setText(wynik);

            }
        });
        DlaMiejscowosci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bank tempBank = null;
                String wynik = "";


                        for (Bank b: banki
                        ) {
                            if(b.sumaKredytowDlaMiejscowosci(sumaKredytowDlaMiejscowosci.getText())!=""){
                                wynik+=b.sumaKredytowDlaMiejscowosci(sumaKredytowDlaMiejscowosci.getText());
                            }
                        }




                output.setText(wynik);
            }
        });

        DlaKlienta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bank tempBank = null;
                String wynik = "";

                for (Klient k:klienci
                     ) {

                    if(k.getImie().equals(sumaKredytowDlaKlientaImie.getText())&&k.getNazwisko().equals(sumaKredytowDlaKlientaNazwisko.getText())){

                        System.out.println("znaleziono klienta");
                        for (Bank b: banki
                        ) {
                            wynik += b.sumaKredytowDlaKlienta(k);
                        }
                    }
                }


                output.setText(wynik);
            }
        });
    }

}

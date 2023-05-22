import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Modul> moduly = new ArrayList<Modul>();
        Typ t1 = new Typ("T1");
        Typ t2 = new Typ("T2");
        Typ t3 = new Typ("T3");
        Typ t4 = new Typ("T4");
        Typ t5 = new Typ("T5");
        Typ t6 = new Typ("T6");
        Typ t7 = new Typ("T7");
        Typ t8 = new Typ("T8");
        Typ t9 = new Typ("T9");
        Typ t10 = new Typ("T10");

        Modul m1 = new Modul(t1,"Modul1");moduly.add(m1);
        Modul m2 = new Modul(t2,"Modul2");moduly.add(m2);
        Modul m3 = new Modul(t3,"Modul3");moduly.add(m3);
        Modul m4 = new Modul(t4,"Modul4");moduly.add(m4);
        Modul m5 = new Modul(t5,"Modul5");moduly.add(m5);
        Modul m6 = new Modul(t6,"Modul6");moduly.add(m6);
        Modul m7 = new Modul(t7,"Modul7");moduly.add(m7);
        Modul m8 = new Modul(t8,"Modul8");moduly.add(m8);
        Modul m9 = new Modul(t9,"Modul9");moduly.add(m9);
        Modul m10 = new Modul(t10,"Modul10");moduly.add(m10);

////        WYPISANIE WSZYSTICH MODULOW
//        for (Modul m : moduly
//        ) {
//            m.wypiszWszystko();
//        }
////        WYPISANIE WSZYSTICH MODULOW DANEGO TYPU
//        for (Modul m : moduly
//        ) {
//        if(m1.getTypObj() == t1){
//            m.wypiszWszystko();
//          }
//        }
////        WYPISANIE WSZYSTICH WLACZONY MODULOW
//        for (Modul m : moduly
//        ) {
//            if(m.getStan()==true){
//                m.wypiszWszystko();
//            }
//        }
////        WYPISANIE WSZYSTICH WYLACZONYCH MODULOW
//
//        for (Modul m : moduly
//        ) {
//            if(m.getStan()==false){
//                m.wypiszWszystko();
//            }

        Slot sl1 = new Slot("1:2");
        Slot sl2 = new Slot("1:3");
        Slot sl3 = new Slot("1:4");
        Slot sl4 = new Slot("1:5");

        Polka pl1 = new Polka("Półka nr 1");

        pl1.addSlot(sl1);
        pl1.addSlot(sl2);
        pl1.addSlot(sl3);
        pl1.addSlot(sl4);
//        sl1.wypisz();
//
//        System.out.println(pl1.iloscSlotow());

        Regal re1 = new Regal("Regał nr 1");

        re1.addPolka(pl1);

        CentralaTelefoniczna centrala = new CentralaTelefoniczna("Centrala nr 1");

        centrala.addRegal(re1);

        sl1.wypisz();

        sl1.setModul(m1);
        sl2.setModul(m2);
        sl3.setModul(m3);
        System.out.println("");
        m1.wypiszWszystko();
//        m1.wlaczModul();
//        sl1.delModul(m1);
        System.out.println("");
        m1.wypiszWszystko();
        sl1.wylaczModul();

        centrala.wypiszWszystkieModuly();//wypisanie kazdego modulu w centrali
        centrala.wypiszWszystkieModulyWlaczone();//wypisanie kazdego dzialajacego modulu w centrali
        centrala.wypiszWszystkieModulyWylaczone();//wypisanie kazdego nie dzialajacego modulu w centrali

        re1.wypiszRWM();//wypisanie kazdego modulu w regale
        re1.wypiszRWM(true);//wypisanie kazdego dzialajacego modulu w regale
        re1.wypiszRWM(false);//wypisanie kazdego nie dzialajacego modulu w regale

        pl1.wypiszPWM(); //wypisanie kazdego modulu w polce
        pl1.wypiszPWM(true);//wypisanie kazdego dzialajacego modulu w polce
        pl1.wypiszPWM(false);//wypisanie kazdego nie dzialajacego modulu w polce


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("centr.ser")));
        out.writeObject(centrala);
        out.close();

        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        System.out.println("ODCZYT");
        ObjectInputStream in = new ObjectInputStream( new FileInputStream( new File("centr.ser")));
        CentralaTelefoniczna input = null;
        try {
        input = (CentralaTelefoniczna) in.readObject();
        }catch (Exception ex){
            System.out.println(ex);
        }
    input.wypiszWszystkieModuly();

    }
}
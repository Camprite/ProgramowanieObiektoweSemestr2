import java.io.IOException;
import java.util.ArrayList;

public class zadanie2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Pracownik prac1 = new Pracownik("Andrzej","Duda","01.01.1980","04.10.2012",3300,"Marketing");
        Pracownik prac2 = new Pracownik("Jerzy","Szybki","02.03.2001","10.22.2022",1300,"PR");
        Pracownik prac3 = new Pracownik("Janusz","Nosacz","17.05.1970","01.06.2010",2500,"Oszczednosci");
        Kierownik kier1 = new Kierownik("Chad","Giga","28.07.1990","25.04.2018",5000,"Rozwoj",10,"Manager",50);
        Kierownik kier2 = new Kierownik("Mieczyslaw","Zamozny","24.06.1996","20.05.1999",7000,"Zaopatrzenie",4,"Syn wlasciciela",70);
//        Pracownik prac4 =  kier1.nowyPracownik();
//        Pracownik prac5 = kier2.nowyPracownik();
//        kier1.wyswietlDane();
//        prac4.wyswietlDane();
        ArrayList <Pracownik> pracownicy = new ArrayList<Pracownik>();
        ArrayList <Kierownik> kierownicy = new ArrayList<Kierownik>();
        pracownicy.add(prac1);
        pracownicy.add(prac2);
        pracownicy.add(prac3);
//        pracownicy.add(prac4);
//        pracownicy.add(prac5);
        kierownicy.add(kier1);
        kierownicy.add(kier2);


        String filenameKier = "Lab7Zadanie2/src/Kierownicy.ser";
        String filenamePrac = "Lab7Zadanie2/src/Pracownicy.ser";
        savingToFile.zapisz(filenameKier,kierownicy,false);
        savingToFile.zapisz(filenamePrac,pracownicy,false);
        System.out.println("----------------KIEROWNICY--KIEROWNICY--KIEROWNICY--KIEROWNICY--KIEROWNICY--KIEROWNICY---------------");
        savingToFile.readKierownik(filenameKier);
        System.out.println("----------------PRACOWNICY--PRACOWNICY--PRACOWNICY--PRACOWNICY--PRACOWNICY--PRACOWNICY---------------");
        savingToFile.readPracownik(filenamePrac);
//        prac1.wyswietlDane();
    }
}

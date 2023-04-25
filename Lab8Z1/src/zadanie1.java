import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe osob: ");
//        int il_osob = sc.nextInt();
        int il_osob = 6;
        ArrayList<Osoba> osoby = new ArrayList<>();
        for(int i = 0; i<il_osob; i++){
            int wybor = (int) Math.round( Math.random() );
            switch (wybor){
                case 0:{

                    double f = Math.random()/Math.nextDown(1.0);
                    double x = 0*(1.0 - f) + 100*f;
                    Osoba kl = new Klient("Janusz","Tracz", (int) x);
                    kl.wypisz();
                    osoby.add(kl);
                    break;
                }
                case 1:{
                    double f = Math.random()/Math.nextDown(1.0);
                    double x = 0*(1.0 - f) + 100*f;
                    double f1 = Math.random()/Math.nextDown(1.0);
                    double y = 0*(1.0 - f1) + 1000*f1;
                    Osoba pr = new Pracownik("Adam","Małysz", (int) x, (int) y);
                    pr.wypisz();
                    osoby.add(pr);
                    break;
                }
            }
            System.out.println(" ");
        }
        System.out.println("Utworzonych obiektow:  " + Osoba.id);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("osoby.ser")));
        for (Osoba os: osoby
             ) {
            out.writeObject(os);
        }
        out.close();
        System.out.println("");
        System.out.println("");
        System.out.println("Odczyt");
        System.out.println("");
        System.out.println("");
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream(new File("osoby.ser")));
        try{
            Osoba wejsciowa =(Osoba) inp.readObject();
            wejsciowa.wypisz();
            while(wejsciowa!=null){
                wejsciowa =(Osoba) inp.readObject();
                wejsciowa.wypisz();
            }

        }catch (NullPointerException | ClassNotFoundException | EOFException ex){
            System.out.println("Koniec pliku");
        }
    }
}

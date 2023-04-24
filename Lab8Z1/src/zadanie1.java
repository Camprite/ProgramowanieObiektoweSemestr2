import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe osob: ");
        int il_osob = sc.nextInt();
        for(int i = 0; i<il_osob; i++){
            int wybor = (int) Math.round( Math.random() );
            switch (wybor){
                case 0:{

                    double f = Math.random()/Math.nextDown(1.0);
                    double x = 0*(1.0 - f) + 100*f;
                    Klient kl = new Klient("Janusz","Tracz", (int) x);
                    kl.wypisz();
                    break;
                }
                case 1:{
                    double f = Math.random()/Math.nextDown(1.0);
                    double x = 0*(1.0 - f) + 100*f;
                    double f1 = Math.random()/Math.nextDown(1.0);
                    double y = 0*(1.0 - f1) + 1000*f1;
                    Pracownik pr = new Pracownik("Adam","Małysz", (int) x, (int) y);
                    pr.wypisz();
                    break;
                }
            }
            System.out.println(" ");
        }
        System.out.println("Utworzonych obiektow:  " + Osoba.id);
    }
}

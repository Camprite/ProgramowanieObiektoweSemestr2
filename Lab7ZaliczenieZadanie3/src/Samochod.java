import java.util.Scanner;
import java.io.Serializable;

public class Samochod implements Serializable {
    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rok_produkcji;//min-max
    private int przebieg;//nieujemny
    public Samochod(String marka ,String model ,String nadwozie ,String kolor ,int rok_produkcji ,int przebieg){
        try {
            this.marka = marka;
            this.model = model;
            this.nadwozie = nadwozie;
            this.kolor = kolor;
            if(rok_produkcji<1995||rok_produkcji>2023){
                throw new Exception("Wprowadzaona data jest nieprawidłowa");
            }
            this.rok_produkcji = rok_produkcji;
            if(przebieg<0){
                throw new Exception("Przebieg nie może być ujemy");
            }
            this.przebieg = przebieg;
        }catch (Exception ex){

        }


    }
    public Samochod(){
        boolean validation = false;
        Scanner sc = new Scanner(System.in);
        while (!validation){
            try {
                System.out.println("TWORZENIE POJAZDU");
                System.out.println();
                System.out.println("Podaj marke");
                marka = sc.nextLine();
                System.out.println("Podaj model");
                model = sc.nextLine();
                System.out.println("Podaj nadwozie");
                nadwozie = sc.nextLine();
                System.out.println("Podaj kolor");
                kolor = sc.nextLine();
                System.out.println("Podaj rok produkcji 1995-2023");
                rok_produkcji = sc.nextInt();
                sc.nextLine();
                if(rok_produkcji<1995||rok_produkcji>2023){
                    throw new Exception("Wprowadzaona data jest nieprawidłowa");
                }
                System.out.println("Podaj przebieg");
                przebieg = sc.nextInt();
                sc.nextLine();
                if(przebieg<0){
                    throw new Exception("Przebieg nie może być ujemy");
                }
                validation = true;
            }catch (Exception ex){
                System.out.println(ex);


            }
        }
    }
    public void Wypisz(){
        System.out.println("--------Samochod----------");
        System.out.println(this.marka);
        System.out.println(this.model);
        System.out.println(this.kolor);
        System.out.println(this.nadwozie);
        System.out.println(this.przebieg);
        System.out.println(this.rok_produkcji);
    }

}

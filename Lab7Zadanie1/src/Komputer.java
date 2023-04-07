import java.util.InputMismatchException;
import java.util.Scanner;

public class Komputer {
    private String producent;
    private String model;
    private String plytaGlowna;
    private String procesor;
    private String kartaGraficzna;
    private int dyskTwardy;
    public Komputer(){
        Scanner sc = null;
        boolean validation = false;
        while(!validation){
        try {
            sc = new Scanner(System.in);
            System.out.println("----------PODAJ-----------");
            System.out.println("----------Producent-----------");
            this.producent = sc.nextLine();
            System.out.println("----------Model-----------");
            this.model = sc.nextLine();
            System.out.println("----------Plyta Główna-----------");
            this.plytaGlowna = sc.nextLine();
            System.out.println("----------Procesor-----------");
            this.procesor = sc.nextLine();
            System.out.println("----------Karta Graficzna-----------");
            this.kartaGraficzna = sc.nextLine();
            System.out.println("----------Dysk Twardy-----------");
            this.dyskTwardy = sc.nextInt();
            if (this.dyskTwardy>0){
                validation = true;
            }

        }catch (InputMismatchException ex){
            System.out.println("PODANA WARTOŚĆ MUSI BYĆ LICZBĄ CAŁKOWITĄ");

        }catch (Exception ex){
            System.out.println("BŁĄD WPROWADZANIA DANYCH");

        }finally {
//        sc.close();

        }
        }

    }
    public Komputer(String producent,String model,String plytaGlowna,String procesor,String kartaGraficzna,int dyskTwardy){
        this.producent = producent;
        this.model = model;
        this.plytaGlowna = plytaGlowna;
        this.procesor = procesor;
        this.kartaGraficzna = kartaGraficzna;
        this.dyskTwardy = dyskTwardy;

    }
    public void wyswietlParametry(){
        System.out.println("----------Producent-----------");
        System.out.println(this.producent);
        System.out.println("----------Model-----------");
        System.out.println(this.model);
        System.out.println("----------Plyta Główna-----------");
        System.out.println(this.plytaGlowna);
        System.out.println("----------Procesor-----------");
        System.out.println(this.procesor);
        System.out.println("----------Karta Graficzna-----------");
        System.out.println(this.kartaGraficzna);
        System.out.println("----------Dysk Twardy-----------");
        System.out.println(this.dyskTwardy);
    }
}

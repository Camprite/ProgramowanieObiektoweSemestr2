import java.io.Serializable;
import java.util.Scanner;

public class SamochodOsobowy extends Samochod implements Serializable {
    double waga; //2-4,5T
    double poj_silnika; //0.8-3.0
    int il_osob; //większe niż 0

    public SamochodOsobowy(){
        super();
        Scanner sc = new Scanner(System.in);
        boolean validation = false;
        while (!validation){
            try{
                System.out.println("Podaj wage");
                this.waga = sc.nextDouble();
                sc.nextLine();
                if(this.waga<2||this.waga>4.5){
                    throw  new Exception("Waga nieprawidłowa");
                }
                System.out.println("Podaj poj silnika");
                this.poj_silnika = sc.nextDouble();
                sc.nextLine();
                if(this.poj_silnika<0.8||this.poj_silnika>3.0){
                    throw new Exception("Pojemnosc silnika nieprawidlowa");
                }
                System.out.println("Podaj poj ilosc osob");
                this.il_osob = sc.nextInt();
                sc.nextLine();
                if(this.il_osob<0){
                    throw new Exception("Ilosc osob nie moze byc ujemna");
                }
                validation = true;
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
    public SamochodOsobowy(String marka ,String model ,String nadwozie ,String kolor ,int rok_produkcji ,int przebieg,double waga, double poj_silnika, int il_osob){
        super(marka, model, nadwozie, kolor, rok_produkcji, przebieg);
        try{
            this.il_osob = il_osob;
            if(this.il_osob<0){
                throw new Exception("Ilosc osob nie moze byc ujemna");
            }
            this.poj_silnika = poj_silnika;
            if(this.poj_silnika<0.8||this.poj_silnika>3.0){
                throw new Exception("Pojemnosc silnika nieprawidlowa");
            }
            this.waga = waga;
            if(this.waga<2||this.waga>4.5){
                throw  new Exception("Waga nieprawidłowa");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    @Override
    public void Wypisz() {
        super.Wypisz();
        System.out.println(this.il_osob);
        System.out.println(this.poj_silnika);
        System.out.println(this.waga);
    }
}

import java.io.FileNotFoundException;
import java.util.ArrayList;
//            int waga; //2-4,5T
//            int poj_silnika; //0.8-3.0
//            int il_osob; //większe niż 0
public class zadanie3 {
    public static void main(String[] args) throws FileNotFoundException {
            Samochod sam1 = new Samochod("Audi","A4","Kombi","Srebrny",2010,150000);
        Samochod sam2 = new Samochod("Skoda","Octavia","Sedan","Czarny",2005,250000);
        Samochod sam3 = new Samochod("BMW","e46","Coupe","Czerwony",2000,450000);
        SamochodOsobowy samos1 = new SamochodOsobowy("Fiat","Tipo","Hatchback","Biały",2002,300000,2,2,4);
        SamochodOsobowy samos2 = new SamochodOsobowy("Alfa Romeo","Julia","Sedan","Zielony",2008,20000,2.3,2.5,5);
        SamochodOsobowy samos3 = new SamochodOsobowy("Volkswagen","t4","Bus","Biały",2007,550000,3.3,3,8);
        ArrayList<Samochod> samochody = new ArrayList<Samochod>();
        ArrayList<SamochodOsobowy> samochodyOs = new ArrayList<SamochodOsobowy>();
        samochody.add(sam1);
        samochody.add(sam2);
        samochody.add(sam3);
        samochodyOs.add(samos1);
        samochodyOs.add(samos2);
        samochodyOs.add(samos3);
        String filename1 = "Lab7Zadanie3/src/Samochody.ser";
        String filename2 = "Lab7Zadanie3/src/SamochodyOs.ser";
        System.out.println("SAMOCHODY1 START");
        OperationOnFile.save(filename1,samochody);
        OperationOnFile.open(filename1);
        System.out.println("SAMOCHODY1 KONIEC");
        System.out.println("SAMOCHODY2 START");
        OperationOnFile.save(filename2,samochodyOs);
        OperationOnFile.open(filename2);
        System.out.println("SAMOCHODY2 KONIEC");


    }
}

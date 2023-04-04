import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner file = null;
        try{
            file = new Scanner(new File("src/numbers.txt"));
        }catch (NullPointerException | FileNotFoundException ex){
            System.out.println(ex);
        }
        try{
        while(file.hasNextInt()){
        int licznik = file.nextInt();
        int mianownik = file.nextInt();
            Ulamek ulamek = new Ulamek(licznik,mianownik);
            if(mianownik==0) throw new NullPointerException("Mianownik nie moze byc zerowy");
            System.out.println("PRZED SKROCENIEM");
            ulamek.wypiszUlamek();
            ulamek.skrocUlamek();
            System.out.println("PO SKROCENIU");
            ulamek.wypiszUlamek();
        }}

        catch (NullPointerException ex){
            System.out.println(ex);
        }
        catch (Exception ex){

        }
    }
}

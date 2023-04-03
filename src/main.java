import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        int a = 0, b=0;
        FileWriter plik = null;
        try {
           plik = new FileWriter("src/pierwsze.txt");
        } catch (FileNotFoundException ex){
            System.out.println(ex);
        }

        boolean validationOfInputScanner = false;
        do{

            try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj a:");
            a = sc.nextInt();
            System.out.println("Podaj b:");
            b = sc.nextInt();
            if(b<a) throw  new InputMismatchException("Zakres nie może być ujemny");
                validationOfInputScanner = true;
                } catch (InputMismatchException ex) {
            System.out.println(ex);}
        }while(!validationOfInputScanner);
        for(int i = a; i<b;i++){
//            if(Liczby.isPerfectNumbers(i)){
//                plik.write(i+" ");
//            }
//            if(Liczby.isArmstrongNumber(i)){
//                plik.write(i+" ");
//            }
//            if(Liczby.isFibbonacciNumber(i)){
//                plik.write(i+" ");
//            }
            if(Liczby.isHappyNumber(i)){
                plik.write(i+" ");
            }
        }




    plik.close();
    }
}

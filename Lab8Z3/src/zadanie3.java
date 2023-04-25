import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class zadanie3 {
    public static void main(String[] args) throws Exception {

        List <Bankier> bankiers = new ArrayList<>();
        for(int i = 0;i<5;i++){

            int liczba = (int) (Math.random()*10);
            int kwota1 = (int) (Math.random()*100);
            int kwota2 = (int) (Math.random()*1000)+kwota1;
            System.out.println("Podane kwoty= " + kwota1 + " Oraz " + kwota2);
            if(liczba%2==0){
                bankiers.add(new UczciwyBankier("Domino"));
                bankiers.get(i).wypisz();
                System.out.println(bankiers.get(i).licz(kwota1,kwota2));
            }
            if(liczba%2==1){
                bankiers.add(new PodstepnyBankier("Sasin"));
                System.out.println(bankiers.get(i).licz(kwota1,kwota2));
                bankiers.get(i).wypisz();

            }
            System.out.println("");
        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("bankierzy.ser")));
               for (Bankier brk:bankiers) {
                   out.writeObject(brk);

               }
               out.close();

               try {


                   ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("bankierzy.ser")));
                   Bankier br = (Bankier) in.readObject();
                   while (br != null) {
                       System.out.println("Bankier");
                       br.wypisz();
                       br = (Bankier) in.readObject();
                   }
               }
               catch (EOFException ex){
                   System.out.println("Koniec pliku");
               }

    }
}

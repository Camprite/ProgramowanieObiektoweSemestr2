import java.io.IOException;
import java.util.ArrayList;

public class zadanie5 {
    public static void main(String[] args) throws IOException {
        Trojkat tr1 = new Trojkat(1,1,4,4,1,4);
        Trojkat tr2 = new Trojkat(1,1,1,0,6,6);
        tr1.czyTrojkatMozliwy();
        tr2.czyTrojkatMozliwy();
        //ŻEBY DZIAŁAŁ ZAPIS KLAS KTÓRE UŻYWAJĄ INNYCH KLAS TRZEBA DO KAŻDEJ DOPISAĆ IMPLEMENTS SERIALIZABKE
        //DO KAŻDEJ!!
        ArrayList<Trojkat> trojkat = new ArrayList<>();
        trojkat.add(tr1);
        trojkat.add(tr2);
        String filename = "Lab7ZaliczenieZadanie5/src/Trojkaty.txt";
        FileWrite.zapisz(trojkat,filename);
    }
}
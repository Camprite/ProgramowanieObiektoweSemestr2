import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class OperationOnFile {
    private OperationOnFile(){};

    public static void save(String filename, ArrayList list) throws FileNotFoundException {
        ObjectOutputStream save = null;
        try {
            save = new ObjectOutputStream(new FileOutputStream(filename));
        }catch (FileNotFoundException ex) {
            System.out.println(ex);
        }catch (IOException ex) {
            System.out.println(ex);
        }
        try {
            for (Object obj: list) {
                if(obj.getClass().getSimpleName() == "Samochod"){
                    Samochod sam = (Samochod) obj;
                    save.writeObject(sam);
                }
                if(obj.getClass().getSimpleName() == "SamochodOsobowy"){
                    SamochodOsobowy sam = (SamochodOsobowy) obj;
                    save.writeObject(sam);
                }
                }
            save.close();
        }catch (Exception ex){
            System.out.println(ex);
            ex.printStackTrace();
        }
        System.out.println("ZAPIS Zakończony pomyślnie ");
    }
    public static void open(String filename){
        ObjectInputStream read = null;
        try {
            read = new ObjectInputStream(new FileInputStream(filename));
        }catch (FileNotFoundException ex) {
            System.out.println(ex);
        }catch (IOException ex) {
            System.out.println(ex);
        }
        boolean isNull = false;
        Object obj = null;
        try {
        while (!isNull){
            obj = read.readObject();
            if(obj.getClass().getSimpleName() == "Samochod"){
                 Samochod sam = (Samochod) obj;
                 sam.Wypisz();
            }
            if(obj.getClass().getSimpleName() == "SamochodOsobowy"){
                SamochodOsobowy sam = (SamochodOsobowy) obj;
                sam.Wypisz();
            }
        }
            read.close();
        }catch (EOFException ex){
            System.out.println("Koniec pliku");
        }
        catch (Exception ex){
            System.out.println(ex);
        }

    }
}

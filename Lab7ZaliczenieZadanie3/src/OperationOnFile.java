import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class OperationOnFile {
    private OperationOnFile(){};

    public static void save(String filename, ArrayList  list) throws IOException {
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
                    save.writeObject(obj);
                }
            }catch (IOException ex) {
            System.out.println(ex);
            }
            catch (Exception ex){
                System.out.println(ex);
                ex.printStackTrace();
            }
          save.close();
            System.out.println("Zapis Zakończony pomyślnie ");
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
       Samochod obj = null;
        try {
            while (!isNull){
                obj =(Samochod) read.readObject();
                obj.Wypisz();
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

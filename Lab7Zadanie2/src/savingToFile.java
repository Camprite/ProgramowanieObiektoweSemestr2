import java.io.*;
import java.util.ArrayList;

public class savingToFile {
    private savingToFile(){
    }
    public static void zapisz(String fileName, ArrayList list,boolean append) throws IOException {
        ObjectOutputStream saving = new ObjectOutputStream(new FileOutputStream(fileName,append));

        list.forEach((o) -> {
            try {
                saving.writeObject(o);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        );
        saving.close();
    }

    public static void readKierownik(String filename) throws IOException, ClassNotFoundException {
        try {
            FileInputStream fin = new FileInputStream(new File(filename));
            ObjectInputStream oin = new ObjectInputStream(fin);
            Kierownik obj = null;
            do{
                obj = (Kierownik) oin.readObject();
                obj.wyswietlDane();
            }while (obj!=null);
        }
        catch (EOFException ex){

        }
        catch (Exception ex){
            System.out.println(ex);
        }


    }
    public static void readPracownik(String filename) throws IOException, ClassNotFoundException {
        try {
            FileInputStream fin = new FileInputStream(new File(filename));
            ObjectInputStream oin = new ObjectInputStream(fin);
            Pracownik obj = null;
            do{
                obj = (Pracownik) oin.readObject();
                obj.wyswietlDane();
            }while (obj!=null);
        }
        catch (EOFException ex){

        }
        catch (Exception ex){
            System.out.println(ex);
        }


    }

}

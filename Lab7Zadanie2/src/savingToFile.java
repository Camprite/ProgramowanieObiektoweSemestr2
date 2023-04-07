import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class savingToFile {
    private savingToFile(){

    }


    public static void zapisz(String fileName, ArrayList list) throws IOException {
        ObjectOutputStream saving = new ObjectOutputStream(new FileOutputStream(fileName));
        list.forEach((o) -> {
            try {
                saving.writeObject(o);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        saving.close();

    }
    public static void odczyt(String filename) throws IOException, ClassNotFoundException {
        System.out.println("Odczytstart");
//        ObjectInputStream o = null;
//        Kierownik obj = null;
//        do {
//            o = new ObjectInputStream
//                    ( new FileInputStream(filename));
//            obj = (Kierownik) o.readObject();
//            obj.wyswietlDane();
//
//        }while (obj!=null);

        ArrayList<Object> objectsList = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))) {
                Object obj = input.readObject();
                if (obj != null) {
                    objectsList.add(obj);
                } else {
                    cont = false;
                }
            } catch (Exception e) {
                // System.out.println(e.printStackTrace());
            }
        }
        System.out.println("Odczytend");
    }

}

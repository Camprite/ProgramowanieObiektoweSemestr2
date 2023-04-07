import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

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

    public static void odczyt(String filename) throws IOException, ClassNotFoundException {

        System.out.println("Odczytstart");
        ArrayList<Kierownik> KierownikList = new ArrayList<>();
        ArrayList<Pracownik> PracownikList = new ArrayList<>();
        boolean cont = true;
        Object obj = null;
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename));
        while (cont) {
            System.out.println("ITERACJA");
            try{

                obj = input.readObject();
                if (obj != null) {
//                    if(1==1){
//                        System.out.println("TAK");
////                        KierownikList.add((Kierownik) obj);
////                        ((Kierownik) obj).wyswietlDane();
//                    }
//                    if(2==2){
                        PracownikList.add((Pracownik) obj);
//                        ((Pracownik) obj).wyswietlDane();
//                    }
                }
                if(obj == null){
                    cont = false;
                }

            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Koniec pliku");
                cont = false;
            }
        }
        System.out.println("Odczytend");
        System.out.println("");
        System.out.println("KIEROWNICY Z PLIKU");
        System.out.println("");
        KierownikList.forEach((e)->{
            e.wyswietlDane();
        });

        System.out.println("");
        System.out.println("PRACOWNICY Z PLIKU");
        System.out.println("");
        PracownikList.forEach((f)->{
            f.wyswietlDane();
        });
    }

}

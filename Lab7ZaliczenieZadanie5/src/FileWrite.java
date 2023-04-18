import java.io.*;
import java.util.ArrayList;

public class FileWrite implements Serializable {
    private  FileWrite(){}

    public static void zapisz(ArrayList<Trojkat> trojkaty,String filename) throws IOException  {
        FileWriter  out = null;

        try {
            out = new FileWriter(filename);
        }catch (Exception ex){
            System.out.println(ex);
        }
        for (Trojkat tr:trojkaty) {
            out.write(tr.wypisz());
            out.write('\n');
        }

        out.close();
    }
}

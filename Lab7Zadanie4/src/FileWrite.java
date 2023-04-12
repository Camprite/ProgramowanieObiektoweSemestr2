import java.io.*;
import java.util.ArrayList;

public class FileWrite implements Serializable {
    private  FileWrite(){}

    public static void zapisz(ArrayList<Trojkat> trojkaty,String filename) throws IOException  {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(filename));
        }catch (Exception ex){
            System.out.println(ex);
        }
        for (Trojkat tr:trojkaty) {
            out.writeObject(tr);
        }

        out.close();
    }
}

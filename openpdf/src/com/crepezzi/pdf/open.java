import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.encryption.StandardDecryptionMaterial;

public class open {
    public static void main(String[] args)
            throws IOException
    {

        // select a file for Decryption operation
        File file = new File("openpdf/src/haslo.pdf");
        PDDocument pdd = null;
        String passwd = "test";
        // Load the PDF file

        try {

             pdd = Loader.loadPDF(file, passwd);
            System.out.println(passwd);

        }catch (InvalidPasswordException ex){

        }

        // removing all security from PDF file
        pdd.setAllSecurityToBeRemoved(true);

        // Save the PDF file
        pdd.save(file);

        // Close the PDF file
        pdd.close();
        System.out.println("Decryption Done...");
    }
}
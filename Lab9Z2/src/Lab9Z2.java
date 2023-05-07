import java.io.*;

public class Lab9Z2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Wydzial wydzial = new Wydzial("Instytut Chemiczny");
        wydzial.addStud("Tytus","Bomba","xD1234","Chemia spożywcza",1,0);
        wydzial.addStud("Albert","Bomba","xD1234","Chemia spożywcza",1,200);
        wydzial.addStud("Szymon","Bomba","xD1234","Chemia spożywcza",1,4000);
        wydzial.addPrac("Szymon","Bomba","xD1234",240);
        wydzial.addPrac("Dawid","Bomba","xD1234",220);
        wydzial.addPrac("Zbigniew","Bomba","xD1234",40);
        wydzial.addPrac("Mirek","Bomba","xD1234",255);
        wydzial.addPrac("Andrzej","Bomba","xD1234",100);
//        wydzial.wypiszStud();
        System.out.println("Suma pensum: "+wydzial.sumaPensum());
        System.out.println("Suma stypendium: "+wydzial.sumaStypencium());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("wydzial.ser")));
        out.writeObject(wydzial);
        out.close();
        System.out.println("Odczyt");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("wydzial.ser")));
        Wydzial input =(Wydzial) in.readObject();
        System.out.println("Pracownicy");
        input.wypiszPrac();
    }
}

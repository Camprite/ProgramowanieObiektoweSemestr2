import java.io.*;

public class zadanie2 {
    public static void main(String[] args) throws Exception {

        Pracownik pr1 = new Pracownik("Andrzej", "Kaczyński", 1,2,3,0.2,0.7,0.1);
        Pracownik pr2 = new Pracownik("Michał", "Głuś", 3,5,7,0.3,0.5,0.2);
        Pracownik pr3 = new Pracownik("Tytus", "Bomba", 2,1,3,0.1,0.1,0.8);

        Uczen uc1 = new Uczen("Kamil","Zdun",2,1,1,0.2,0.2,0.6);
        Uczen uc2 = new Uczen("Damian","Wąsik",2,2,3,0.2,0.2,0.6);
        Uczen uc3 = new Uczen("Wojtciech","Puczyk",5,4,5,0.2,0.2,0.6);

//        System.out.println("Pracownik Test");
//        pr1.info();
//        System.out.println("Uczen Test");
//        uc1.info();

        ObjectOutputStream o = new ObjectOutputStream
                (new FileOutputStream("obiekty.ser"));
        o.writeObject(pr1);
        o.writeObject(pr2);
        o.writeObject(pr3);
        o.writeObject(uc1);
        o.writeObject(uc2);
        o.writeObject(uc3);
        o.close();

        System.out.println("Z pliku :)");
        System.out.println(" ");
        try{
        ObjectInputStream in = new ObjectInputStream
                ( new FileInputStream("obiekty.ser"));
        Osoba obj = (Osoba) in.readObject();
        while (obj!=null){
            obj.info();
            obj = (Osoba) in.readObject();
        }}
        catch (EOFException ex){
            System.out.println("koniec pliku");
        }




    }
}

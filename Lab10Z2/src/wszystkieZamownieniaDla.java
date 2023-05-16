import java.sql.Array;
import java.util.ArrayList;

public class wszystkieZamownieniaDla {


    public static int dostawcy(Dostawca dostawca, ArrayList<Zamowienie> zamowienia){
        int wynik = 0;
        for (Zamowienie zam: zamowienia
             ) {
            if(zam.getDostawca()==dostawca){
                wynik += zam.wartoscZamowienia();
//                System.out.println(zam.wartoscZamowienia());
            }

        }

        return wynik;
    };
    public static int firmy(Sklep sklep, ArrayList<Zamowienie> zamowienia){
        int wynik = 0;

        for (Zamowienie zam: zamowienia
        ) {
            if(zam.getSklep()==sklep){
                wynik += zam.wartoscZamowienia();
            }

        }
        return wynik;
    };



}

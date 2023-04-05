import java.io.IOException;

public class zadanie7 {
    public static void main(String[] args) throws IOException {
        TablicaLiczb  tablica1 = null;
        TablicaLiczb  tablica2 = null;
        try{
            tablica1 = new TablicaLiczb(10);
            tablica2 = new TablicaLiczb(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        tablica1.wpiszDoTablicyZZakresu();
        tablica2.wpiszDoTablicyZZakresu();
        tablica1.wypiszTablice();
        System.out.println("Tab2");
        tablica2.wypiszTablice();
        tablica1.zapiszLiczebnoscElementów(tablica2);
    }
}

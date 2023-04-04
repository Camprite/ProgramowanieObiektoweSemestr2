public class zadanie7 {
    public static void main(String[] args) {
        TablicaLiczb  tablica1 = null;
        TablicaLiczb  tablica2 = null;
        try{
            tablica1 = new TablicaLiczb(10);
            tablica2 = new TablicaLiczb(100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

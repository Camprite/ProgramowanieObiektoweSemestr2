public class TablicaLiczb {
    int[] tablica = null;
    private int length;
    public TablicaLiczb(int length) throws Exception {
        if(length<0) throw new Exception("Rozmiar nie moze byc mniejszy niz 1");
        this.length = length;
        this.tablica = new int[length];
    }
    public void wpiszDoTablicyZZakresu(int odLiczby, int doLiczby){
        for (int i:tablica
             ) {
            tablica[i]= (int)(Math.random() * doLiczby) + odLiczby;
        }
    }
    public void wpiszDoTablicyZZakresu(){
        for (int i:tablica
             ) {
            tablica[i]= (int)(Math.random() * 1000000000) + 1;
        }
    }
    public void wypiszTablice(){
        for (int i:tablica
        ) {
            System.out.println(tablica[i]);
        }
    }


 }

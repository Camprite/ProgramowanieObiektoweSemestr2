import java.io.FileWriter;
import java.io.IOException;

public class TablicaLiczb {
    int[] tablica = null;
    private int length;
    public TablicaLiczb(int length) throws Exception {
        if(length<0) throw new Exception("Rozmiar nie moze byc mniejszy niz 1");
        this.length = length;
        this.tablica = new int[length];
    }
    public void wpiszDoTablicyZZakresu(int odLiczby, int doLiczby){
        for (int i = 0; i< length; i++)  {
            tablica[i]= (int)Math.floor((Math.random() * doLiczby) + odLiczby);
        }
    }
    public void wpiszDoTablicyZZakresu(){
        for (int i = 0; i< length; i++) {
            tablica[i] = (int)Math.floor((Math.random() * 10) + 1);
        }
    }
    public void wypiszTablice(){
        for (int i:this.tablica) {
            System.out.println(i);
        }
    }
    public void zapiszLiczebnoscElementów(TablicaLiczb tab2) throws IOException {
        FileWriter file = new FileWriter("src/liczebnosc.txt");
        for(int i = 0;i<this.length; i++){
            int value = this.tablica[i];
            boolean isBefore = false;
            for (int j = 0; j<i; j++){
                if(tablica[j]==value){
                    isBefore = true;
                }
            }
            int score = 1;
            for (int j = i+1; j<this.length; j++){
                if(this.tablica[j] == value){
                    score++;
                }
            }
            for (int j = 0; j<tab2.length; j++){
                if(tab2.tablica[j] == value){
                    score++;
                }
            }
            if(!isBefore){
            file.write(value + " " + score + "\n");
        }}
        for(int i = 0;i<tab2.tablica.length; i++){
            int score = 0;
            for (int j = 0; j<this.length; j++){
                if(tab2.tablica[i] == tablica[j]){
                    score++;
                }
            }
            if(score==0){
                int value = tab2.tablica[i];
                int liczebnosc = 1;
                boolean isBefore = false;
                for (int j = 0; j<i; j++){
                    if(tab2.tablica[j]==value){
                        isBefore = true;
                    }
                }
                for(int j = i+1 ; j< tab2.tablica.length;j++){
                    if(value == tab2.tablica[j]){
                        liczebnosc++;
                    }
                }
                if(!isBefore){
                    file.write(value + " " + liczebnosc + "\n");
                }
            }

        }
        file.close();

    }


 }

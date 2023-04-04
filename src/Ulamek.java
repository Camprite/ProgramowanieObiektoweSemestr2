public class Ulamek {
    private int licznik;
    private int mianownik;

    Ulamek(int licznik,int mianownik){
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
    void wypiszUlamek(){
        System.out.println(this.licznik+"/"+this.mianownik);
    }
    void skrocUlamek(){
        int a=this.licznik, b = this.mianownik ;
        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        this.licznik = this.licznik/a;
        this.mianownik = this.mianownik/a;
    }

}


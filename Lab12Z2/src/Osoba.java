public class Osoba {
    private String imie;
    private String nazwisko;
    private double wzrost;
    private double waga;

    public Osoba(String imie,String nazwisko, double wzrost, double waga){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public double wagaNaFunty(){
        return this.waga*1.453;
    }
    public double wzrostNaCale(){
        return this.wzrost/2.54;
    }

}

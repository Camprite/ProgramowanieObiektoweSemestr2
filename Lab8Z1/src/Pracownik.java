public class Pracownik extends Osoba{
private int stazPracy;
private int wyplata;
public Pracownik(){
    super();
    this.stazPracy =0;
    this.wyplata =0;
}
public Pracownik(String imie,String nazwisko,int stazPracy,int wyplata){
    super(imie,nazwisko);
    this.stazPracy = stazPracy;
    this.wyplata = wyplata;
}


    @Override
    public void wypisz() {
        System.out.println("Imie: " + this.getImie());
        System.out.println("Nazwisko: " + this.getNazwisko());
        System.out.println("Staz Pracy: " + this.stazPracy);
        System.out.println("Wyplata: " + this.wyplata);
    }
}

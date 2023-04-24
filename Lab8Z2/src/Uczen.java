import java.io.Serializable;

public class Uczen extends Osoba  implements Serializable {
    private int ocena1;
    private int ocena2;
    private int ocena3;
    private double waga1;
    private double waga2;
    private double waga3;
    public Uczen(){
        super();
        this.ocena1 = 4;
        this.ocena2 = 2;
        this.ocena3 = 5;
        this.waga1 = 0.3;
        this.waga2 = 0.2;
        this.waga3 = 0.5;
    }
    public Uczen(String imie, String nazwisko,int ocena1,int ocena2,int ocena3,double waga1,double waga2,double waga3) throws Exception {
        super(imie, nazwisko);
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
        this.ocena3 = ocena3;
        this.waga1 = waga1;
        this.waga2 = waga2;
        this.waga3 = waga3;
        if((waga1+waga2+waga3)!=1) throw new Exception("Suma wag ma wynosić 1");
    }

    @Override
    public double srednia(){
        return (ocena1*waga1 + ocena2*waga2 + ocena3*waga3);
    }
    @Override
    public  void info(){
        System.out.println("Imie:" + this.getImie());
        System.out.println("Nazwisko: " + this.getNazwisko());
        System.out.println("Srednia: " + String.format("%.2f", this.srednia()));

    }
}

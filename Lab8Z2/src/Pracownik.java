import java.io.Serializable;

public class Pracownik extends Osoba implements Serializable {
    private double pobory1;
    private double pobory2;
    private double pobory3;
    private double waga1;
    private double waga2;
    private double waga3;

    public Pracownik(){
        super();
    }
    public Pracownik(String imie, String nazwisko, double pobory1, double pobory2, double pobory3, double waga1, double waga2, double waga3){
        super(imie,nazwisko);
        this.pobory1 = pobory1;
        this.pobory2 = pobory2;
        this.pobory3 = pobory3;
        this.waga1 = waga1;
        this.waga2 = waga2;
        this.waga3 = waga3;
    }

    @Override
    public double srednia(){
        return (pobory1*waga1 + pobory2*waga2 + pobory3*waga3);
    }
    @Override
    public void info(){
        System.out.println("Imie: "+getImie());
        System.out.println("Nazwisko: "+getNazwisko());
        System.out.println("Srednia: "+ String.format("%.2f",this.srednia()));

    }
}

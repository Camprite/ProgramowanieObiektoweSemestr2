import java.io.Serializable;

public class Trojkat implements Serializable {
    private Punkt2D w1;
    private Punkt2D w2;
    private Punkt2D w3;

    public Trojkat() {
        this.w1 = new Punkt2D(0, 0);
        this.w2 = new Punkt2D(0, 0);
        this.w3 = new Punkt2D(0, 0);
    }

    public Trojkat(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.w1 = new Punkt2D(x1, y1);
        this.w2 = new Punkt2D(x2, y2);
        this.w3 = new Punkt2D(x3, y3);
    }
    public boolean czyTrojkatMozliwy() {
        if(this.w1.getPunktX()==this.w2.getPunktX()&&this.w1.getPunktY()==this.w2.getPunktY()){
            System.out.println("Trojkat nie moze byc stworzony");
            return false;
        }
        if(this.w2.getPunktX()==this.w3.getPunktX()&&this.w2.getPunktY()==this.w3.getPunktY()){
            System.out.println("Trojkat nie moze byc stworzony");
            return false;
        }
        if (this.w1.odleglosc(this.w2) + this.w1.odleglosc(this.w3) < this.w2.odleglosc(this.w3)) {
            System.out.println("Trojkat nie moze byc stworzony");
            return false;
        } else {
            System.out.println("Trojkat  moze byc stworzony");
            return true;
        }

    }
    public String wypisz(){
        return ("x1: " + this.w1.getPunktX() + " | y1: " +this.w1.getPunktY() + " | x2: " + this.w2.getPunktX() + " | y2: " +this.w2.getPunktY() + " | x3: " + this.w3.getPunktX() + " | y3: " +this.w3.getPunktY());
    }
}

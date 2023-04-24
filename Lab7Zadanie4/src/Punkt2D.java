import java.io.Serializable;
import java.security.PublicKey;

public class Punkt2D implements Serializable {
    private int x;
    private int y;
    public Punkt2D(){
        this.x=0;
        this.y=0;
    }
    public Punkt2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getPunktX(){
        return this.x;
    }
    public int getPunktY() {
        return this.y;
    }
    public int odleglosc(Punkt2D pkt2){
        int dlugosc= (int) Math.sqrt((Math.pow((pkt2.getPunktX()-this.x),2)+Math.pow((pkt2.getPunktY()-this.y),2)));

        return dlugosc;
    }
}

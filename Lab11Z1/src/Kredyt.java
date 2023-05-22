import java.io.Serializable;

public class Kredyt implements Serializable  {
    private Koszyk koszyk;
    private int il_rat;
    public Kredyt(Koszyk koszyk,int il_rat){
        this.koszyk = koszyk;
        this.il_rat = il_rat;
    }

    public Koszyk getKoszyk() {
        return koszyk;
    }
}

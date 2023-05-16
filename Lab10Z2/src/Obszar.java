import java.io.Serializable;

public class Obszar  implements Serializable {
    String nazwa;
    public Obszar(String nazwa){
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}

import java.io.Serializable;

public class Typ implements Serializable {
private String nazwa;
    public Typ(String nazwa){
    this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

}

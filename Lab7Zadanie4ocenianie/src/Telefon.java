public class Telefon {
    private long nrTelefonu;
    private int czasRozmow;
    private double cenaRozmowy;
    private Telefon(){}
    public Telefon(long nrTelefonu, int czasRozmow, double cenaRozmowy){
        this.nrTelefonu = nrTelefonu;
        this.czasRozmow = czasRozmow;
        this.cenaRozmowy = cenaRozmowy;
    }
    public void zadzwon(){
        System.out.println("Dzwonie");
    }
    public int obliczKwoteDoZaplaty(){
        return ((int)this.czasRozmow*this.czasRozmow);
    }
    public void ustawCeneMinutyRozmowy(double cenaRozmowy){
    this.cenaRozmowy = cenaRozmowy;
    }
}
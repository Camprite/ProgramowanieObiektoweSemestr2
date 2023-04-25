public abstract class Pojazd {
    private String nazwa;
    private int predkosc;
    public Pojazd(){
        this.nazwa = "Default";
        this.predkosc = 0;
    }
    public Pojazd(String nazwa, int predkosc){
        this.nazwa = nazwa;
        this.predkosc = predkosc;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void przyspiesz(int speed){
        this.predkosc +=speed;
    }
    public void zwolnij(int speed){
        this.predkosc -=speed;
    }
    public abstract void info();
}

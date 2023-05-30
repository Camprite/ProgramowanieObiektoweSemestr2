public abstract class Figura {
    private int dlugosc;

    public Figura(){
        this.dlugosc = 10;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public abstract void informacja();
    public abstract void pole();
}

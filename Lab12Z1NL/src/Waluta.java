public class Waluta {
    private double ilosc;

    public Waluta(double ilosc) throws Exception {
        if(ilosc<0) throw new Exception("Ilosc nie moze być ujemna");
        this.ilosc = ilosc;
    }

    public double przeliczNaUSD(){
        return this.ilosc*4.23;
    }
    public double przeliczNaEURO(){
        return this.ilosc*4.52;
    }
}

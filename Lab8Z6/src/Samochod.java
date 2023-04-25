public class Samochod extends Pojazd implements Jedzie{
    private String marka;
    private int przebieg;
public Samochod(String nazwa, int przebieg, int predkosc, String marka){
    super(nazwa, predkosc);
    this.marka = marka;
    this.przebieg = przebieg;
}
    public int getPrzebieg() {
        return przebieg;
    }

    public String getMarka() {
        return marka;
    }

    @Override
    public void jedzie(int predkosc) {
        System.out.println("Samochod jedzie");
        try {
            if(this.getPredkosc()+predkosc<0){
                throw  new Exception("Predkosc nie moze byc ujemna");
            }
            if(this.getPredkosc()+predkosc>100){
                throw  new Exception("Predkosc az tak wysoka");
            }
            this.przebieg += predkosc;
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    @Override
    public void jedzie() {
        System.out.println("Samochod jedzie");
    }


    @Override
    public void info() {
        System.out.println("Nazwa: "+this.getNazwa());
        System.out.println("Predkosc: "+this.getPredkosc());
        System.out.println("Model: "+ this.getMarka());
        System.out.println("Przebieg: "+ this.getPrzebieg());
        this.jedzie();
    }
}

public class Statek extends Pojazd implements Plywa{
    public Statek(String nazwa, int predkosc){
        super(nazwa,predkosc);
    }
    @Override
    public void plyn(int predkosc) {
        System.out.println("Statek plynie");
        try {
            if(this.getPredkosc()+predkosc<0){
                throw  new Exception("Predkosc nie moze byc ujemna");
            }
            if(this.getPredkosc()+predkosc>100){
                throw  new Exception("Predkosc az tak wysoka");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    @Override
    public void plyn() {
        System.out.println("Statek plynie");
    }


    @Override
    public void info() {
        System.out.println("Nazwa: "+this.getNazwa());
        System.out.println("Predkosc: "+this.getPredkosc());
        this.plyn();
    }
}

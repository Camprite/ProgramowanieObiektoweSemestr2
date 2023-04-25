public class Pociag extends Pojazd implements Jedzie{
    public Pociag(String nazwa, int predkosc){
        super(nazwa,predkosc);
    }
    @Override
    public void jedzie(int predkosc) {
        System.out.println("Samochod jedzie");
        try {
            if(this.getPredkosc()+predkosc<0){
                throw  new Exception("Predkosc nie moze byc ujemna");
            }if(this.getPredkosc()+predkosc>10){
                throw  new Exception("Predkosc az tak wysoka");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    @Override
    public void jedzie() {
        System.out.println("Pociag jedzie");
    }


    @Override
    public void info() {
        System.out.println("Nazwa: "+this.getNazwa());
        System.out.println("Predkosc: "+this.getPredkosc());
        this.jedzie();
    }
}

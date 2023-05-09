public class Autobus extends Pojazd{
    private int zuzyciePaliwa;
    public Autobus(int vmax, int nrPojazdu,int zuzyciePaliwa){
        super(vmax,nrPojazdu);
        try{
            if(zuzyciePaliwa<1)throw new Exception("zuzycie nie moze byc tak male");
            this.zuzyciePaliwa = zuzyciePaliwa;
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public int getZuzyciePaliwa() {
        return zuzyciePaliwa;
    }

    public void setZuzyciePaliwa(int zuzyciePaliwa) {
        this.zuzyciePaliwa = zuzyciePaliwa;
    }

    @Override
    public void opis() {
        System.out.println(this.getNumerPojazdu());
        System.out.println(this.getPredkoscMaksymalna());
        System.out.println(this.getNazwaZajezdni());

    }
}

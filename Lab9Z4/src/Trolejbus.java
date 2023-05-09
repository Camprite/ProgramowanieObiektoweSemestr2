public class Trolejbus extends Pojazd{
    private int zuzyciekWh;
    public Trolejbus(int vmax, int nrPojazdu,int zuzyciekWh){
        super(vmax,nrPojazdu);
        try{
            if(zuzyciekWh<1) throw new Exception("zuzycie nie moze byc tak male");
        this.zuzyciekWh = zuzyciekWh;
        }
         catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public int getZuzyciekWh() {
        return zuzyciekWh;
    }

    public void setZuzyciekWh(int zuzyciekWh) {
        this.zuzyciekWh = zuzyciekWh;
    }

    @Override
    public void opis() {
        getNumerPojazdu();
        System.out.println(getNumerPojazdu());
        System.out.println(getPredkoscMaksymalna());
        System.out.println(getNazwaZajezdni());

    }
}

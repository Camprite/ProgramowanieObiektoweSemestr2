public class Tramwaj extends Pojazd {
    private int ilWagonow;
    public Tramwaj(int vmax, int nrPojazdu,int ilWagonow) throws Exception {
        super(vmax,nrPojazdu);
        try {
            if (ilWagonow != 1 || ilWagonow != 2 || ilWagonow != 3) throw new Exception("Zla ilosc wagonow");
            this.ilWagonow = ilWagonow;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public int getIlWagonow() {
        return ilWagonow;
    }

    public void setIlWagonow(int ilWagonow) {
        this.ilWagonow = ilWagonow;
    }

    @Override
    public void opis() {
        System.out.println(this.getNumerPojazdu());
        System.out.println(this.getPredkoscMaksymalna());
        System.out.println(this.getNazwaZajezdni());

    }
}


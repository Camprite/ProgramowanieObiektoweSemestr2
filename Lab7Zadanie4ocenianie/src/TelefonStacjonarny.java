public class TelefonStacjonarny extends Telefon {
    private int nrKierunkowy;

    public TelefonStacjonarny(long nrTelefonu, int czasRozmow, double cenaRozmowy,int nrKierunkowy){
        super(nrTelefonu,czasRozmow,cenaRozmowy);
        this.nrKierunkowy = nrKierunkowy;
    }
}

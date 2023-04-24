public class TelefonKomorkowy extends Telefon {
    private String operator;

    public TelefonKomorkowy(long nrTelefonu, int czasRozmow, double cenaRozmowy,String operator){
        super(nrTelefonu,czasRozmow,cenaRozmowy);
        this.operator = operator;
    }
    public void wyslijSMS(String komunikat){
        System.out.println(komunikat);

    }
}
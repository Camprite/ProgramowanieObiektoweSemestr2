public class zadanie4naocene {
    public static void main(String[] args) {
        //int nrTelefonu, int czasRozmow, double cenaRozmowy,String operator)
        TelefonKomorkowy telkom1 = new TelefonKomorkowy(505123212,20,1.2,"Orange");
        //int nrTelefonu, int czasRozmow, double cenaRozmowy,int nrKierunkowy
        TelefonStacjonarny telstac1 = new TelefonStacjonarny(702242634,40,3.50,48);

        telkom1.wyslijSMS("Wysyłam SMS");
        telstac1.zadzwon();
        System.out.println(telstac1.obliczKwoteDoZaplaty());
    }
}
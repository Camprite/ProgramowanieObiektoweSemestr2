public class Klient extends Osoba{
    private int kwotaZakupow;
    public Klient(){
    super();
    }

    public Klient(String imie, String nazwisko, int kwotaZakupow){
        super(imie,nazwisko);
        this.kwotaZakupow = kwotaZakupow;
    }

    @Override
    public void wypisz() {
        System.out.println("Imie: " + this.getImie());
        System.out.println("Nazwisko: " + this.getNazwisko());
        System.out.println("Kwota Zakupow: " + this.kwotaZakupow);
    }
}

public class Pracownik extends Osoba {
    private String stanowsko;
    private int pensum;
    private String wydzial;

    public Pracownik(String imie,String nazwisko,String stanowsko,int pensum,String nazwaWydzialu){
        super(imie,nazwisko);
        this.stanowsko = stanowsko;
        this.pensum = pensum;
        this.wydzial = nazwaWydzialu;
    }

    public String getStanowsko() {
        return stanowsko;
    }

    public int getPensum() {
        return pensum;
    }

    @Override
    public void wypisz(){
        System.out.println("Imie: ");
        System.out.println(this.getImie());
        System.out.println("Nazwisko: ");
        System.out.println(this.getNazwisko());
        System.out.println("Stanowisko: ");
        System.out.println(this.getStanowsko());
        System.out.println("Pensum: ");
        System.out.println(this.getPensum());
        System.out.println("Wydzial: ");
        System.out.println(this.wydzial);
    }
}

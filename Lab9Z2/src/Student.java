public class Student extends Osoba{
    private String nr_albumu;
    private String kierunek;
    private String wydzial;
    private int rok;
    private int stypendium;
    public Student(String imie,String nazwisko,String nr_albumu,String kierunek,int rok,int stypendium,String wydzial){
        super(imie,nazwisko);
        this.nr_albumu = nr_albumu;
        this.kierunek = kierunek;
        this.rok = rok;
        this.stypendium = stypendium;
        this.wydzial = wydzial;
    }

    public int getStypendium() {
        return stypendium;
    }

    @Override
    public void wypisz(){
        System.out.println("Imie: ");
        System.out.println(this.getImie());
        System.out.println("Nazwisko: ");
        System.out.println(this.getNazwisko());
        System.out.println("Nr albumu: ");
        System.out.println(this.nr_albumu);
        System.out.println("Kierunek: ");
        System.out.println(this.kierunek);
        System.out.println("Wydzial: ");
        System.out.println(this.wydzial);
        System.out.println("Rok: ");
        System.out.println(this.rok);
        if(this.stypendium>0){
            System.out.println("Stypendium wynosi:" + this.stypendium);
        }else {
        System.out.println("Brak stypendium");}
    }
}

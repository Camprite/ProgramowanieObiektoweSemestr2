import java.util.Scanner;

public class Kierownik extends Pracownik{
    private  int ilPodwladnych;
    private  String typKierownictwa;
    private  int dodatekFunkcyjny;

    public Kierownik(String imie,String nazwisko,String dataUrodzenia,String dataZatrudnienia,int pensja,String dzial,int ilPodwladnych,String typKierownictwa,int dodatekFunkcyjny ){
    super(imie, nazwisko, dataUrodzenia, dataZatrudnienia, pensja, dzial);
    this.ilPodwladnych = ilPodwladnych;
    this.typKierownictwa = typKierownictwa;
    this. dodatekFunkcyjny = dodatekFunkcyjny;
    }
    public Kierownik(){
        super();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("-----Kierownik------");
            System.out.println("-----Ilosc podwladnych------");
            ilPodwladnych = sc.nextInt();
            if (ilPodwladnych<0) throw new PracownikExceptions("il podwladnych nie moze byc ujemna");
            System.out.println("-----Typ kierownictwa------");
            typKierownictwa = sc.next();
            System.out.println("-----Dodatek funkcyjny (0-100) %------");
            dodatekFunkcyjny = sc.nextInt();
            if(dodatekFunkcyjny<0||dodatekFunkcyjny>100) throw  new PracownikExceptions("Zakres procentowy wynosi 0-100");

        }catch (PracownikExceptions ex){
            System.out.println(ex);
        }
    }

    @Override
    public void wyswietlDane() {
        super.wyswietlDane();
        System.out.println("-----Ilosc podwladnych------");
        System.out.println(this.ilPodwladnych);
        System.out.println("-----Typ kierownictwa------");
        System.out.println(this.typKierownictwa);
        System.out.println("-----Dodatek funkcyjny (0-100) %------");
        System.out.println(this.dodatekFunkcyjny);

    }
    public Pracownik nowyPracownik(){
        Pracownik prac = new Pracownik();
        return prac;
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Serializable;

public class Pracownik implements Serializable{
    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String dataZatrudnienia;
    private int pensja;
    private String dzial;

    public Pracownik(String imie,String nazwisko,String dataUrodzenia,String dataZatrudnienia,int pensja,String dzial){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.dataZatrudnienia = dataZatrudnienia;
        this.pensja = pensja;
        this.dzial = dzial;
    }
    public Pracownik(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("------------Podaj-----------");
            System.out.println("------------Imie-----------");
            this.imie = sc.next();
            System.out.println("------------Nazwisko-----------");
            this.nazwisko = sc.next();
            System.out.println("------------Data urodzenia-----------");
            this.dataUrodzenia = sc.next();
            System.out.println("------------Data zatrudnienia-----------");
            this.dataZatrudnienia = sc.next();
            System.out.println("------------Pensja-----------");
            this.pensja = sc.nextInt();
            if(this.pensja>10000) throw new PracownikExceptions("Pensja troche za duza");
            if(this.pensja<0) throw  new PracownikExceptions("Pensja nie moze byc ujemnma");
            System.out.println("------------Dział-----------");
            this.dzial = sc.next();

        }
        catch (PracownikExceptions ex){
            System.out.println(ex);
        }
        catch (InputMismatchException ex){
            System.out.println("Wprowadzanie danych nie powiodło się: " + ex);
        }
        catch (Exception ex){
            System.out.println("Coś poszło nie tak: " +ex);
        }

    }

    public void wyswietlDane(){
        System.out.println("------------Dane-----------");
        System.out.println("------------Imie-----------");
        System.out.println(this.imie);
        System.out.println("------------Nazwisko-----------");
        System.out.println(this.nazwisko);
        System.out.println("------------Data urodzenia-----------");
        System.out.println(this.dataUrodzenia);
        System.out.println("------------Data zatrudnienia-----------");
        System.out.println(this.dataZatrudnienia);
        System.out.println("------------Pensja-----------");
        System.out.println(this.pensja);
        System.out.println("------------Dział-----------");
        System.out.println(this.dzial);
    }

}



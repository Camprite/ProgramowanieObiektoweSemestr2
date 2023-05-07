import java.io.Serializable;
import java.util.ArrayList;

public class Wydzial implements Serializable {
    private String nazwaWydzialu;
    private ArrayList<Pracownik> pracownicy = new ArrayList<>();
    private ArrayList<Student> studenci = new ArrayList<>();
    private ArrayList<Osoba> wszyscy = new ArrayList<>();


    public Wydzial(String nazwa){
        this.nazwaWydzialu = nazwa;
    }
    public void addStud(String imie, String nazwisko, String nr_albumu,String kierunek, int rok, int stypendium){
        Student os = new Student(imie, nazwisko, nr_albumu, kierunek, rok, stypendium,this.nazwaWydzialu);
        studenci.add(os);
        wszyscy.add(os);
    }
    public void addPrac(String imie, String nazwisko,String stanowisko,int pensum){
        Pracownik os = new Pracownik(imie,nazwisko,stanowisko,pensum,this.nazwaWydzialu);
        pracownicy.add(os);
        wszyscy.add(os);
    }
public void wypiszStud(){
    for (Osoba stu: this.studenci
         ) {
        stu.wypisz();

    }
}
public void wypiszPrac(){
    for (Osoba prac: this.pracownicy
         ) {
        prac.wypisz();
    }
}
public void wypiszWszystkich(){
    for (Osoba os: this.wszyscy
    ) {
        System.out.println(os.getImie());
        System.out.println(os.getNazwisko());

    }
}
public int sumaStypencium(){
        int suma = 0;
        for(Student stu: this.studenci){
            suma += stu.getStypendium();
        }
        return  suma;
}
public int sumaPensum(){
    int suma = 0;
    for(Pracownik stu: this.pracownicy){
        suma += stu.getPensum();
    }
    return  suma;
}


}

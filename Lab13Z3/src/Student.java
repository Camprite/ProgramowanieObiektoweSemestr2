import java.util.ArrayList;

public class Student {
private String imie;
private String nazwisko;
private ArrayList<Egzamin> oceny = new ArrayList<Egzamin>();




public Student(String imie,String nazwisko){
    this.imie = imie;
    this.nazwisko = nazwisko;
}

public void addOcena(Egzamin ocena) throws Exception {
    if(ocena.getOcena()>5||ocena.getOcena()<1){
        throw new Exception("Ocena źle wprowadzona");
    }else {
        oceny.add(ocena);
    }
}





    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int srednia(){
    int srednia = 0;
    for (Egzamin i:oceny
         ) {
        srednia +=i.getOcena();
    }
    return srednia/oceny.size();
}






}

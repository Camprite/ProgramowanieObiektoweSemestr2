import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        ZajezdniaTrolejbusowa trzaj = new ZajezdniaTrolejbusowa("ZajTroj");
        ZajezdniaAutobusowa zakAu = new ZajezdniaAutobusowa("ZajAut");
        ZajezdniaTramwajowa zajTraj = new ZajezdniaTramwajowa("ZajTraje");

        for (int i = 0; i < 10; i++){
            int rand = (int) ((Math.random() * (4 - 1)) + 1);
            if (rand == 1){
                Trolejbus tr = new Trolejbus((int) ((Math.random() * (10 - 1)) + 1),(int) ((Math.random() * (10 - 1)) + 1),(int) ((Math.random() * (10 - 1)) + 1));
                trzaj.addTrolejbus(tr);
            } else if (rand == 2){
                zakAu.addAutobus(new Autobus((int) ((Math.random() * (100 - 1)) + 1),(int) ((Math.random() * (100 - 1)) + 1),(int) ((Math.random() * (100 - 1)) + 1)));
            } else if (rand == 3){
                zajTraj.addTramwaj(new Tramwaj((int) ((Math.random() * (100 - 1)) + 1),(int) ((Math.random() * (100 - 1)) + 1),(int) ((Math.random() * (100 - 1)) + 1)));
            }
        }
        trzaj.opis();
        System.out.println("ilprad------------------");
        System.out.println(trzaj.zuzyciePraduCalosc());

        zakAu.opis();
        System.out.println("ilpal------------------");
        System.out.println(zakAu.zuzyciePaliwaCalosc());

        zajTraj.opis();
        System.out.println("ilwag------------------");
        System.out.println(zajTraj.iloscWagonowCalosc());
//        Trolejbus tr1 = new Trolejbus(1,1,3);
//        Trolejbus tr2 = new Trolejbus(12,2,6);
//        Trolejbus tr3 = new Trolejbus(14,3,9);
//        trzaj.addTrolejbus(tr1);
//        trzaj.addTrolejbus(tr2);
//        trzaj.addTrolejbus(tr3);
//        System.out.println("zuzycie calosc");
//        System.out.println(trzaj.zuzyciePraduCalosc());
//        System.out.println("opis calosc");
//        trzaj.opis();
//        System.out.println("opis calosc koniec");
//
//        Autobus au1 = new Autobus(122,1,30);
//        Autobus au2 = new Autobus(12,21,320);
//        Autobus au3 = new Autobus(52,3,15);
//        zakAu.addAutobus(au1);
//        zakAu.addAutobus(au2);
//        zakAu.addAutobus(au3);
////        zakAu.pojazdy();
//        System.out.println("op");
//        zakAu.opis();
//        System.out.println("ope");
//        zakAu.zuzyciePaliwaCalosc();
//        System.out.println("pale");
//
//
//        Tramwaj tra1 = new Tramwaj(20,4,2);
//        Tramwaj tra2 = new Tramwaj(25,2,3);
//        Tramwaj tra3 = new Tramwaj(10,7,7);
//        zajTraj.addTramwaj(tra1);
//        zajTraj.addTramwaj(tra2);
//        zajTraj.addTramwaj(tra3);
//        zajTraj.opis();
//        zajTraj.iloscWagonowCalosc();
//        System.out.println("nazwazajezdni dla tramwaju");
//
//        System.out.println(tra1.getNazwaZajezdni());
//        System.out.println("nazwazajezdni dla tramwaju");


    }
}
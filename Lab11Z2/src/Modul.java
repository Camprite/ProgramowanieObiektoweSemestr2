import java.io.Serializable;

public class Modul implements Serializable {

    private Typ typModulu;
    private Slot slot;
    private boolean stan = false;
    private boolean umieszczony = false;
    private String nazwa;
    private String nazwaSlotu;
    private String polka;
    private String regal;
    private String centrala;


        public Modul(Typ typModulu, String nazwa){
             this.nazwa = nazwa;
            this.typModulu = typModulu;
}
    public boolean getStan(){
            return this.stan;
    }


    public void umiescModul(String nazwa, String polka, String regal, String centrala){
            this.nazwaSlotu = nazwa;
            this.polka = polka;
            this.regal = regal;
            this.centrala = centrala;
            this.umieszczony = true;
    }
    public void wlaczModul(){
            this.stan = true;
    }
    public void wylaczModul(){
            this.stan = false;
    }
    public  void wyjmijModul() throws Exception {
            if(this.stan == true) throw new Exception("Moduł aktualnie pracuje");
        this.nazwaSlotu = "" ;
        this.polka = "";
        this.regal = "";
        this.centrala = "";
        this.umieszczony = false;

    }


    public void wypiszWszystko(){
        System.out.println("Slot "+ this.nazwaSlotu);
        System.out.println("Wlaczony: "+ this.stan);
        System.out.println("Umieszczony: "+this.umieszczony);
        System.out.println("Centrala: "+ this.centrala);
        System.out.println("Polka: "+ this.polka);
        System.out.println("Regal: "+ this.regal);
        System.out.println("Typ modulu: "+ this.typModulu.getNazwa());
    }
    public String getTyp(){
        return this.typModulu.getNazwa();
    }
    public Typ getTypObj(){
        return this.typModulu;
    }

}

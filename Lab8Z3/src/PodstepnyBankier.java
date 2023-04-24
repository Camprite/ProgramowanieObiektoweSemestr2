public class PodstepnyBankier extends Bankier{

    public PodstepnyBankier(){
        super("UczciwyBankier");
    }
    public PodstepnyBankier(String imie){
        super(imie);
    }


    @Override
    void wypisz() {
        System.out.println("Podstepny Bankier");
    }

    @Override
    float licz(float arg1, float arg2) {
        return  ((arg1+arg2)*0.8f);
    }
}

public class UczciwyBankier extends Bankier{

    public UczciwyBankier(){
        super("UczciwyBankier");
    }
    public UczciwyBankier(String imie){
        super(imie);
    }


    @Override
    void wypisz() {
        System.out.println("Uczciwy Bankier");
    }

    @Override
    float licz(float arg1, float arg2) {
        return arg1+arg2;
    }
}

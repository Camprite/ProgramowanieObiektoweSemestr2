import java.util.Scanner;

public class KomputerPrzenosny extends Komputer{
    private double waga;
    private int bateria;
    private  boolean bluetooth;
    public KomputerPrzenosny() {
        super();
            boolean validation = false;
        while(!validation){
            try {
                System.out.println("-----------Waga 1,2-3,5Kg-----------");
                Scanner scnew = new Scanner(System.in);
                this.waga = scnew.nextDouble();
                if (this.waga<3.5&&this.waga>1.2){
                    validation = true;
                }
                else {
                    throw  new WagaException();
                }
                System.out.println("-----------Bateria-----------");
                this.bateria = scnew.nextInt();
                System.out.println("-----------Bluetooth  True - False -----------");
                scnew.nextLine(); //GDY CZYTAMY WCZEŚNIEJ INTA NIE PRZESKAKUJE NAM DO NASTEPNEJ LINIJKI SCANNER WIĘC TRZEBA DOSKOCZYĆ SOBIE
                String bluetoothValidation = scnew.nextLine();
                if(bluetoothValidation.charAt(0)=='t'||bluetoothValidation.charAt(0)=='T'){
                    this.bluetooth = true;
                }
                else {
                    this.bluetooth = false;
                }
            } catch (Exception ex) {
                System.out.println(ex);

            }
    }
    }

    @Override
    public void wyswietlParametry() {
        super.wyswietlParametry();
        System.out.println("-----------Waga-----------");
        System.out.println(this.waga);
        System.out.println("-----------Bateria-----------");
        System.out.println(this.bateria);
        System.out.println("-----------Bluetooth-----------");
        if(this.bluetooth){
            System.out.println(":Posiada");
        }else {
        System.out.println(":Nie posiada");}
    }
}

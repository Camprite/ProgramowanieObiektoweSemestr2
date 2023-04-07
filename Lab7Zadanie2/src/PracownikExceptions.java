public class PracownikExceptions extends Exception{
    public  PracownikExceptions(){
      super("Coś poszło nie tak");
      }
    public  PracownikExceptions(String message){
        super(message);
    }
    }

public class Egzamin {
    private int ocena;
    private String przedmiot;
    public Egzamin(int ocena, String przedmiot){
        this.ocena = ocena;
        this.przedmiot = przedmiot;
    }

    public int getOcena() {
        return ocena;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }
}

public class Rettangolo extends Forma{
    public Rettangolo(Integer base, Integer altezza) {
        super(base, altezza);
    }
    public void calcoloArea(){
        Integer calcoloAreaRettangolo= base * altezza;
        System.out.println("Il Area dello Rettangolo è:" + calcoloAreaRettangolo );
    }
}

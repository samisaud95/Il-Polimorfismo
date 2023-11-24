public class Triangolo extends Forma {
    public Triangolo(Integer base, Integer altezza) {
        super(base, altezza);
    }
    public void calcoloArea(){
        Integer calcoloAreaTriangolo= base * altezza / 2;
        System.out.println("Il Area della Triangolo è:" + calcoloAreaTriangolo );
    }
}


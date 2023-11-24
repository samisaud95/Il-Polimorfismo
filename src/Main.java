
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma(9,8);
        Rettangolo rettangolo = new Rettangolo(6,9);
        Triangolo triangolo= new Triangolo(6,6);

        forma.calcoloArea();
        rettangolo.calcoloArea();
        triangolo.calcoloArea();

    }
}
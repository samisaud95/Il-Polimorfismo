public class Forma {
    Integer base;
    Integer altezza;
    Forma(Integer base,Integer altezza){
        this.base=base;
        this.altezza=altezza;
    }
    public Integer getBase(){
        return base;
    }
    public void setBase(){
        this.base=base;
    }
    public Integer getAltezza(){
        return altezza;
    }
    public void setAltezza(){
        this.altezza=altezza;
    }
    public void calcoloArea(){
        System.out.println("Il Area della Forma è:" );
    }
}

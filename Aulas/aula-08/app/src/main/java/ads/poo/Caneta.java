package ads.poo;

public class Caneta {

    private int tinta;
    private String cor;


    public Caneta(int tinta, String cor) {
        this.tinta = tinta;
        this.cor = cor;
    }

    public Caneta(String cor){
        this(100, cor);
    }

    public Caneta(){
        this(100,"Vermelha");
    }





    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTinta(int tinta) {
        this.tinta = tinta;
    }


    public String desenhando(){
        tinta--;
        if(tinta == 0){
            return "Sem tinta!";
        }else{
            return "Dsenhando na cor " + cor;
        }

    }

}

package ads.poo;

public class Caneta {


    private int tinta = 100;

    private String cor = "Preta";




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

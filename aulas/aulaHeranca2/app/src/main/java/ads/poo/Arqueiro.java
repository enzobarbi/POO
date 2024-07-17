package ads.poo;

public class Arqueiro extends Pessoa {

    private int numFlecha;
    public Arqueiro(int vida, int ataque, double velocidade, int numFlecha) {
        super(vida, ataque, velocidade);
        this.numFlecha = numFlecha;
    }

    public String mover(){
        return "Arqueiro" + super.mover();
    }

    public String perderFlecha(){
        this.numFlecha--;
        return " O arqueiro perdeu 1 flecha, flechas totais: " + numFlecha;
    }

    public String atacar(){
        return "Arqueiro" + super.atacar() + this.perderFlecha() ;
    }



}

package ads.poo;

public class Pessoa {
    private int vida;
    private int ataque;
    private double velocidade;




    public String mover(){
        return " está se movendo na velocidade " + getVelocidade();
    }

    public String atacar(){
        return " está atacando com " + getAtaque() + " pontos de ataque.";
    }

    public Pessoa(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}

package ads.poo;

public class Carro {

    private int velocidadeAtual;
    private final int VEL_MAX = 100;

    public Carro(int velocidadeAtual) {

        if(velocidadeAtual < 0 || velocidadeAtual > VEL_MAX){
            this.velocidadeAtual = 0;
        }else{
            this.velocidadeAtual = velocidadeAtual;
        }
    }

    public Carro(){
        this(0);
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int a) {
        int novaVelocidade = velocidadeAtual + a;
        if (novaVelocidade > VEL_MAX){
            velocidadeAtual = VEL_MAX;
        }else{
            velocidadeAtual = novaVelocidade;
        }
    }

    public void freiar(int f) {
        int novaVelocidade = velocidadeAtual - f;
        if (novaVelocidade < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual = novaVelocidade;
        }
    }

    @Override
    public String toString() {
        return "@Carro - " +"velocidadeAtual= " + velocidadeAtual;
    }
}

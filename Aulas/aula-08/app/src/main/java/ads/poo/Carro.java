package ads.poo;

public class Carro {

    private int velocidadeAtual;

    public Carro(int velocidadeAtual) {

        if(velocidadeAtual < 0 || velocidadeAtual > 200){
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
        if (novaVelocidade > 200){
            velocidadeAtual = 200;
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

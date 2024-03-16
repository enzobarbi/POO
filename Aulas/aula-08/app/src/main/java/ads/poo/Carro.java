package ads.poo;

public class Carro {

    private int velocidadeAtual;

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeAtual=" + velocidadeAtual +
                '}';
    }

    /**
     * se velocidade atual for maior que 200 ou menor que 0, entao carro começa com 0
     * @param velocidadeAtual
     */
    public Carro(int velocidadeAtual) {
        if(velocidadeAtual > 200 || velocidadeAtual < 0){
            this.velocidadeAtual = 0;
        } 

    }

    public Carro(){
        this.velocidadeAtual = 0;
    }

    public int acelerar(int a){

        if(this.velocidadeAtual < 200){
            this.velocidadeAtual += a;
        }else{
            this.velocidadeAtual = 200;
        }
        return this.velocidadeAtual;
    }

    public int freiar(int f){
        velocidadeAtual-= f;
        return velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

}

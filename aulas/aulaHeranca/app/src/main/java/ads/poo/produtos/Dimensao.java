package ads.poo.produtos;

public class Dimensao {
    private double altura;
    private double largura;
    private double profundidade;

    public Dimensao(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public String toString() {
        return "Dimensao{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
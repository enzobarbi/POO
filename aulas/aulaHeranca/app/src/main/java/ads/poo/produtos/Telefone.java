package ads.poo.produtos;

public class Telefone {
    private int codigo;
    private String numSerie;
    private String modelo;
    protected double peso;
    private Dimensao dim;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dim) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = dim;
    }


    public String imprimirDados() {
        return "AparelhoTelefonico{" +
                "codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dim=" + dim +
                '}';
    }
}

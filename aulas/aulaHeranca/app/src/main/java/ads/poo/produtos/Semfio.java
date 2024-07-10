package ads.poo.produtos;

public class Semfio extends Telefone {
    private double frequencia;
    private int canais;
    private double distancia;

    public Semfio(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    @Override
    public String imprimirDados() {
        return super.imprimirDados() + ", frequencia= " + frequencia  + ", canais= " + canais + ", distancia= "+ distancia  ;
    }
}

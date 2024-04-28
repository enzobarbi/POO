package ads.poo;

public class Autor {
    private String nome;
    private String nacionalidade;
    
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Autor [nome=" + nome + ", nacionalidade=" + nacionalidade + "]";
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }


}

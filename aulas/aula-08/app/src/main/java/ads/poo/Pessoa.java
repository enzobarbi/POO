package ads.poo;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;


    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nEmail: " + email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

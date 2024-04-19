package ads.poo;

import java.time.LocalDate;

public class Aluno {
    
    private String nome;
    private String matricula;
    private String curso;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    
    public Aluno(String nome, String matricula, String curso, String telefone, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + ", Matricula= " + matricula + ", Curso= " + curso + ", Telefone= " + telefone
                + ", E-mail= " + email + ", Data de Nascimento= " + dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

}
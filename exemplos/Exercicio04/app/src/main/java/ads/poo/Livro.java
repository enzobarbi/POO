package ads.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Double preco;
    private ArrayList<Autor> autores;
    private String isbn;
    
    public boolean addAutor(Autor a){
        return this.autores.add(a);
    }

    public Livro(String titulo, Double preco, ArrayList<Autor> autores, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.autores = autores;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Autor autor: this.autores){
            sb.append(autor);
        }

        return String.format("ISBN: %s, Titulo: %s, preço: %s, autores:%s \n", isbn, titulo, preco, autores);
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public String getIsbn() {
        return isbn;
    }

    

}

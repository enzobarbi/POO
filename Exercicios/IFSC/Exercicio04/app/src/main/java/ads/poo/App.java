package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    
    public static void main(String[] args) {
        HashMap<String, Livro> bancoDeDados =new HashMap<>();
        
        ArrayList<Autor> a = new ArrayList<>();

        a.add(new Autor("JK Rowing", "Britsh"));

        Livro livro1 = new Livro("Harry Potter", 10.00, a, "1234567891012");

        a.add(new Autor("Robert Cecil Martin", "Americano"));

        Livro livro2 = new Livro("Codigo Limpo", 20.0, a, "9780132350884");

        if (!bancoDeDados.containsKey(livro1.getIsbn())) {
            bancoDeDados.put(livro1.getIsbn(), livro1);
            System.out.println("Adicionado com sucesso!");
        }else{
            System.out.println("Ja existe!");
        }

        if (!bancoDeDados.containsKey(livro2.getIsbn())) {
            bancoDeDados.put(livro2.getIsbn(), livro2);
            System.out.println("Adicionado com sucesso!");
        }else{
            System.out.println("Ja existe!");
        }

        if (livro1.getIsbn().equals("1234567891012")){
            livro1.getAutores().add(new Autor("Eichiro Oda", "Japones"));
        }

        if (!bancoDeDados.containsKey(livro1.getIsbn())) {
            bancoDeDados.put(livro1.getIsbn(), livro1);
            System.out.println("Eichiro Oda adicionado!");
            
        }else{
            System.out.println("Ja existe esse livro!");
        }
        
        
        System.out.println(bancoDeDados);
    }
}

package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    
    public static void main(String[] args) {

        HashMap<String, Livro> bancoDeDados = new HashMap<>();
        
        ArrayList<Autor> a = new ArrayList<>();

        ArrayList<Autor> b = new ArrayList<>();

        a.add(new Autor("JK Rowing", "Britsh"));

        Livro livro1 = new Livro("Harry Potter", 180.00, a, "9780545069670");

        b.add(new Autor("Robert Cecil Martin", "Americano"));

        Livro livro2 = new Livro("Codigo Limpo", 94.0, b, "9780132350884");

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

        Livro l = bancoDeDados.get("9780545069670");
        if(l != null){
            Autor c = new Autor("Eichiro Oda", "Japones");
            l.addAutor(c);
        }
        
        System.out.println(bancoDeDados);


    }
}

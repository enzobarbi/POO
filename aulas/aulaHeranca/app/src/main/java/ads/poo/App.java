/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.Semfio;
import ads.poo.produtos.Telefone;

public class App {
    public static void main(String[] args) {
        System.out.println("teste enzo");

        Telefone t = new Telefone(644, "#z7h1","disco", 300.00, new Dimensao(1,2,3));
        Telefone s = new Semfio(123, "#xwtz", "fixo", 200.0, new Dimensao(3,2,1), 2.4, 14, 50 );



        System.out.println(t.imprimirDados());
        System.out.println(s.imprimirDados());

    }


}
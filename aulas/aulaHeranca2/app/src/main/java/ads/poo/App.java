

package ads.poo;

import org.checkerframework.checker.units.qual.C;

public class App {
    public static void main(String[] args) {
        System.out.println("++++++++++ RPG de POO +++++++++++");
        System.out.println(" ");
        Arqueiro arqueiro1 = new Arqueiro(35,2, 1, 10 );

        System.out.println(arqueiro1.atacar());
        System.out.println(arqueiro1.mover());

        System.out.println("-------------------------------------");

        Aldeao aldeao1 = new Aldeao(25, 1, 0.8);
        System.out.println(aldeao1.atacar());
        System.out.println(aldeao1.mover());
        System.out.println(aldeao1.coletaRecurso("machado", "madeira"));
        System.out.println(aldeao1.coletaRecurso("picareta", "pedra"));

        System.out.println("-------------------------------------");

        Cavaleiro cavaleiro1 = new Cavaleiro(50, 3, 2);
        System.out.println(cavaleiro1.atacar());
        System.out.println(cavaleiro1.mover());
    }

}

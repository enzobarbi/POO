/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

public class App {
    public static void main(String[] args) {
        System.out.println("kamehameha");
        Horario h = new Horario(1,0,0);


        System.out.println("horario " + h);
        System.out.println(h.imprimirPorExtenso());
        System.out.println(h.retornarHorarioEmSegundos());

    }
}

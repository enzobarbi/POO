import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pesos dos projetos praticos
        double pesoP1 = 2;
        double pesoP2 = 3;

        // Pesos calculo final
        double pesoProjetos = 0.9;
        double   pesoParticipacao = 0.1;

        System.out.print("Entre com a nota do Projeto 1: ");
        double P1 = teclado.nextInt();
        System.out.print("Entre com a nota do Projeto 2: ");
        double P2 = teclado.nextInt();
        System.out.print("Enter com a nota de Participacao: ");
        double notaDeParticipacao = teclado.nextInt();

        // media ponderada
        double mediaProjetos = (P1 * pesoP1 + P2 * pesoP2) / (pesoP1 + pesoP2);

        // conceito final
        double conceitoFinal = mediaProjetos * pesoProjetos + notaDeParticipacao * pesoParticipacao;

        System.out.printf("Conteito Final: %.1f\n", conceitoFinal);

        //Aprovado ou Reprovado
        if (conceitoFinal >= 6.0){
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}

//import java.util.Scanner;
//
//public class Exercicio01{
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//
//
//        System.out.print("Digite seu nome: ");
//        String nome = teclado.nextLine();
//
//        System.out.print("Digite o ano em que nasceu: ");
//        int anonasc = teclado.nextInt();
//
//        System.out.print("Entre com o ano atual: ");
//        int anoatual = teclado.nextInt();
//
//        int idade = anoatual - anonasc;
//
//        System.out.println(nome + ", possui "+ idade + " anos");
//
//        teclado.close();
//    }
//}

public class Exercicio01{
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Por favor, forneca seu NOME ANO DE NASCIMENTO e o ANO ATUAL");
            return;
        }
        String nome = args[0];
        int anoNasc = Integer.parseInt(args[1]);
        int anoAtual= Integer.parseInt(args[2]);

        int idade = anoAtual - anoNasc;

        System.out.println(nome + ", possui " + idade + " anos");
    }

}
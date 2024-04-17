import java.net.Socket;
import java.net.SocketOption;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Informe a 1ª nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a 2ª nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a 3ª nota:");
        double nota3 = scanner.nextDouble();


        double notaFinal = (nota1 + nota2 + nota3)/3;
        System.out.printf("A nota final do aluno(a) %s é: %.2f%n", nomeAluno, notaFinal);
        if (notaFinal >= 7) {
            System.out.printf("Aprovado");
        } else if (notaFinal >= 5) {
            System.out.printf("Recuperação");
        } else if (notaFinal < 5) {
            System.out.printf("Reprovado");
        }
    }
}

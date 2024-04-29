import java.util.Scanner;

public class Desafio14_media {
    public static void main(String[] args) {
        String n = "n";
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe a 1ª nota:");
            double nota1 = scanner.nextDouble();
            scanner.nextLine(); // Consome o caractere de nova linha restante

            System.out.println("Informe a 2ª nota:");
            double nota2 = scanner.nextDouble();
            scanner.nextLine(); // Consome o caractere de nova linha restante

            double notaFinal = (nota1 + nota2) / 2;
            System.out.printf("A nota final do aluno(a) é: %.2f%n", notaFinal);
            if (notaFinal >= 7) {
                System.out.printf("Aprovado%n");
            } else {
                System.out.printf("Reprovado%n");
            }

            System.out.println("Deseja inserir novos dados: (s/n)");
            n = scanner.nextLine();
        } while (n.equalsIgnoreCase("s"));
    }
}

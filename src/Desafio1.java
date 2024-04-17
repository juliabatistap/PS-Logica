import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de bebida:");
        System.out.println("1. Cerveja");
        System.out.println("2. Agua");
        System.out.println("3. Refrigerante");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Qual sua idade?");
                int idade = scanner.nextInt();
                if (idade < 18) {
                    System.out.println("Compra negada.");
                } else {
                    System.out.println("Compra efetuada com sucesso.");
                }
                break;
            case 2:
            case 3:
                System.out.println("Compra efetuada com sucesso.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
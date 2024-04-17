import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int operacao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o segundo número:");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("O resultado da adição é: %.2f%n", resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("O resultado da subtração é: %.2f%n", resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("O resultado da multiplicação é: %.2f%n", resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("O resultado da divisão é: %.2f%n", resultado);
                } else {
                    System.out.println("Divisão por zero não é permitida");
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        scanner.close();
    }
}

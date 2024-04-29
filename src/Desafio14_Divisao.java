import java.util.Scanner;

public class Desafio14_Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;

        System.out.println("Insira o primeiro valor: ");
        valor1 = scanner.nextInt();

        do {
            System.out.println("Insira o segundo valor (diferente de zero): ");
            valor2 = scanner.nextInt();
        } while (valor2 == 0);

        double resultado = (double) valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);

    }
}

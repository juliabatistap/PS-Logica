import java.util.Scanner;

public class Desafio13_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Insira um numero inteiro entre 1 e 10:");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Tabuada do numero " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

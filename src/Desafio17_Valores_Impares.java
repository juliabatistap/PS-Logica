import java.util.Scanner;

public class Desafio17_Valores_Impares {
    public static void main(String[] args) {
        int N = 10;
        int[] vetor = new int[N];
        int contadorImpares = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.printf("Digite o valor na posicao %d: ", i + 1);
            vetor[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            if (vetor[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.printf("Quantidade de numeros impares: %d\n", contadorImpares);
    }
}

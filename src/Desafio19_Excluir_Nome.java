import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio19_Excluir_Nome {
    public static void main(String[] args) {
        int N = 20;
        String[] nomes = new String[N];
        Set<String> nomesUnicos = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.printf("Digite o nome na posicao %d: ", i + 1);
            nomes[i] = scanner.nextLine();
        }
        scanner.close();

        for (String nome : nomes) {
            nomesUnicos.add(nome);
        }

        System.out.println("Nomes não repetidos:");
        for (String nome : nomesUnicos) {
            System.out.println(nome);
        }
    }
}

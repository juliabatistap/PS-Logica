import java.util.Scanner;

public class Desafio18_Busca_Nome {
    public static void main(String[] args) {
        int N = 10;
        String[] nomes = new String[N];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.printf("Digite o nome na posicao %d: ", i + 1);
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite um novo nome para verificar: ");
        String novoNome = scanner.nextLine();
        scanner.close();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(novoNome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }
}

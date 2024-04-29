import java.util.Scanner;

public class Desafio15_Bloqueio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;
        int tentativas = 3;

        do {
            System.out.println("Informe o usuário:");
            usuario = scanner.nextLine();

            System.out.println("Informe a senha:");
            senha = scanner.nextLine();

            if (usuario.equals("aluno") && senha.equals("segredo")) {
                System.out.println("Bem vindo!");
                break;
            } else {
                tentativas--;
                System.out.println("Login incorreto. Tentativas restantes: " + tentativas);
            }
        } while (tentativas > 0);

        if (tentativas == 0) {
            System.out.println("Acesso bloqueado. Tente novamente mais tarde.");
        }
    }
}

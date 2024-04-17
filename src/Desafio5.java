import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Vendedor:");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Informe o valor do Imável:");
        double valorImovel = scanner.nextDouble();

        double comissao;

        if (valorImovel >= 5000000){
             comissao = valorImovel * 0.2;
        } else if (valorImovel >= 3000000) {
             comissao = valorImovel * 0.15;
        } else {
            comissao = valorImovel * 0.1;
        }

        System.out.printf("A comissão do vendedor %s para esta venda é: %.2f%n", nomeVendedor, comissao);
    }
}

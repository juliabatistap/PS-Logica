import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorTotalAcumulado = 0;

        String continuar;
        do {
            System.out.println("Informe o nome do produto:");
            String nomeProduto = scanner.nextLine();

            System.out.println("Informe o preço do produto:");
            double precoProduto = scanner.nextDouble();
            // Consumir o caractere de nova linha restante após nextDouble()
            scanner.nextLine();

            System.out.println("Informe a quantidade de produtos comprados:");
            int quantidade = Integer.parseInt(scanner.nextLine()); // Ler como string e converter para int

            double valorTotal;

            if (quantidade <= 10) {
                valorTotal = quantidade * precoProduto;
            } else if (quantidade <= 20) {
                valorTotal = quantidade * precoProduto * 0.9; // 10% de desconto
            } else if (quantidade <= 50) {
                valorTotal = quantidade * precoProduto * 0.8; // 20% de desconto
            } else {
                valorTotal = quantidade * precoProduto * 0.75; // 25% de desconto
            }

            valorTotalAcumulado += valorTotal;

            System.out.println("Deseja inserir mais um produto? (s/n)");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotalAcumulado);

        scanner.close();
    }
}

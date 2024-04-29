package vetor;

import java.util.Arrays;

public class Desafio16_Exercicio14 {
    public static void main(String[] args) {
        double v[] = {3.5,6,3,9, -4, 99};
        Arrays.sort(v);
        for (double valor: v){
            System.out.print(valor + " ");
        }
        int p = Arrays.binarySearch(v, 6);
        System.out.println("valor 6 na posição: " + p);

        int j[] = new int[20];
        Arrays.fill(j, 0);
        for (int valor: j){
            System.out.print(valor + " ");
        }
    }
}

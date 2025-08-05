package questao16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("\nTabuada de Multiplicação:");
        for (int i = 1; i <= 10; i++) {
            int resultadoMultiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + resultadoMultiplicacao);
        }
        System.out.println("\nTabuada de Divisão:");
        for (int i = 1; i <= 10; i++) {
            if (i != 0) {
                double resultadoDivisao = (double) numero / i;
                System.out.printf("%d ÷ %d = %.2f\n", numero, i, resultadoDivisao);
            }
        }
        scanner.close();
    }
}

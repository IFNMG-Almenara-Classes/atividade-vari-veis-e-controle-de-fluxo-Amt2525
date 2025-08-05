package questao12;
import java.util.Scanner;
public class Principal {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int quantidadePares = 0;
            int soma = 0;
            int numero;
            
            System.out.println("Digite os números inteiros (digite 0 para encerrar):");
            
            do {
                numero = sc.nextInt();
                
                if (numero != 0) {
                    if (numero % 2 == 0) {
                        quantidadePares++;
                    }
                    soma += numero;
                }
            } while (numero != 0);
            
            int quantidadeTotal = quantidadePares;
            double media = (quantidadeTotal == 0) ? 0 : (double) soma / quantidadeTotal;
            
            System.out.println("Quantidade de números pares digitados: " + quantidadePares);
            System.out.println("Média dos números digitados (excluindo o 0): " + media);

            sc.close();
    }

}
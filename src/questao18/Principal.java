package questao18;
import java.util.Scanner;

public class Principal {
    
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro positivo: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        
        int contadorPrimos = 0;
        for (int i = numero1; i <= numero2; i++) {
            if (ehPrimo(i)) {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de números primos entre " + numero1 + " e " + numero2 + ": " + contadorPrimos);
        

        scanner.close();
        }
    }
}

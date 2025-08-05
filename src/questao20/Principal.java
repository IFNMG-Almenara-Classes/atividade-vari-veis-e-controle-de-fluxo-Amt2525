package questao20;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if ((numero % 3 == 0) ^ (numero % 5 == 0)) {
            if (numero % 3 == 0) {
                System.out.println(numero + " é divisível por 3, mas não por 5.");
            } else {
                System.out.println(numero + " é divisível por 5, mas não por 3.");
            }
        } else {
            System.out.println(numero + " não atende às condições.");
        }

        sc.close();
    }
}
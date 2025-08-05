package questao19;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 7: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Segunda");
                break;
            case 3:
                System.out.print("Terça");
                break;
            case 4:
                System.out.print("Quarta");
                break;
            case 5:
                System.out.print("Quinta");
                break;
            case 6:
                System.out.print("Sexta");
                break;
            case 7:
                System.out.print("Sabado");
                break;
            default:
                System.out.print("Número invalido");
                break;
        }
        sc.close();
    }
}
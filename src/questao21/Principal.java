package questao21;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do trabalhador: ");
        int idade = sc.nextInt();

        System.out.print("Digite o tempo de serviço do trabalhador (em anos): ");
        int tempoServico = sc.nextInt();

        sc.close();

        boolean podeAposentar = false;

        if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
            podeAposentar = true;
        }

        if (podeAposentar) {
            System.out.println("O trabalhador pode se aposentar.");
        } else {
            System.out.println("O trabalhador não pode se aposentar.");
        }


        sc.close();
    }
}
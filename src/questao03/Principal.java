package questao03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n1 = entrada.nextInt();

        if(n1%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        entrada.close();
    }
}

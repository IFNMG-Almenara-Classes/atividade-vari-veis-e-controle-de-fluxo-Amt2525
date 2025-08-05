package questão06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = entrada.nextInt();

        System.out.println("Informe o terceiro número: ");
        int n3 = entrada.nextInt();

        if(n1<n2 && n1<n3){
            System.out.println("O menor é: "+n1);
        }else if(n2<n1 && n2<n3){
            System.out.println("O menor é: "+n2);
        }else{
            System.out.println("O menorr é: "+n3);
        }

        entrada.close();
    }
}


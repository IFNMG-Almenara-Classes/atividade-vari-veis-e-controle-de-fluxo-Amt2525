package questao05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de laranjas compradas: ");
        int quan = entrada.nextInt();

        if(quan<12){
            float preço = quan*0.50f;
            System.out.println("O preço é: "+preço);
        }else{
            float preço = quan*0.30f;
            System.out.println("O preço é: "+preço);
        }

        entrada.close();
    }
}

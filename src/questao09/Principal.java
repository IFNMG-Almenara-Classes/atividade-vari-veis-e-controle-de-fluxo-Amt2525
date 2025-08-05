package questao09;

import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i = 1;
        while (i<=50) {
            System.out.println(i);
            i++;
        }
        entrada.close();
    } 
}
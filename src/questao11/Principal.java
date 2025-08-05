package questao11;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Informe um número inteiro posistivo:");
        int num = sc.nextInt();
        int i =1;
        while (i<num){
            if (i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }


        sc.close();
    }
    
}
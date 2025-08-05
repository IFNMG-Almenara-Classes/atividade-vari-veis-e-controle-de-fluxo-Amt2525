package questao13;
import java.util.Scanner;

    public class Principal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cont = 1;
            while(cont !=0 || cont >55
            ){
                System.out.print("\nEscolha a opção desejada:\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair\n");
                int esc = sc.nextInt();
                if (esc==1){
                    System.out.print("Informe o primeiro numero:");
                int num = sc.nextInt();
                System.out.print("Informe o segundo numero:");
                int num2 = sc.nextInt();
                int soma = num+num2;
                System.out.print("O resultado da operação é:"+soma);
                }
                
                if (esc==2){
                    System.out.print("Informe o primeiro numero:");
                int num = sc.nextInt();
                System.out.print("Informe o segundo numero:");
                int num2 = sc.nextInt();
                int sub = num-num2;
                System.out.print("O resultado da operação é:"+sub);
                }
                if (esc==3){
                    System.out.print("Informe o primeiro numero:");
                int num = sc.nextInt();
                System.out.print("Informe o segundo numero:");
                int num2 = sc.nextInt();
                int mul = num*num2;
                System.out.print("O resultado da operação é:"+mul);
                }
                if (esc==4){
                    System.out.print("Informe o primeiro numero:");
                int num = sc.nextInt();
                System.out.print("Informe o segundo numero:");
                int num2 = sc.nextInt();
                int div = num/num2;
                System.out.print("O resultado da operação é:"+div);
                }
                if (esc == 5){
                    System.out.print("Encerrado");
                    break;
                }
                cont++;
            
            }
            

            sc.close();
    }

}

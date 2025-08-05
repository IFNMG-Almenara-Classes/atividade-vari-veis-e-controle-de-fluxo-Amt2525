package questao14;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Informe o preço da pizza:");
        float vl = sc.nextFloat();

        System.out.print("Informe o seu códico de cliente\n1-Comum\n2-Vip\n3-Funcionario\n");
        int esc = sc.nextInt();

        switch (esc) {
            case 1:
            System.out.print("O valor total a se pagar e:"+vl);
            break;
            case 2:
            float des = (vl*5)/100;
            float tt = vl-des;
            System.out.print("O valor total a se pagar e:"+tt);
            break;
            case 3:
            float des1 = (vl*10)/100;
            float tt1 = vl-des1;
            System.out.print("O valor total a se pagar e:"+tt1);
            break;
            default:

                System.out.print("Erro no codigo de usuario");
            }






        sc.close();
    }
}
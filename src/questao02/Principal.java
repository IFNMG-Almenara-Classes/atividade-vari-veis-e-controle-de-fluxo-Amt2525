package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a sua altura:");
        float alt = entrada.nextFloat();
        System.out.print("Informe o seu peso:");
        int peso = entrada.nextInt();

        float imc = (peso/(alt*alt));

        System.out.println("| IMC         | Classificação                |\n" + //
                        "| ----------- | ---------------------------- |\n" + //
                        "| < 18,5      | Magreza                      |\n" + //
                        "| 18,5 - 24,9 | Saudável                     |\n" + //
                        "| 25,0 - 29,9 | Sobrepeso                    |\n" + //
                        "| 30,0 - 34,9 | Obesidade Grau I             |\n" + //
                        "| 35,0 - 39,9 | Obesidade Grau II (Severa)   |\n" + //
                        "| >= 40       | Obesidade Grau III (mórbida) |");

        if(imc<18.5){
            System.out.println("Seu IMC é: "+imc+" e vocé está no nível: Magreza");
        }else if(imc>=18.5 && imc<=24.9){
            System.out.println("Seu IMC é: "+imc+" e vocé está no nível: Saudável");
        }else if(imc>=25.0 && imc<=29.9){
            System.out.println("Seu IMC é: "+imc+" e vocé está no nível: Sobrepeso");
        }else if(imc>=30.0 && imc<=34.9){
            System.out.println("Seu IMC é: "+imc+" e vocé está no nível: Obesidade Grau I");
        }else if(imc>=35.0 && imc<=39.9){
            System.out.println("Seu IMC é: "+imc+" e vocé está no nível: Obesidade Grau II (Severa)");
        }else if(imc>=40){
            System.out.println("Seu IMC é: "+imc+" e vocé está no nível: Obesidade Grau III (Mórbida)");
        }
        entrada.close();
    }
}

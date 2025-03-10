package ex03;

import java.util.Scanner;

public class CalculadoraSwitchCase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a operação desejada (+,-,*,/): ");
        String opercao = sc.nextLine();
        sc.close();

        switch (opercao) {
            case "+":
                System.out.printf("O resultado da soma é %.2f\n", n1+n2);
                break;
            
            case "-":
                System.out.printf("O resultado da subtraçao é %.2f\n", n1-n2);
                break;

            case "*":
                System.out.printf("O resultado da multiplicação é %.2f\n", n1*n2);
                break;
            
            case "/":
                if(n2 == 0){
                    System.out.println("Não é possivel dividir por 0");
                }
                else{
                    System.out.printf("O resultado da divisão é %.2f\n", n1/n2);
                }
            default:
                break;
        }
    }
}

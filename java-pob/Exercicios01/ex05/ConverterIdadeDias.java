package ex05;

import java.util.Scanner;

public class ConverterIdadeDias {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.close();

        System.out.printf("Quantidade aproximada de dias vividos: %d", idade*365);
    }
}

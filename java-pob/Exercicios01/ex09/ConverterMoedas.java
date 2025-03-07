package ex09;

import java.util.Scanner;

public class ConverterMoedas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor em reais: ");
        float reais = sc.nextFloat();

        System.out.print("Digite a cotação do dolar: ");
        float dolar = sc.nextFloat();
        sc.close();

        float valorDolares = reais/dolar;

        System.out.printf("Valor em dolares: US$%.2f", valorDolares);
        
    }
}

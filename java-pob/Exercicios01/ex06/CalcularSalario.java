package ex06;

import java.util.Scanner;

public class CalcularSalario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario bruto: ");
        float sbruto = sc.nextFloat();

        System.out.print("Digite o desconto em %: ");
        float desconto = sc.nextFloat();
        sc.close();

        float sliquido = sbruto - (sbruto * desconto/100);

        System.out.printf("Salario liquido: %.2f", sliquido);
    }
    
}

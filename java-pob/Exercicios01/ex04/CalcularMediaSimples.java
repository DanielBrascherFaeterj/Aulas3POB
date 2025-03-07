package ex04;

import java.util.Scanner;

public class CalcularMediaSimples {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float n1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float n2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float n3 = sc.nextFloat();
        sc.close();

        float media = (n1 + n2 + n3)/3;

        System.out.printf("Media final: %.2f", media);
    }
}

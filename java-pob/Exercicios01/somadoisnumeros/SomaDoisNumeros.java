package somadoisnumeros;

import java.util.Scanner;

public class SomaDoisNumeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        sc.close();

        System.out.printf("Resultado: %d", n1+n2);
    }
}

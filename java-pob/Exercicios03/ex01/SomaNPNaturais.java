package ex01;

import java.util.Scanner;

public class SomaNPNaturais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, result = 0;

        System.out.print("Digite um numero natural: ");
        numero = sc.nextInt();
        sc.close();

        for(int i = 1; i <= numero; i++){
            result += i;
            System.out.printf("%d n%d \n", result, i);
        }
        System.out.println(result);
    }
}
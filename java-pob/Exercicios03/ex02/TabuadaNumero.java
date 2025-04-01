package ex02;

import java.util.Scanner;

public class TabuadaNumero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();
        sc.close();

        int i = 1;
        while (i <= 10) {
            System.out.println(n*i);
            i++;
        }
    }
}

package ex03;

import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("digite um numero natural: ");
        n = sc.nextInt();
        sc.close();

        do {
            System.out.println(n);
            n--;
        } while (n>-1);
    }
}

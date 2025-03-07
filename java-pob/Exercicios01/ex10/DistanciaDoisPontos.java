package ex10;

import java.util.Scanner;

public class DistanciaDoisPontos {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Digite o valor de x1: ");
        int x1 = sc.nextInt();

        System.out.print("Digite o valor de y1: ");
        int y1 = sc.nextInt();

        System.out.print("Digite o valor de x2: ");
        int x2 = sc.nextInt();

        System.out.print("Digite o valor de y2: ");
        int y2 = sc.nextInt();
        sc.close();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("Distancia: %.2f", distancia);
    }
}

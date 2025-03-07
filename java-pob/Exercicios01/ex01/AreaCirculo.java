package ex01;

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        sc.close();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A area do circulo com raio %.2f é %.2f\n", raio, area);
    }
    
    
}

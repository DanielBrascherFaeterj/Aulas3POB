package ex07;

import java.util.Scanner;

public class CalcularPerimetroArea {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        float base = sc.nextFloat();

        System.out.print("Digite a altura: ");
        float altura = sc.nextFloat();
        sc.close();

        float area = base*altura;
        float perimetro = 2*(base + altura);

        System.out.printf("Valor da area: %.2f\n", area);
        System.out.printf("Valor do perimetro: %.2f", perimetro);
    }
}

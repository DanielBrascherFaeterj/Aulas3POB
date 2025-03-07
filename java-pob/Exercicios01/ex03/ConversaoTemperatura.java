package ex03;

import java.util.Scanner;

public class ConversaoTemperatura {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        sc.close();

        System.out.printf("Temperatura final: %.2f F", ((celsius * 9/5)+32));
    }
}

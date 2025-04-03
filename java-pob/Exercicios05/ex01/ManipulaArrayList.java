package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipulaArrayList {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        
        while (true) {
            System.out.print("Digite um numero (ou 'sair' para finalizar): ");
            String entrada = sc.next();
            
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            
            try {
                int numero = Integer.parseInt(entrada);
                num.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida!");
            }
        }
        
        System.out.printf("Números digitados: %d", num);
        sc.close();
    }
}

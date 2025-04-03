package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaNumerosCalculoMedia {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<>();
        
        System.out.println("Digite numeros (-1 para sair):");
        while (true) {
            double num = sc.nextDouble();
            if (num == -1) {
                break;
            }
            nums.add(num);
        }
        sc.close();

        double soma = 0;
        for (double n : nums) {
            soma += n;
        }
        
        double media = nums.isEmpty() ? 0 : soma / nums.size();
        
        System.out.println("Soma dos numeros: " + soma);
        System.out.println("Media dos numeros: " + media);
        
    }
}

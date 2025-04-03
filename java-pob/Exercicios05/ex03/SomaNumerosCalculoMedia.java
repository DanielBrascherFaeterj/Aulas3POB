package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaNumerosCalculoMedia {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<>();
        
        System.out.println("Digite números (digite -1 para finalizar):");
        while (true) {
            double num = sc.nextDouble();
            if (num == -1) {
                break;
            }
            nums.add(num);
        }
        
        double soma = 0;
        for (double n : nums) {
            soma += n;
        }
        
        double media = nums.isEmpty() ? 0 : soma / nums.size();
        
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        
        sc.close();
    }
}

package ex04;

import java.util.Scanner;

public class NumerosParesArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int array[] = new int[8];
        int quant = 0;

        for(int i = 0; i < 8; i++){
            System.out.print("digite um numero inteiro: ");
            array[i] = sc.nextInt();
            if(array[i] % 2 == 0){
                quant++;
            }
        }
        sc.close();

        System.out.println(quant);
    }
}

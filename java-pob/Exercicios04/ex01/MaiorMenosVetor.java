package ex01;

import java.util.Scanner;

public class MaiorMenosVetor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int menor, maior;

        for(int i = 0; i < 5; i++){
            System.out.print("digite um valor: ");
            array[i] = sc.nextInt();
        }
        sc.close();

        maior = array[0];
        menor = array[0];

        for(int i = 0; i < 5; i++){
            if(maior < array[i]){
                maior = array[i];
            }
            else if(menor > array[i]){
                menor = array[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
}

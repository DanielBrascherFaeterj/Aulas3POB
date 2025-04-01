package ex03;

import java.util.Scanner;

public class InversaoElementosArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int array[] = new int[6];

        for(int i = 0; i < 6; i++){
            System.out.print("digite um numero inteiro: ");
            array[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 5; i >=0; i--){
            System.out.println(array[i]);
        }

    }
}

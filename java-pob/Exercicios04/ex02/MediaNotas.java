package ex02;

import java.util.Scanner;

public class MediaNotas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float array[] = new float[4];
        float tot = 0;

        for(int i = 0; i < 4; i++){
            System.out.print("digite o valor da nota: ");
            array[i] = sc.nextFloat();
            tot += array[i];
        }
        sc.close();

        System.out.println(tot/4);
        if(tot/4 >= 7){
            System.out.println("aprovado!");
        }
        else{
            System.out.println("reprovado!");
        }

    }
}

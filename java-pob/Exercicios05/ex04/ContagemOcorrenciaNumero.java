package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class ContagemOcorrenciaNumero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Numero %d: ", (i + 1));
            nums.add(sc.nextInt());
        }
        
        System.out.print("Digite um numero: ");
        int numP = sc.nextInt();
        sc.close();

        int quant = 0;

        for (int i = 0; i < 10; i++){
            if (nums.get(i) == numP) {
                quant++;
            }
        }

        System.out.printf("O numero %d aparece %d vezes na lista.", numP, quant);
        
    }
}

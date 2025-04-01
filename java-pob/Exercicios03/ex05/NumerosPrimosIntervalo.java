package ex05;

import java.util.Scanner;

public class NumerosPrimosIntervalo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        boolean primo = false;

        System.out.print("Digite o primeiro numero do intervalo(maior que 1): ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo numero do intervalo: ");
        n2 = sc.nextInt();
        sc.close();

        for(int i = n1; i <= n2; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                    break;
                }
                else{
                    primo = true;
                }
            }
            if(primo){
                System.out.println(i);
            }
        }
    }
}

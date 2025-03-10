package ex04;

import java.util.Scanner;

public class VerificarAnoBissexto {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        sc.close();

        if(ano % 4 == 0 && ano % 100 != 0){
            System.out.printf("O ano %d é bissexto!\n", ano);
        }
        else if(ano % 400 == 0){
            System.out.printf("O ano %d é bissexto!\n", ano);
        }
        else{
            System.out.printf("O ano %d não é bissexto!\n", ano);
        }
    }
}

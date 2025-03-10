package ex02;

import java.util.Scanner;

public class ClassificarIdade {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.close();

        if(idade < 18 && idade > 0){
            System.out.println("Voce é menor de idade!");
        }
        else if(idade > 17 && idade < 60){
            System.out.println("Voce é um adulto!");
        }
        else if(idade > 59){
            System.out.println("Voce é um idoso!");
        }
        else{
            System.out.println("Voce ainda não nasceu!");
        }
    }
}

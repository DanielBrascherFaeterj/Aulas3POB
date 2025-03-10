package ex01;

import java.util.Scanner;

public class VerificarNumeroParImpar{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        sc.close();

        if(numero%2 == 0){
            System.out.printf("O numero %d é par\n", numero);
        }
        else{
            System.out.printf("O numero %d é impar!\n", numero);
        }
    }
}
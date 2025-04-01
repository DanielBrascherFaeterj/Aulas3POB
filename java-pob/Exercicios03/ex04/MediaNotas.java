package ex04;

import java.util.Scanner;

public class MediaNotas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant;
        float tot = 0;

        System.out.print("Digite quantos alunos tem na turma: ");
        quant = sc.nextInt();

        for(int i = 0; i < quant; i++){
            System.out.printf("Digite a nota do %d aluno: ", i+1);
            tot += sc.nextFloat();
        }
        sc.close();
        
        System.out.println(tot/quant);
    }
}

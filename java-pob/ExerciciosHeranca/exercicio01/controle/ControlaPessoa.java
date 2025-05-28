package ExerciciosHeranca.exercicio01.controle;

import java.util.ArrayList;
import java.util.Scanner;

import ExerciciosHeranca.exercicio01.dominio.*;

public class ControlaPessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.println("============================================");

        boolean continuar = true;

        while (continuar) {
            System.out.println("Aluno ou Professor:");
            System.out.println("1.Aluno");
            System.out.println("2.Professor");
            System.out.println("3.Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Curso: ");
                String curso = sc.nextLine();

                Aluno alun = new Aluno(nome, idade, curso);
                pessoas.add(alun);

            }
            else if(opcao == 2){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                System.out.print("Salario: ");
                double salario = sc.nextDouble();

                Professor prof = new Professor(nome, idade, salario);
                pessoas.add(prof);

            }
            else if(opcao == 3){
                continuar = false;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }

        sc.close();

        System.out.println("========================");
        System.out.println("Pessoas: ");
        for(Pessoa p: pessoas){
            p.exibirDados();
            System.out.println();
        }
    }
}

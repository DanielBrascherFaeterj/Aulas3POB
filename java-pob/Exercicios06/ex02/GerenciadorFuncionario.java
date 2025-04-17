package ex02;

import ex02.Funcionario;

import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Digite a categoria (A, B ou C): ");
        String categoria = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);

        double salarioFinal = funcionario.calcularSalarioFinal();

        System.out.println("\n--- Resultado ---");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Categoria: " + funcionario.getCategoria());
        System.out.printf("Salário Base: R$%.2f%n", funcionario.getSalarioBase());
        System.out.printf("Salário Final: R$%.2f%n", salarioFinal);

        scanner.close();
    }
}
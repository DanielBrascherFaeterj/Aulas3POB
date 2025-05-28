package ExerciciosHeranca2.exercicio01.controle;

import ExerciciosHeranca2.exercicio01.dominio.Estagiario;
import ExerciciosHeranca2.exercicio01.dominio.Funcionario;
import ExerciciosHeranca2.exercicio01.dominio.Gerente;

public class ControleFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao", 1500);
        Gerente gerente = new Gerente("Ana", 3000);
        Estagiario estagiario = new Estagiario("Lucas", 1000);

        funcionario.exibirDados();
        gerente.exibirDados();
        estagiario.exibirDados();
    }
}

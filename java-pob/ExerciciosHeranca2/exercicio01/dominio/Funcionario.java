package ExerciciosHeranca2.exercicio01.dominio;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salarioBase);
    }

    public double getSalario(){
        return salarioBase;
    }

    public void setSalario(double salario){
        salarioBase = salario;
    }
}
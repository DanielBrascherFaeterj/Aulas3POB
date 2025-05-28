package ExerciciosHeranca.exercicio01.dominio;

public class Professor  extends Pessoa{

    private double salario;

    public Professor(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Salario: " + salario);
    }
}

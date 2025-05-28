package ExerciciosHeranca2.exercicio01.dominio;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public void exibirDados(){
        setSalario(getSalario() *1.05);
        super.exibirDados();
    }

}

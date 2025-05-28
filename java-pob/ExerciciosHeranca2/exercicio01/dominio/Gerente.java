package ExerciciosHeranca2.exercicio01.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public void exibirDados(){
        setSalario(getSalario() *1.2);
        super.exibirDados();
    }

}

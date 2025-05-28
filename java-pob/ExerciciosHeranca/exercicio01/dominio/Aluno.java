package ExerciciosHeranca.exercicio01.dominio;

public class Aluno extends Pessoa{

    private String curso;

    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso(){
        return curso;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Curso: " + curso);
    }
}

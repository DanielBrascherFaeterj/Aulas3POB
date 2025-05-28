package ExerciciosHeranca.exercicio02.controle;

import ExerciciosHeranca.exercicio02.dominio.*;

public class ControleVeiculo {

    public static void main(String[] args) {
        Carro carro = new Carro("HONDA", 2015, 4);
        Moto moto = new Moto("YAMAHA", 2019, true);

        carro.exibirDados();
        moto.exibirDados();

    }
}

package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverElementoLista {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes.add(sc.nextLine());
        }
        
        System.out.print("Digite um nome para remover: ");
        String nomeR = sc.nextLine();
        
        if (nomes.remove(nomeR)) {
            System.out.println("Nome removido com sucesso!");
        } else {
            System.out.println("Nome não encontrado!");
        }
        
        System.out.printf("Lista de nomes atualizada: %s", nomes);
        
        sc.close();
    }
}

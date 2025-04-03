import java.util.Scanner;

public class BuscaElementoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int n;
        boolean confirmar = false;

        for(int i = 0; i < 10; i++){ 
            System.out.print("digite um numero inteiro: ");
            array[i] = sc.nextInt();
        }
        
        System.out.print("Digite um numero para buscar: ");
        n = sc.nextInt();
        sc.close();

        for(int i = 0; i < 10; i++){
            if(array[i] == n){
                System.out.println("numero encontrado!");
                System.out.printf("Sua posição é %d\n", i);
                confirmar = true;
            }
        }

        if(!confirmar){
            System.out.println("Numero não encontrado!");
        }
    }
}

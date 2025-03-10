package ex05;

import java.util.Scanner;

public class ConverterNotaConceito {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 0: case 1: case 2:
                System.out.println("Conceito E");
                break;
            case 3: case 4:
                System.out.println("Conceito D");
                break; 
            
            case 5: case 6:
                System.out.println("Conceito C");
                break; 

            case 7: case 8:
                System.out.println("Conceito B");
                break; 
            
            case 9: case 10:
                System.out.println("Conceito A");
                break; 
        
            default:
                System.out.println("Nota invalida!");
                break;
        }
    }
}

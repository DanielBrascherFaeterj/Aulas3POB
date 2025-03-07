package ex08;

import java.util.Scanner;

public class CalcularVolumeEsfera {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextFloat();
        sc.close();

        double volume =  (4/3.0)*Math.PI*Math.pow(raio, 3);

        System.out.printf("Volume: %.2f", volume);
    }
    
}

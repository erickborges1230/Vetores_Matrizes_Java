package org.Vetores_Matrizes.Vetores;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Calcular_Vetor {
    public static void main(String[] args) {
        int i;
        double A[] = new double[10];
        double B[] = new double[10];
        Scanner teclado = new Scanner(System.in);

        for (i=0; i<10; i++){
            System.out.println("Favor informar o valor de A[ "+i+" ]");
            A[i] = teclado.nextDouble();
            //Alimentar o vetor B
            if(i%2==0) //É par
                B[i] = 2*A[i]; //Vai pegar os número pares do vetor A e multiplicar por 2
            else
                B[i] = A[i]/2; //Vai pegar os números impas do Vetor A e dividir por 2
        }
        for (double valor: A)
            System.out.println("A "+valor);
        System.out.println("**************");
        for(double valor: B)
            System.out.println("B= "+valor);
    }
}

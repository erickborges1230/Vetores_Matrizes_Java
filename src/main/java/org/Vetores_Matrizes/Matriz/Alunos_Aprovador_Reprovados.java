package org.Vetores_Matrizes.Matriz;

import javax.swing.*;
import java.util.Scanner;

public class Alunos_Aprovador_Reprovados {
    public static void main(String[] args) {
        int i, j, aprovados = 0, reprovados = 0;
        double soma=0, media =0;
        String nome;
        String lista_alunos[] = new String[5]; //Nomes dos alunos
        boolean situacao_alunos[] = new boolean[5]; //Informar os alunos aprovados e reprovados
        double notas_alunos[][] = new double[5][4]; //Matriz de notas dos alunos
        Scanner teclado = new Scanner(System.in);

        //Leitura dos alunos a serem inseridos no vetor
        for (i=0; i<5; i++ )
        {
            nome = JOptionPane.showInputDialog("Digite o nome do Alunos");
            lista_alunos[i] = nome;

        for (j=0; j<4; j++) //ler as notas
        {
            System.out.println("favor informar a nota do aluno");
            notas_alunos[i][j] = teclado.nextDouble();
            soma = soma + notas_alunos[i][j];
        }
        media = soma/4;
        if (media < 5)
            situacao_alunos[i] = false;
        else
            situacao_alunos[i] = true;
        soma = 0;

        }
        for (i=0;i<5;i++){
            if(situacao_alunos[i])
                aprovados++;
            else
                reprovados++;
        }
        System.out.println("Aprovados "+aprovados);
        System.out.println("Reprovados "+reprovados);
    }
}

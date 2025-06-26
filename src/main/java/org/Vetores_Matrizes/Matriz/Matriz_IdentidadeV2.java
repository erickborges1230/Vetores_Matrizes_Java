package org.Vetores_Matrizes.Matriz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Matriz_IdentidadeV2 {
    public static void main(String[] args) throws IOException {
        //Contrua uma matriz Identidade I=3 (apenas os valores diagonais são = 1) todos os outros são zero
        int i, j;
        int I[][] = new int[3][3];
        //Arquivos para guardar as informações da Matriz identidade
        FileWriter arq = new FileWriter("Matriz.txt");
        PrintWriter gravaarq = new PrintWriter(arq);

        for(i=0; i<3; i++)
            for (j=0; j<3;j++){
                if (i==j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
                gravaarq.print("=========================");
                arq.close();
                gravaarq.close();
        }
        arq.close();
        gravaarq.close();
    }
}

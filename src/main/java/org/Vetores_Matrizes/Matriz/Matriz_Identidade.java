package org.Vetores_Matrizes.Matriz;

public class Matriz_Identidade {
    public static void main(String[] args) {
        //Contrua uma matriz Identidade I=3 (apenas os valores diagonais são = 1) todos os outros são zerp
        int i, j;
        int I[][] = new int[3][3];

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
                System.out.println(I[i][j]);
            System.out.println();
        }
    }
}

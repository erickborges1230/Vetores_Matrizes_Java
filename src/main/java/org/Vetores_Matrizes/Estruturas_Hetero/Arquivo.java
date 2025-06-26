package org.Vetores_Matrizes.Estruturas_Hetero;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {
    public static void main(String[] args) throws Exception {
        String[] nomes = {"Eliza", "Breno", "Hélio"};
        //Vetores de nomes
        String[] fones = {"1111-2222", "9999-8888", "7773-2222"};
        //Vetores de telefones
        String[] cidades = {"Mossoró", "Apodi", "Assu"};
        //Vetores de cidades

        FileWriter arq = new FileWriter("contatos.txt"); //Nome do arquivo que eu quero que seja criado
        PrintWriter gravaarq = new PrintWriter("arq");
        gravaarq.println("===========================");
        gravaarq.println("Nomes || telefones || Cidades   ");
        for (int i = 0; i < nomes.length; i++){
            gravaarq.print("========================");
                gravaarq.print(nomes[i]+ " || ");
                gravaarq.print(fones[i]+ " || ");
                gravaarq.print(cidades[i]+ " || ");

        }
        gravaarq.print("========================");
        arq.close();
        gravaarq.close();
    }
}

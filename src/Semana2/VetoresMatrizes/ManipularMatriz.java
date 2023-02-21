package Semana2.VetoresMatrizes;

//Figura 16. Exemplo de código para manipular matriz.

public class ManipularMatriz {

    public static void main(String[] args) {
        //Declare uma matriz 5 x 5.
        //Preencha com 1 a diagonal principal e com 0 os demais elementos.
        //Escreva ao final a matriz obtida.

        final int LINHAS = 5;
        final int COLUNAS = 5;


        int [][] matriz = new int[LINHAS][COLUNAS];

        int valor;

        for (int l = 0; l < LINHAS; l++) {
            for (int c = 0; c < COLUNAS; c++){
                if (l == c){
                    valor = 1;
                } else {
                    valor = 0;
                }
                matriz[l][c] = valor;
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }
}

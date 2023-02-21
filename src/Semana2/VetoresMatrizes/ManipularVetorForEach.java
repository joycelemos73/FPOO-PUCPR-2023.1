package Semana2.VetoresMatrizes;

//Figura 15. Exemplo de código para manipular vetor com o iterador for-each.

import java.util.Scanner;

public class ManipularVetorForEach {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] listaLivros = {"Lord of the Rings", "House of the Dragon", "The Witcher"};

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-= TOP 3 LIVROS =-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-\n");

        for (String livro : listaLivros) {
            System.out.println(livro);
        }

    }
}

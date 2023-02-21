package Semana2.VetoresMatrizes;

//Figura 14. Exemplo de código para manipular vetor com for.

import java.util.Scanner;
import java.util.Vector;

public class ManipularVetorFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vector<Integer> idadeFamiliares = new Vector<>();

        Integer numeroFamiliares = 1;

        System.out.print("Sua família tem quantos integrantes? ");
        numeroFamiliares = scanner.nextInt();

        for (int i = 0; i < numeroFamiliares; i++ ){

            System.out.print("Idade do " + (i+1) + "º integrante: ");
            Integer idade = scanner.nextInt();

            idadeFamiliares.add(idade);
        }

        System.out.println("\nIdade dos integrantes da família:");
        for (int i = 0; i < numeroFamiliares; i++ ) {
            System.out.print(idadeFamiliares.get(i) + " ");
        }

    }
}

package Semana2.ComandosDesvioRepeticao;

//Exemplo de código de while e do-while para repetição dependente de condição (decisão)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Figura11_WhileDoWhileRepeticaoDependenteCondicao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaAlunos = new ArrayList<>();

        int continuar = 0;

        while (continuar == 0) {
            System.out.print("Digite o nome do aluno: ");
            String aluno = teclado.next();
            listaAlunos.add(aluno);

            System.out.println("Deseja continuar a adicionar? [0 para continuar] ");
            int sair = teclado.nextInt();

            if (sair != 0){
                continuar = sair;
            }

        }

        System.out.println("\nLista de Alunos\n" + listaAlunos);

    }
}

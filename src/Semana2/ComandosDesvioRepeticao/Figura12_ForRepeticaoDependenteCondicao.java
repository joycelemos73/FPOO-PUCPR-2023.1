package Semana2.ComandosDesvioRepeticao;

//Exemplo de código de for para repetição dependente de condição (decisão).

import java.util.Scanner;

public class Figura12_ForRepeticaoDependenteCondicao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=- CALCULADORA DE MÉDIA -=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        System.out.print("Quantas notas deseja adicionar? ");
        int quantidadeDeNotas = teclado.nextInt();

        int soma = 0;

        for (int i = 1; i <= quantidadeDeNotas; i++) {
            System.out.print(i + "ª nota: ");
            double nota = teclado.nextDouble();
            soma += nota;
        }

        double media = soma / quantidadeDeNotas;

        System.out.println("Média: " + media);


    }
}

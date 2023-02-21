package Semana2.ComandosDesvioRepeticao;

//Exemplo de código de if para desvio dependente de condição (decisão)

import java.util.Scanner;

public class Figura09_IfDesvioDependenteCondicao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Você tem idade o suficiente para dirigir.");
        } else {
            System.out.println("Você ainda não pode dirigir");
        }

    }
}

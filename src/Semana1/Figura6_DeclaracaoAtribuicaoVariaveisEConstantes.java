package Semana1;

//Figura 6. Exemplo de código para declaração e atribuição de variáveis e constantes.

import java.util.Scanner;

public class Figura6_DeclaracaoAtribuicaoVariaveisEConstantes {

    public static void main(String[] args) {

        //conversão de graus Celsius para Fahrenheit

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a temperatura em graus Celsius que você deseja converter para Fahrenheit? ");
        Double celsius  = teclado.nextDouble();

        final Double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Celsius\tFahrenheit\n" +
                celsius + "\t" + fahrenheit);
    }
}

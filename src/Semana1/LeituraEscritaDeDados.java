package Semana1;

//Figura 8. Exemplo de código para leitura e escrita de dados.

import java.util.Scanner;

public class LeituraEscritaDeDados {

    public static void main(String[] args) {

        //Cálculo IMC

        Scanner teclado = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-= CALCULADORA IMC =-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        System.out.print("Informe seu peso em kg: ");
        Double peso = teclado.nextDouble();

        System.out.print("Informe sua altura em metros: ");
        Double altura = teclado.nextDouble();

        Double imc = peso / Math.pow(altura, 2);

        System.out.println("\nPeso\tAltura\tIMC\n" + peso + "\t" + altura + "\t" + imc);


    }
}

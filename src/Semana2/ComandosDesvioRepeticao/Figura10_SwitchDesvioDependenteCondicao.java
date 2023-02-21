package Semana2.ComandosDesvioRepeticao;

//Exemplo de código de switch para desvio dependente de condição (decisão).

import java.util.Scanner;

public class Figura10_SwitchDesvioDependenteCondicao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o seu estado civil.\n[S] Solteiro\n[C] Casado\n[V] Viúvo\n[D] Divorciado\n");
        String escolha = teclado.next().toUpperCase();

        switch (escolha){
            case "S":
                System.out.println("Você é solteiro");
                break;
            case "C":
                System.out.println("Você é casado");
                break;
            case "V":
                System.out.println("Você é viúvo");
                break;
            case "D":
                System.out.println("Você é divorciado");
                break;
            default:
                System.out.println("Erro! Opção inválida.");
        }
    }

}

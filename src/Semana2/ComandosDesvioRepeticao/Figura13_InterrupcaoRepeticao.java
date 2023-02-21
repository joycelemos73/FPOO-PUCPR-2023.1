package Semana2.ComandosDesvioRepeticao;

//Exemplo de código com interrupção de repetição.

public class Figura13_InterrupcaoRepeticao {

    public static void main(String[] args) {

        int contador = 1;

        for (int i = 0; i < contador; i++) {

            contador+=2;

            if (contador%17==0){
                break;
            }

            System.out.println(contador);
        }

    }

}

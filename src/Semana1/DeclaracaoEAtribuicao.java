package Semana1;

//Figura 7. Exemplo de código para declaração e atribuição.

public class DeclaracaoEAtribuicao {

    public static void main(String[] args) {

    //Cálculo da área de cilindro

        Double raioCilindro = 10.5;
        Double alturaCilindro = 2.0;

        Double areaDoCilindo = 2 * Math.PI * raioCilindro * (raioCilindro + alturaCilindro);

        System.out.printf( "%.2f", areaDoCilindo );
    }
}

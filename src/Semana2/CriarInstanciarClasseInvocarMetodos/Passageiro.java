package Semana2.CriarInstanciarClasseInvocarMetodos;

import java.util.Scanner;

public class Passageiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Voo vooJoyce = new Voo();

        vooJoyce.nomePassageiro = "Joyce Lemos";
        vooJoyce.empresaAerea = "Air France";
        vooJoyce.localDePartida = "Guarulhos - GRU";
        vooJoyce.localDeDestino = "Paris Charles de Gaulle - CDG";

        vooJoyce.imprimirInformacoes();

        vooJoyce.imprimirStatusAviao();
        vooJoyce.decolarAviao();
        vooJoyce.imprimirStatusAviao();
    }
}

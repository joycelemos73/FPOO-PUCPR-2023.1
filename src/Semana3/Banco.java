package Semana3;

//Atividade com:
// - modificador de visibilidade: público e privado;
// - método construtor;
// - métodos getter e setter.


import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente();

        System.out.print("Digite seu nome: ");
        String meuNome = scanner.next();
        cliente1.setNome(meuNome);

        System.out.print("Digite seu CPF: ");
        String meuCPF = scanner.next();
        cliente1.setCpf(meuCPF);

        System.out.print("Digite o número da sua conta: ");
        String minhaConta = scanner.next();
        cliente1.setConta(minhaConta);

        Integer opcaoEscolhida = 0;
        while (opcaoEscolhida != 999) {

            System.out.println("\nEscolha uma opção:");
            System.out.println("""
                    [1] Sacar
                    [2] Depositar
                    [3] Ver extrato
                                                
                    [999] SAIR
                    """);
            opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.print("Qual valor você deseja sacar? R$ ");
                Double queroSacar = scanner.nextDouble();
                cliente1.sacar(queroSacar);

            } else if (opcaoEscolhida == 2) {
                System.out.print("Qual valor você deseja depositar? R$ ");
                Double queroDepositar = scanner.nextDouble();
                cliente1.depositar(queroDepositar);

            } else if (opcaoEscolhida == 3) {
                cliente1.imprimirExtrato();
            }

        }
    }

}

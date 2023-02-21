package Semana2.PalavraChaveStatic;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario();

        cadastrarUsuario(scanner, usuario);

        while (!Validator.validar(usuario)){
            cadastrarUsuario(scanner, usuario);
        }

        usuario.imprimirClienteCadastrado();

    }

    private static void cadastrarUsuario(Scanner scanner, Usuario usuario) {
        System.out.print("Digite o nome do usuário: ");
        usuario.nome = scanner.next();

        System.out.print("Digite a idade do usuário: ");
        usuario.idade = scanner.nextInt();

        System.out.print("Digite o CPF do usuário: ");
        usuario.cpf = scanner.next();
    }
}

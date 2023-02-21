package Semana2.PalavraChaveStatic;

public class Usuario {

    public String nome;

    public Integer idade;

    public String cpf;

     void imprimirClienteCadastrado(){
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=- Cadastro cliente -=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}

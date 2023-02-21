package Semana2.PalavraChaveStatic;


public class Validator {

    public final static String MENSAGEM_ERRO = "ERRO! INFORMAÇÕES INVÁLIDAS!";

    public static boolean validar(Usuario usuario){
        if (usuario.nome.length() < 2){
            System.out.println("Digite um nome válido.");
            System.out.println(MENSAGEM_ERRO);
            return false;
        }

        if (usuario.cpf.length() < 8){
            System.out.println("Digite um CPF válido.");
            System.out.println(MENSAGEM_ERRO);
            return false;
        }

        if (usuario.idade < 18){
            System.out.println("Usuário precisa ser maior de idade.");
            System.out.println(MENSAGEM_ERRO);
            return false;
        }

        return true;
    }
}

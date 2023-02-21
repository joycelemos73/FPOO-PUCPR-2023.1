package Semana2.CriarInstanciarClasseInvocarMetodos;

//Figura 4. Arquivo Retangulo.java – verifique os comentários no código para acompanhar o que o programa realiza;
// prossiga nas orientações detalhadas do código, nos itens indicados no material didático autoral.

public class Voo {

    //Atributos da classe = ESTADO da classe

    public String nomePassageiro;

    public String empresaAerea;

    public String localDePartida;

    public String localDeDestino;

    public Boolean decolar = false;


    //Métodos da classe = COMPORTAMENTO da classe

    void imprimirInformacoes(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=- INFORMAÇÕES SOBRE SEU VÔO -=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        System.out.println("\t\t" + empresaAerea);

        System.out.println("Nome do passageiro: " + nomePassageiro);
        System.out.println("Local de partida: " + localDePartida);
        System.out.println("Local de destino: " + localDeDestino);

    }

     void decolarAviao(){
        decolar = true;
//        System.out.println("Avião no ar? " + decolar);
    }

    void imprimirStatusAviao(){
        System.out.println("Avião no ar? " + decolar);
    }


}

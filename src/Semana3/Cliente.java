package Semana3;

public class Cliente {

    private String nome;

    private String conta;

    private String cpf;

    private Double saldo = 0.0;

    public Cliente() {
    }

    public Cliente(String nome, String conta, String cpf, Double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public Boolean sacar(Double valorDeSaque){
        if(valorDeSaque <= this.saldo){
            this.saldo -= valorDeSaque;
            System.out.println("Saque realizado com sucesso!\n");
            return true;
        }
        System.out.println("Saldo insuficiente para esta ação.\n");
        return false;
    }

    public Boolean depositar(Double valorDoDeposito){
        if (valorDoDeposito >= 0){
            this.saldo += valorDoDeposito;
            System.out.println("Depósito realizado com sucesso!\n");
            return true;
        }

        System.out.println("Valor inválido. Tente novamente.\n");
        return false;
    }

    public void imprimirExtrato(){
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-= Extrato Bancário =-=-=");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Cliente: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Conta: " + this.conta);
        System.out.println("Saldo: " + this.saldo);
    }

    //Validação


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() < 8){
            System.out.println("CPF inválido. Tente novamente.\n");
        }
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

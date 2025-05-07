package Model;

public class ContaBancaria {

    ContaBancaria refProximaConta;
    String nome;
    Cliente titular;
    int saldo;


    public ContaBancaria(Cliente cliente) {
        this.saldo = 100;
        this.titular = cliente;
        this.nome = cliente.getNome();
    }

    public String getNome() {
        return nome;
    }

    public ContaBancaria getRefProximaConta() {
        return refProximaConta;
    }

    public void setRefProximaConta(ContaBancaria refProximaConta) {
        this.refProximaConta = refProximaConta;
    }

    // ------ OPERAÇÕES RELACIONADAS AO SALDO

    public void sacar(int valor) {
        this.saldo -= valor;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public int getSaldo() {
        return saldo;
    }
}

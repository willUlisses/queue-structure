package Model;

public class ContaBancaria {
    ContaBancaria refProximaConta;
    String nome;
    int saldo;


    public ContaBancaria(Cliente cliente) {
        this.saldo = 0;
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

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

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public ContaBancaria getRefProximaConta() {
        return refProximaConta;
    }

    public void setRefProximaConta(ContaBancaria refProximaConta) {
        this.refProximaConta = refProximaConta;
    }
}

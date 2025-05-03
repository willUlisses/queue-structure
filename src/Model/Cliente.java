package Model;

public class Cliente {

    private String nome;
    private int numeroDaSenha;
    Cliente refProxCliente;

    public Cliente() { }

    public Cliente(String nome) {
     this.nome = nome;
     this.refProxCliente = null;
    }

    public void setNumeroDaSenha(int numeroDaSenha) {
        this.numeroDaSenha = numeroDaSenha;
    }

    public int getNumeroDaSenha() {
        return numeroDaSenha;
    }

    public String getNome() {
        return nome;
    }

    public Cliente getRefProxCliente() {
        return refProxCliente;
    }

    public void setRefProxCliente(Cliente refProxCliente) {
        this.refProxCliente = refProxCliente;
    }


}

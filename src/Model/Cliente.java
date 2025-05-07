package Model;

public class Cliente {

    private String nome;
    private ContaBancaria contaBancaria;
    private int numeroDaSenha;
    Cliente refProxCliente;
    Documento documento;

    public Cliente() { }

    public Cliente(String nome, int vencimento) {
     this.nome = nome;
     setDoc(vencimento);
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

    public void setDoc(int vencimento) {
        Documento doc = new Documento(vencimento);
        this.documento = doc;
    }

    public Documento getDocumento() {
        return documento;
    }

    public int getDataVencimentoDocumento() {
        return documento.getVencimento();
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}

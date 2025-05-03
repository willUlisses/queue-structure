package Model;

public class Documento {

    private int vencimento;
    Documento refProxDocumento;
    private boolean validade;

    public Documento() {  }

    public Documento (int vencimento) {
        this.validade = true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public void setValidade(boolean validade) {
        this.validade = validade;
    }

    public boolean isValidade() {
        return validade;
    }

    public Documento getRefProxDocumento() {
        return refProxDocumento;
    }

    public void setRefProxDocumento(Documento refProxDocumento) {
        this.refProxDocumento = refProxDocumento;
    }
}

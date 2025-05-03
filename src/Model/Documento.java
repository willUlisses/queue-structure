package Model;

public class Documento {

    String tipo;
    Documento refProxDocumento;
    private boolean validade;

    public Documento() {  }

    public Documento (String tipoDoc) {
        this.tipo = tipoDoc;
        this.validade = true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

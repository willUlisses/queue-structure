package Model;

public class Documento {

    Documento tipo;
    Documento refProxDocumento;
    private boolean validade;

    public Documento() {  }

    public Documento (Documento tipoDoc, boolean validade) {
        this.tipo = tipoDoc;
        this.validade = validade;
    }

    public Documento getTipo() {
        return tipo;
    }

    public void setTipo(Documento tipo) {
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

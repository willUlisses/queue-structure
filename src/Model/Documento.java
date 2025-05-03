package Model;

public class Documento {

    private int vencimento;
    Documento refProxDocumento;

    public Documento() {  }

    public Documento (int vencimento) {
        this.vencimento = vencimento;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }


    public Documento getRefProxDocumento() {
        return refProxDocumento;
    }

    public void setRefProxDocumento(Documento refProxDocumento) {
        this.refProxDocumento = refProxDocumento;
    }
}

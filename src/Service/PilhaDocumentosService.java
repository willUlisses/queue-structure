package Service;

import Model.Documento;

public class PilhaDocumentosService {
    Documento refProximo;
    Documento topo;


    public PilhaDocumentosService() {
        this.refProximo = null;
        this.topo = null;
    }

    void push(String tipo) {
        Documento novoDoc = new Documento(tipo);
        refProximo = topo;
        topo = novoDoc;
        novoDoc.setRefProxDocumento(refProximo);
    }

    Documento top() {
        if (isEmpty()) {
            throw new IllegalStateException("A Pilha já está vazia");
        } else
            return topo;
    }

    void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A Pilha já está vazia");
        } else
            topo = topo.getRefProxDocumento();
    }


    private boolean isEmpty() {
        return topo == null;
    }

}






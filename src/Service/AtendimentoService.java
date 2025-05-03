package Service;

import Model.Cliente;


public class AtendimentoService {

    FilaClientesService filaClientes = new FilaClientesService();
    PilhaDocumentosService pilhaDocumentos = new PilhaDocumentosService();

    public boolean verificaDocumento() {
        return chamarCliente().getDataVencimentoDocumento() < 2025;
    }

    public void adicionarClienteNaFila(String nome, int vencimentoDocumento) {
        filaClientes.enqueue(nome, vencimentoDocumento);
    }

    public Cliente chamarCliente() {
        return filaClientes.first();
    }

    public String finalizarAtendimento() {
        filaClientes.dequeue();
        return "Atendimento Finalizado";
    }





}

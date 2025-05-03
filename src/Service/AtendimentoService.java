package Service;

import Model.Cliente;


public class AtendimentoService {

    FilaClientesService filaClientes = new FilaClientesService();
    PilhaDocumentosService pilhaDocumentos = new PilhaDocumentosService();

    public String verificaDocumento() {
        return chamarCliente().getDataVencimentoDocumento() < 2025 ? "Documento invalido" : "Documento válido";
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

package Service;

import Model.Cliente;


public class AtendimentoService {

    FilaClientesService filaClientes = new FilaClientesService();
    PilhaDocumentosService pilhaDocumentos = new PilhaDocumentosService();

    public void adicionarClienteNaFila(String nome) {
        filaClientes.enqueue(nome);
    }

    public Cliente chamarCliente() {
        return filaClientes.first();
    }

    public String finalizarAtendimento() {
        filaClientes.dequeue();
        return "Atendimento Finalizado";
    }





}

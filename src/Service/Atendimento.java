package Service;

import Utils.MenuAtendimento;


public class Atendimento {

    FilaClientes filaClientes = new FilaClientes();
    PilhaDocumentos pilhaDocumentos = new PilhaDocumentos();


    public boolean verificaDocumento() {
        return filaClientes.first().getDataVencimentoDocumento() > 2025;
    }

    public void adicionarClienteNaFila(String nome, int vencimentoDocumento) {
        filaClientes.enqueue(nome, vencimentoDocumento);
    }

    public String chamarCliente() {
        if (filaClientes.first() != null) {
            return filaClientes.first().getNome();
        }
        return "Não há clientes na fila.";
    }

    public String finalizarAtendimentoCliente() {
        filaClientes.dequeue();
        return "Atendimento Finalizado";
    }

    public String verFila() {
        return filaClientes.toString();
    }
}

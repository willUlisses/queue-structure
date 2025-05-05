package Service;

import Model.Cliente;
import Utils.MenuAtendimento;

import java.util.Scanner;


public class AtendimentoService {

    FilaClientesService filaClientes = new FilaClientesService();
    PilhaDocumentosService pilhaDocumentos = new PilhaDocumentosService();


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

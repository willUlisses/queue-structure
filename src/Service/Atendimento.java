package Service;


import Model.Cliente;

import java.util.Scanner;

public class Atendimento {

    FilaClientes filaClientes = new FilaClientes();
    ListaContas listaContas = new ListaContas();


    public boolean verificaDocumento() {
        return filaClientes.first().getDataVencimentoDocumento() > 2025;
    }

    public void adicionarClienteNaFila(String nome, int vencimentoDocumento) {
        filaClientes.enqueue(nome, vencimentoDocumento);
    }

    public Cliente chamarCliente() {
        if (filaClientes.first() != null) {
            return filaClientes.first();
        }
        throw new IllegalStateException("Não há clientes na fila");
    }


    public String finalizarAtendimentoCliente() {
        filaClientes.dequeue();
        return "Atendimento Finalizado";
    }

    public String verFila() {
        return filaClientes.toString();
    }


}

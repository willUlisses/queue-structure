package Service;

import Model.Cliente;
import Model.ContaBancaria;

public class Atendimento {

    FilaClientes filaClientes = new FilaClientes();

    public boolean verificaDocumento(Cliente cliente) {
        cliente = filaClientes.first();
        return cliente.getDataVencimentoDocumento() > 2025;
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
        return "Atendimento Finalizado \n";
    }

    public String verFila() {
        return filaClientes.toString();
    }

    public String verDadosContaBancaria(ContaBancaria conta) {
        String stringDados = "------ DADOS DA CONTA: ------\n" +
                "Titular: " + conta.getNome() + "\n" +
                "Saldo: " + conta.getSaldo() + "\n" +
                "Número: " + filaClientes.numeroDaSenha + "\n" +
                "-----------------------------\n";
        return stringDados;
    }


}

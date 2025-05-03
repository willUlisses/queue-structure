package Service;

import Model.Cliente;

public class FilaClientesService {
    private Cliente primeiro;
    private Cliente ultimo;
    private Cliente refEntrada;
    int numeroDaSenha;

    public FilaClientesService() {
        this.primeiro = null;
        this.ultimo = null;
        this.refEntrada = null;
        this.numeroDaSenha = 1;
    }

    void enqueue(String nome) {
        Cliente novoCliente = new Cliente(nome);
        if (isEmpty()) {
            primeiro = novoCliente;
            ultimo = novoCliente;
            novoCliente.setNumeroDaSenha(numeroDaSenha++);
        } else {
            ultimo.setRefProxCliente(novoCliente);
            ultimo = novoCliente;
            novoCliente.setNumeroDaSenha(numeroDaSenha++);
        }
    }

    void dequeue() {
        if (!isEmpty()) {
            primeiro = primeiro.getRefProxCliente();
        } else {
            throw new IllegalStateException("A fila está vazia");
        }
    }

    Cliente first() {
        return primeiro;
    }

    private boolean isEmpty() {
        return primeiro == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "Fila de Clientes:\n";
        stringRetorno += "-----------------\n";

        Cliente refAuxiliar = primeiro;
        stringRetorno += "Inicio == ";
        while (true) {
            stringRetorno += "{Cliente: " + refAuxiliar.getNome() + ", Senha: " + refAuxiliar.getNumeroDaSenha() + "} --> ";
            if (refAuxiliar.getRefProxCliente() != null) {
                refAuxiliar = refAuxiliar.getRefProxCliente();
            } else {
                stringRetorno += "fim";
                break;
            }
        }
        return stringRetorno;
    }

}

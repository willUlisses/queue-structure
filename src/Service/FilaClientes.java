package Service;

import Model.Cliente;

public class FilaClientes {
    private Cliente primeiro;
    private Cliente ultimo;
    private Cliente refEntrada;
    int numeroDaSenha;

    public FilaClientes() {
        this.primeiro = null;
        this.ultimo = null;
        this.refEntrada = null;
        this.numeroDaSenha = 1;
    }

    void enqueue(String nome, int vencimentoDoc) {
        Cliente novoCliente = new Cliente(nome, vencimentoDoc);
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
        String stringRetorno = "FILA DE CLIENTES:\n";
        stringRetorno += "-----------------\n";

        Cliente refAuxiliar = primeiro;

        if (refAuxiliar == null) {
            stringRetorno += "A fila está vazia\n";
            return stringRetorno;
        }

        stringRetorno += "Inicio == ";
        while (true) {
            stringRetorno += "{Cliente: " + refAuxiliar.getNome() + ", Senha: " + refAuxiliar.getNumeroDaSenha() + "} --> ";
            if (refAuxiliar.getRefProxCliente() != null) {
                refAuxiliar = refAuxiliar.getRefProxCliente();
            } else {
                stringRetorno += "fim\n";
                break;
            }
        }
        return stringRetorno;
    }

}

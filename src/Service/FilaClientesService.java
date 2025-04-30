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

    public void enqueue(Cliente novoCliente) {
        if (isEmpty()) {
            primeiro = novoCliente;
            ultimo = novoCliente;
            refEntrada = ultimo;
            novoCliente.setNumeroDaSenha(numeroDaSenha++);
        } else {
            refEntrada.setRefProxCliente(novoCliente);
            ultimo = novoCliente;
            refEntrada = ultimo;
            novoCliente.setNumeroDaSenha(numeroDaSenha++);
        }
    }

    public void dequeue() {
        Cliente refDequeued;
        if (!isEmpty()) {
            refDequeued = primeiro;
            primeiro = primeiro.getRefProxCliente();
        }
    }

    private boolean isEmpty() {
        return primeiro == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "Fila de Clientes:\n";
        stringRetorno += "---------------\n";

        Cliente refAuxiliar = primeiro;
        stringRetorno += "Inicio == ";
        while (true) {
            stringRetorno += "{Cliente: " + refAuxiliar.getNumeroDaSenha() + "} --> ";
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

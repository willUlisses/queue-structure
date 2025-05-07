package Service;

import Model.Cliente;
import Model.ContaBancaria;

public class ListaContas {
    ContaBancaria refEntrada;
    int tamanho;

    public ListaContas() {
        this.refEntrada = null;
        this.tamanho = 0;
    }

    public void criarConta(Cliente cliente) {
        ContaBancaria contaCriada = new ContaBancaria(cliente);
        cliente.setContaBancaria(contaCriada);
        add(contaCriada);
    }

    private void add(ContaBancaria novaConta) {
        if (this.isEmpty()) {
            refEntrada = novaConta;
            return;
        } else {
            ContaBancaria refAuxiliar = refEntrada;
            while (refAuxiliar.getRefProximaConta() != null) {
                refAuxiliar = refAuxiliar.getRefProximaConta();
            }
            refAuxiliar.setRefProximaConta(novaConta);
        }
    }

    ContaBancaria getConta(int index) {
        ContaBancaria refAuxiliar = refEntrada;
        validaIndice(index);
        if (isEmpty()) {
            throw new IllegalStateException("Não existem contas na lista");
        } else {
            for (int i = 0; i < index; i++) {
                refAuxiliar = refAuxiliar.getRefProximaConta();
            }
            return refAuxiliar;
        }
    }

    public String getTitular(int index) {
        return getConta(index).getNome();
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    private int size() {
        ContaBancaria refTamanho = refEntrada;
        while(true) {
            if (refTamanho != null) {
                tamanho++;
                if (refTamanho.getRefProximaConta() != null) {
                    tamanho++;
                    refTamanho = refTamanho.getRefProximaConta();
                } else break;
            } else break;
        }
        return tamanho;
    }

    private boolean isEmpty() {
        return refEntrada == null;
    }


}

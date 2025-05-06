package Service;

import Model.Cliente;
import Model.ContaBancaria;

public class ListaContas {
    ContaBancaria refEntrada;

    void add(Cliente cliente) {
        ContaBancaria novaConta = new ContaBancaria(cliente);
        if (isEmpty()) {
            refEntrada =  novaConta;
        } else {
            ContaBancaria refAuxiliar = refEntrada;
            for (int i = 0; i < size() - 1; i++) {
                refAuxiliar = refAuxiliar.getRefProximaConta();
            }
            refAuxiliar.setRefProximaConta(novaConta);
        }
    }

    ContaBancaria getConta(int index) {
        ContaBancaria refAuxiliar = refEntrada;
        if (isEmpty()) {
            throw new IllegalStateException("Não existem contas na lista");
        } else {
            for (int i = 0; i < index; i++) {
                refAuxiliar = refAuxiliar.getRefProximaConta();
            }
            return refAuxiliar;
        }
    }

    //MODIFICAR ISSO EM CASA
    boolean validaIndice(int index) {
        return true;
    }

    int size() {
        ContaBancaria refTamanho = refEntrada;
        int tamanho = 0;
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

package Main;

import Service.AtendimentoService;

public class App {
    public static void main(String[] args) {

        AtendimentoService atendimento = new AtendimentoService();

        atendimento.adicionarClienteNaFila("Josue", 2020);



    }
}

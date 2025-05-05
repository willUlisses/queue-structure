package Main;

import Service.AtendimentoService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        AtendimentoService atendimento = new AtendimentoService();
        Scanner scannerAtendimento = new Scanner(System.in);

        boolean repetir = true;
        do {
            System.out.println(menuAtendimento());
            int opcaoAtendimento = scannerAtendimento.nextInt();
            switch (opcaoAtendimento) {
                case 1:
                    Scanner scannerNome = new Scanner(System.in);
                    System.out.println("Qual o nome do cliente?");
                    String nomeCliente = scannerNome.next();

                    System.out.println("Qual o ano de vencimento do documento desse cliente?");
                    Scanner scannerDoc = new Scanner(System.in);
                    int dataDocumento = scannerNome.nextInt();

                    atendimento.adicionarClienteNaFila(nomeCliente, dataDocumento);
                    break;
                case 2:
                    System.out.println(atendimento.verFila());
                    break;
                case 3:
                    System.out.println(atendimento.chamarCliente() + "\n");
                    break;
                case 0:
                    System.out.println("Fechando Atendimento...");
                    repetir = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }
        } while (repetir);

    }

    static String menuAtendimento() {
        String stringMenu = "-----  MENU ATENDIMENTO -----\n";
        stringMenu += "[1] Adicionar Cliente Na Fila \n";
        stringMenu += "[2] Ver Fila\n";
        stringMenu += "[3] Chamar Cliente\n";
        stringMenu += "[0] Fechar Atendimento Geral\n";
        stringMenu += "-------------------------";

        return stringMenu;
    }

    static String menuCliente() {
        String menuCliente = "=====  MENU CLIENTE =====";
        menuCliente += "[1] SACAR";
        menuCliente += "[2] DEPOSITAR";
        menuCliente += "[3] TRANSFERIR";
        menuCliente += "[0] Finalizar Atendimento Cliente";
        return menuCliente;
    }

}

package Main;

import Model.ContaBancaria;
import Service.Atendimento;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Atendimento atendimento = new Atendimento();
        Scanner scannerAtendimento = new Scanner(System.in);

        boolean repetir = true;
        boolean repetirCliente = true;

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
                    ContaBancaria contaClienteAtual =  atendimento.chamarCliente().getContaBancaria();
                    Scanner scannerCliente = new Scanner(System.in);
                    System.out.println(atendimento.chamarCliente().getNome() + "!\n");
                    if (atendimento.verificaDocumento(atendimento.chamarCliente())) {
                        do {
                            Scanner valor = new Scanner(System.in);
                            System.out.println(menuCliente());
                            int opcCliente = scannerCliente.nextInt();
                            switch (opcCliente) {
                                case 1:
                                    System.out.println("Qual valor você deseja sacar?");
                                    int valorSacado = valor.nextInt();
                                    atendimento.chamarCliente().getContaBancaria().sacar(valorSacado);
                                    System.out.println("Valor sacado: R$" + valorSacado);
                                    break;

                                case 2:
                                    System.out.println("Qual valor você deseja depositar?");
                                    int valorDepositado = valor.nextInt();
                                    contaClienteAtual.depositar(valorDepositado);
                                    System.out.println("Valor depositado: R$" + valorDepositado);
                                    break;

                                case 3:
                                    System.out.println(atendimento.verDadosContaBancaria(contaClienteAtual));
                                    break;

                                case 0:
                                    System.out.println(atendimento.finalizarAtendimentoCliente());
                                    repetirCliente = false;
                                    break;

                                default:
                                    System.out.println("Opção inválida, tente novamente.");
                            }

                        } while(repetirCliente);
                    }
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
        String stringMenu = "-----  MENU ATENDIMENTO -----\n"
         + "[1] Adicionar Cliente Na Fila \n"
         + "[2] Ver Fila\n"
         + "[3] Chamar Cliente\n"
         + "[0] Fechar Atendimento Geral\n"
         + "-------------------------\n";
        return stringMenu;
    }

    // VOU IMPLEMENTAR POSSIBILIDADE DE TRANSFERENCIA MAIS TARDE!!!!!!!!!!!!!!!!

    static String menuCliente() {
        String menuCliente = "=====  MENU CLIENTE =====\n"
         + "[1] SACAR\n"
         + "[2] DEPOSITAR\n"
         + "[3] VER CONTA\n"
         + "[0] Finalizar Atendimento Cliente\n"
         + "-------------------------";
        return menuCliente;
    }


}

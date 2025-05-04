package Utils;

public interface MenuAtendimento {

     private String menuAtendimento() {
        String stringMenu = "-----  MENU ATENDIMENTO -----\n";
        stringMenu += "[1] Ver Fila \n";
        stringMenu += "[2] Chamar Cliente\n";
        stringMenu += "[0] Fechar Atendimento Geral\n";
        stringMenu += "-------------------------";

        return stringMenu;
    }

    default String imprimeMenuAtendimento() {
        return menuAtendimento();
    }

    default String menuCliente() {
         String menuCliente = "=====  MENU CLIENTE =====";
         menuCliente += "[1] SACAR";
         menuCliente += "[2] DEPOSITAR";
         menuCliente += "[3] TRANSFERIR";
         menuCliente += "[0] Finalizar Atendimento";
         return menuCliente;
    }
}

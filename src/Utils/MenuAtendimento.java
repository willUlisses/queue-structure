package Utils;

public interface MenuAtendimento {

     private String menuAtendimento() {
        String stringMenu = "-----  MENU ATENDIMENTO -----\n";
        stringMenu += "[1] Chamar Cliente\n";
        stringMenu += "[2] \n";
        stringMenu += "[0] Encerrar Atendimento\n";
        stringMenu += "-------------------------";

        return stringMenu;
    }

    default String imprimeMenuAtendimento() {
        return menuAtendimento();
    }

    //.....

}

package Service;

public class MenuAtendimento {

    private String menuAtendimento() {
        String stringMenu = "-----  MENU  -----\n";
        stringMenu += "[1] Atender Cliente\n";
        stringMenu += "[2] Ver Fila\n";
        stringMenu += "[0] Encerrar Atendimento\n";
        stringMenu += "-------------------------";

        return stringMenu;
    }

    public String imprimeMenu() {
        return menuAtendimento();
    }

}

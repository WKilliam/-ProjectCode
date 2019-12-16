package com.company.Menu;

import com.company.Menu.HelpManager;
import com.company.Menu.IMenu;

public class FunctionalManager {

    public void gestionCommande(String input){

        switch (input){
            default:
                System.out.println("bad choose");
                break;
            case "HELP":

                break;
            case "TO LEAVE":
                System.exit(0);
                break;
        }

    }
}

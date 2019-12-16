package com.company;

import com.company.ExceptionProgramme.EditingException;
import com.company.Menu.*;

import java.util.ArrayList;

public class FunctionalManager {

    public void gestionCommande(String input, ArrayList<User> userlist) throws Exception, EditingException {

        IMenu help = new HelpManager();
        IMenu createuser =new CreateUser();
        IMenu editing = new EditingUser();

        switch (input){

            case"EDITING USER":
                editing.editingU(userlist);
                break;
            case"USER LIST":
                if(userlist.size()==0){
                    throw new Exception("this list user is null size = "+userlist.size());
                }
                for (int i = 0; i < userlist.size(); i++) {
                    System.out.println("NAME : "+ userlist.get(i).getName());
                }
                break;

            case"CREATE USER":
                createuser.createUsersup(userlist);
                break;
            default:
                System.out.println("bad choose");
                break;
            case "HELP":
                help.helpManager();
                break;
            case "TO LEAVE":
                System.exit(0);
                break;
        }

    }
}

package com.company;

import com.company.ExceptionProgramme.EditingException;
import com.company.Menu.*;

import java.util.ArrayList;

public class FunctionalManager {

    public void gestionCommande(String input, ArrayList<User> userlist) throws Exception, EditingException, RemoveException {

        IMenu help = new HelpManager();
        IMenu createuser =new CreateUser();
        IMenu editing = new EditingUser();
        IMenu remove = new RemoveUser();

        switch (input){

            case "REMOVE USER":
                remove.removeUser(userlist);
                break;
            case"EDITING USER":
                editing.editingU(userlist);
                help.helpManager();
                break;
            case"USER LIST":
                if(userlist.size()==0){
                    throw new Exception("this list user is null size = "+userlist.size());
                }
                for (int i = 0; i < userlist.size(); i++) {
                    System.out.println("NAME : "+ userlist.get(i).getName());
                }
                help.helpManager();
                break;

            case"CREATE USER":
                createuser.createUsersup(userlist);
                help.helpManager();
                break;
            default:
                System.out.println("bad choose");
                help.helpManager();
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

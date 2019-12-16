package com.company;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.Menu.*;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.User;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class FunctionalManager {

    public void gestionCommande(String input, ArrayList<User> userlist, ArrayList<ActionWallStreet> action) throws Exception, EditingException, RemoveException {

        IMenu help = new HelpManager();
        IMenu createuser =new CreateUser();
        IMenu editing = new EditingUser();
        IMenu remove = new RemoveUser();
        IMenu actioncre = new CreateAction();
        switch (input){
            case"ACTION LIST":
                if(action.size()==0){
                    System.out.println( "this list user is null size = "+action.size());
                }
                for (int i = 0; i < action.size(); i++) {
                    System.out.println("NAME : "+ action.get(i).getActionW() +" ID :"+action.get(i).getiDlocalization());
                }
                break;
            case"CREATE ACTION":
                actioncre.createAction(action);
                break;
            case "REMOVE USER":
                remove.removeUser(userlist);
                break;
            case"EDITING USER":
                editing.editingU(userlist);
                help.helpManager();
                break;
            case"USER LIST":
                if(userlist.size()==0){
                    System.out.println( "this list user is null size = "+userlist.size());
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

package com.company;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.Menu.*;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.Purchase;
import com.company.Obeject.User;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class FunctionalManager {

    public void gestionCommande(String input, ArrayList<User> userlist, ArrayList<ActionWallStreet> action, ArrayList<Purchase> purchalist) throws Exception, EditingException, RemoveException {

        IMenu help = new HelpManager();
        IMenu createuser =new CreateUser();
        IMenu editing = new EditingUser();
        IMenu remove = new RemoveUser();
        IMenu actioncre = new CreateAction();
        IMenu buy = new BuyAction();
        switch (input){
            case"PURCHASE USER":
                for (int i = 0; i < userlist.size(); i++) {
                    System.out.println(" name :"+userlist.get(i).getName()+" purchase :"+userlist.get(i).getActionHas());
                }
                break;
            case"LIST PURCHASE":
                if(purchalist.size()==0){
                    System.out.println( "this list user is null size = "+purchalist.size());
                    help.helpManager();
                }
                for (int i = 0; i < purchalist.size(); i++) {
                    System.out.println("NAME ACTION : "+ purchalist.get(i).getAction() +" ID user :"+purchalist.get(i).getUserrname());
                }
                break;
            case"BUY PURCHASE":
                buy.Buy(action,userlist,purchalist);
                break;
            case"ACTION LIST":
                if(action.size()==0){
                    System.out.println( "this list user is null size = "+action.size());
                    help.helpManager();
                }
                for (int i = 0; i < action.size(); i++) {
                    System.out.println("NAME : "+ action.get(i).getActionW() +" ID :"+action.get(i).getiDlocalization()+" PRICE :"+action.get(i).getActionW());
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
                    help.helpManager();
                }
                for (int i = 0; i < userlist.size(); i++) {
                    System.out.println("NAME : "+ userlist.get(i).getName()+" SURNAME :"+userlist.get(i).getSurname());
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

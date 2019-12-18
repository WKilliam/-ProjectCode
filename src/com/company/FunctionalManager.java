package com.company;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.IdException;
import com.company.Working.ExceptionProgramme.OldException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Menu.ActionPack.CreateAction;
import com.company.Working.Menu.ActionPack.EditingAction;
import com.company.Working.Menu.ActionPack.ListAction;
import com.company.Working.Menu.ActionPack.RemoveAction;
import com.company.Working.Menu.PurchasePack.BuyAction;
import com.company.Working.Menu.PurchasePack.ListPurchase;
import com.company.Working.Menu.UserPack.EditingUser;
import com.company.Working.Menu.UserPack.ListUser;
import com.company.Working.Menu.*;
import com.company.Working.Menu.UserPack.CreateUser;
import com.company.Working.Menu.UserPack.RemoveUser;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;

public class FunctionalManager {

    public void gestionCommande(String input, ArrayList<User> userlist, ArrayList<ActionWallStreet> action, ArrayList<Purchase> purchalist,ArrayList<Purchase> sellpurchalist) throws Exception, EditingException, RemoveException, IdException, OldException {

        IMenu listeAction = new ListAction();
        IMenu help = new HelpManager();
        IMenu createuser =new CreateUser();
        IMenu editing = new EditingUser();
        IMenu remove = new RemoveUser();
        IMenu actioncre = new CreateAction();
        IMenu buy = new BuyAction();
        IMenu editA = new EditingAction();
        IMenu removeAct = new RemoveAction();
        IMenu listUserprint = new ListUser();
        IMenu listPurchase = new ListPurchase();
        IMenu sell = new SellPurchase();
        switch (input){
            case"SELL PURCHASE":
                sell.sellPurchasemode(purchalist);
                help.helpManager();
                break;
            case"REMOVE ACTION":
                removeAct.removeAction(action,userlist,purchalist);
                help.helpManager();
                break;
            case"EDITING ACTION":
                editA.editingAction(action);
                help.helpManager();
                break;
            case"PURCHASE USER":
                for (int i = 0; i < userlist.size(); i++) {
                    System.out.println(" name :"+userlist.get(i).getName()+" purchase :"+userlist.get(i).getActionHas());
                }
                break;
            case"LIST PURCHASE":
                listPurchase.helplistPurchase(purchalist);
                break;
            case"B":
                buy.Buy(action,userlist,purchalist);
                help.helpManager();
                break;
            case"ACTION LIST":
                listeAction.listeActionPrint(action);
                help.helpManager();
                break;
            case"CREATE ACTION":
                actioncre.createAction(action);
                help.helpManager();
                break;
            case "REMOVE USER":
                remove.removeUser(userlist);
                help.helpManager();
                break;
            case"EDITING USER":
                editing.editingU(userlist);
                help.helpManager();
                break;
            case"LIST USER":
                listUserprint.listUserCall(userlist);
                help.helpManager();
                break;
            case"C":
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

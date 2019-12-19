package com.company.Working;

import java.util.ArrayList;

public class FunctionalManager {

    /**
     * This function serves as a selection menu
     * @param input selection menu of user
     * @param userlist list user data
     * @param action action list data
     * @param purchalist purchasce  list data
     * @throws Exception
     */
    public void gestionCommande(String input, ArrayList<User> userlist, ArrayList<ActionWallStreet> action, ArrayList<Purchase> purchalist) throws Exception {

        /**
         * @param listeAction imenu of print action list
         * @param help imene print help imenu
         * @param createuser create user menu imenu
         * @param editing editing imne
         * @param remove remove imenu
         * @param actioncre create action imenu
         * @param buy create purchase imenu
         * @param editA editing action imenu
         * @param removeAct remove action imenu
         * @param listUserprint imenu of print user list
         * @param listPurchase imenu of print purchase list
         * @param sell sell imenu
         * @param save
         * @param
         * @param
         */
        //IMenu listeAction = new ListAction();
        IMenu help = new HelpManager();
        IMenu createuser =new CreateUser();
        IMenu editing = new EditingUser();
        IMenu remove = new RemoveUser();
        //IMenu actioncre = new CreateAction();
        //IMenu buy = new BuyAction();
        //IMenu editA = new EditingAction();
        //IMenu removeAct = new RemoveAction();
        //IMenu listUserprint = new ListUser();
        //IMenu listPurchase = new ListPurchase();
        //IMenu sell = new SellPurchase();
        //IMenu save = new Save();

        switch (input){
/*            case "save":
                save.savefile(purchalist,userlist,action);
                break;
            case"sell purchase":
                sell.sellPurchasemode(purchalist);
                help.helpManager();
                break;
            case"remove action":
                removeAct.removeAction(action,userlist,purchalist);
                help.helpManager();
                break;
            case"Editing action":
                editA.editingAction(action);
                help.helpManager();
                break;
            case"list purchase":
                listPurchase.helplistPurchase(purchalist);
                break;
            case"create purchase":
                buy.Buy(action,userlist,purchalist);
                help.helpManager();
                break;
            case"action list":
                listeAction.listeActionPrint(action);
                help.helpManager();
                break;
            case"create action":
                actioncre.createAction(action);
                help.helpManager();
                break;
            case"remove user":
                remove.removeUser(userlist);
                help.helpManager();
                break;*/
            case"remove user":
                remove.removeUser(userlist,purchalist);
                help.helpManager(purchalist,userlist,action);
                break;
            case"editing user":
                editing.editingUser(userlist);
                help.helpManager(purchalist,userlist,action);
                break;
            case"c":
                editing.editingUser(userlist);
                help.helpManager(purchalist,userlist,action);
                break;
            case"create user":
                createuser.createUser(userlist);
                help.helpManager(purchalist,userlist,action);
                break;
            case"cu":
                createuser.createUser(userlist);
                help.helpManager(purchalist,userlist,action);
                break;
            case "help":

                break;
            case "leave":
                System.exit(0);
                break;
            default:
                System.out.println("bad choose");
                help.helpManager(purchalist,userlist,action);
                break;
        }
    }
}

package com.company.Working.Menu;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.OldException;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;

public class HelpManager implements IMenu {

    public void helpManager(){

        System.out.println("                                 POSSIBLE ORDERS ARE :                                      ");
        System.out.println("********************************************************************************************");
        System.out.println("*    CREATE ACTION         **    CREATE USER           **    CREATE PURCHASE       *");
        System.out.println("*    LIST ACTION           **    LIST USER             **    LIST PURCHASE         *");
        System.out.println("*    EDITING ACTION        **    EDITING USER          *");
        System.out.println("*    REMOVE ACTION         **    REMOVE USER           *");
        System.out.println("*    LIST PURCHASE         *");
        System.out.println("*    CREATE PURCHASE       *");
        System.out.println("********************************************************************************************");
    }


    public void helpManagerEditAction(){

        System.out.println("        POSSIBLE ORDERS ARE :           ");
        System.out.println("              NAME          :           ");
        System.out.println("              ID_REFERENCE  :           ");
        System.out.println("              PRICE BUY     :           ");
        System.out.println("              PRICE SELL    :           ");

    }


    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) {

    }

    @Override
    public void listUserCall(ArrayList<User> listuser) {

    }

    @Override
    public void listeActionPrint(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }


    public void helpManagerEditing(ArrayList<User> listuser,int valueselect){

        System.out.println("SELECT YOUR OPTION EDITING OF USER ( NUMBER ):");
        System.out.println(" #1-NAME               " + listuser.get(valueselect).getName());
        System.out.println(" #2-SURNAME            " + listuser.get(valueselect).getSurname());
        System.out.println(" #3-FUNCTION           " + listuser.get(valueselect).getFonction());
        System.out.println(" #4-DEPARTEMENT        " + listuser.get(valueselect).getDepartement());
        System.out.println(" #5-OLD                " + listuser.get(valueselect).getOld());
    }

    @Override
    public void removeUser(ArrayList<User> list) {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> action,ArrayList<User> user, ArrayList<Purchase>purchases) {

        System.out.println("    HERE IS THE LIST OF POTENTIAL BUYERS AND THEIR PURCHASE IN POSSESSION :      ");
        for (int i = 0; i < user.size() ; i++) {
            System.out.println("NAME USER        : "+  user.get(i).getName());
            System.out.println("SURNAME USER     : "+  user.get(i).getSurname());
            System.out.println("            *****           ");
        }
        for (int i = 0; i < action.size(); i++) {
            System.out.println("ACTION WALL STREET ON THE MARKET    : "+action.get(i).getActionW());
            System.out.println("ID_ACTION WALL STREET ON THE MARKET : "+action.get(i).getiDlocalization());
        }
        System.out.println("HERE IS THE FORMAT TO ENTER PLEASE RESPECT IT : ");
        System.out.println("NAMEUSER_SURNAME_IDACTION  ");
    }

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction) {

    }


    @Override
    public void createUsersup(ArrayList<User> userlist) {

    }

    @Override
    public void editingU(ArrayList<User> listuser) {

    }

    public void addPurchase(ArrayList<Purchase> purchases,int day,int month,int year,ActionWallStreet actionWallStreet,User user) throws EditingException, OldException {

        Purchase pur = new Purchase(user, actionWallStreet,year, day, month);
        purchases.add(pur);
        user.setActionHas(pur);
        System.out.println(user.getName() + " NAME : " + user.getSurname() + "\n" +
                " BUY : " + actionWallStreet.getActionW() + " ID : " + actionWallStreet.getiDlocalization() + "\n" +
                " AND USER HAVE :" + user.getActionHas() + "\n"
                + " DATE :" + pur.getDatebuyday() + "/" + pur.getDatebuymouth() + "/" + pur.getDatebuyyear());
    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist) throws EditingException {

    }


}

package com.company.Menu;

import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.Purchase;
import com.company.Obeject.User;

import java.util.ArrayList;

public class HelpManager implements IMenu {

    public void helpManager(){

        System.out.println("                                 POSSIBLE ORDERS ARE :                                      ");
        System.out.println("********************************************************************************************");
        System.out.println("*                    *                     *                       *                       *");
        System.out.println("*      LIST PURCHASE *    CREATE USER      *     EDITING USER      *     REMOVE USER       *");
        System.out.println("*      ACTION LIST   *    CREATE ACTION    *     EDITING ACTION    *     REMOVE ACTION     *");
        System.out.println("*      USER LIST     *    BUY PURCHASEE    *     EDITING PURCHASE  *                       *");
        System.out.println("*      HELP          *                     *                       *                       *");
        System.out.println("*      TO LEAVE      *                     *                       *                       *");
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


}

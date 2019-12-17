package com.company.Working.Menu;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;

public class ListAction implements IMenu {


    @Override
    public void helpManager() {

    }

    @Override
    public void createUsersup(ArrayList<User> userlist) {

    }

    @Override
    public void editingU(ArrayList<User> listuser) throws EditingException {

    }

    @Override
    public void helpManagerEditing(ArrayList<User> listuser, int valueselect) {

    }

    @Override
    public void removeUser(ArrayList<User> list) throws RemoveException {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchases) throws EditingException {

    }

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction) {

    }

    @Override
    public void helpManagerEditAction() {

    }

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) {

    }

    @Override
    public void listUserCall(ArrayList<User> listuser) {

    }

    public void listeActionPrint(ArrayList<ActionWallStreet> action) {
        if (action.size() == 0) {
            System.out.println("this list user is null size = " + action.size());
        }
        for (int i = 0; i < action.size(); i++) {
            System.out.println("NAME : " + action.get(i).getActionW() +"\n "
                    + " ID :" + action.get(i).getiDlocalization() +    "\n "
                    +" PRICE :" + action.get(i).getPriceOpen()          );

        }
    }
}

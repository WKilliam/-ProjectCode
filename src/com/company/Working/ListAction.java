package com.company.Working;


import java.io.IOException;
import java.util.ArrayList;

public class ListAction implements IMenu{


    @Override
    public void helpManager(ArrayList<Purchase> purchases, ArrayList<User> user, ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void createUser(ArrayList<User> userlist) {

    }

    @Override
    public void editingUser(ArrayList<User> listuser, ArrayList<Purchase> purchases) {

    }

    @Override
    public void removeUser(ArrayList<User> list, ArrayList<Purchase> purchases) throws Exception {

    }

    @Override
    public void listUserCall(ArrayList<User> listuser) {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction, ArrayList<Purchase> purchases, ArrayList<User> users) throws Exception {

    }


    public void listeActionPrint(ArrayList<ActionWallStreet> action) {
        if (action.size() == 0) {
            System.out.println("this list user is null size = " + action.size());
        }
        for (int i = 0; i < action.size(); i++) {
            System.out.println("NAME  : " + action.get(i).getActionW() +"\n "
                             + "ID    : " + action.get(i).getiDlocalization() +    "\n "
                              +"PRICE : " + action.get(i).getPriceOpen()  );

        }
    }

    @Override
    public User ckeckuserlist(ArrayList<User> list, String name, String surname) throws Exception {
        return null;
    }

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) {

    }


}

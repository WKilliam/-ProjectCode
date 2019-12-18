package com.company.Working.Menu.UserPack;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;

public class ListUser implements IMenu {


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

    public void listUserCall(ArrayList<User> listuser){

        if(listuser.size()==0){
            System.out.println( "this list user is null size = "+listuser.size());
        }
        for (int i = 0; i < listuser.size(); i++) {

            User user = listuser.get(i);

            System.out.println("NAME USER   : "+user.getName());
            System.out.println("SURNAME     : "+user.getSurname());
            System.out.println("FONCTION    : "+user.getFonction());
            System.out.println("DEPARTEMENT : "+user.getDepartement());
            System.out.println("OLD         : "+user.getOld());
            if (user.getActionHas().size()==0){
                System.out.println("PURCHASE FOR THIS USER IS NOT EXISTED");
            }else if (user.getActionHas().size()!=0){
                for (int j = 0; j <user.getActionHas().size() ; j++) {
                    Purchase purchase = user.getActionHas().get(i);
                    System.out.println("PURCHASE         : "+purchase.getAction());
                    System.out.println("DATE OF BUY      : "+purchase.getDatebuyday()+"/"+purchase.getDatebuymouth()+"/"+purchase.getDatebuyyear());
                }
            }
        }
    }

    @Override
    public void listeActionPrint(ArrayList<ActionWallStreet> action) {

    }
}

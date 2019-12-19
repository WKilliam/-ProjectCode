package com.company.Working;

import java.io.IOException;
import java.util.ArrayList;

public class ListUser implements IMenu{


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
    public void helpManager(ArrayList<Purchase> purchases, ArrayList<User> user, ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void createUser(ArrayList<User> userlist) {

    }

    @Override
    public void editingUser(ArrayList<User> listuser) {

    }

    @Override
    public void removeUser(ArrayList<User> list, ArrayList<Purchase> purchases) throws Exception {

    }
}

package com.company.Working;

import java.util.ArrayList;

public class ListPurchase implements IMenu{


    public void helplistPurchase(ArrayList<Purchase> purchases){
        IMenu help = new HelpManager();
        if(purchases.size()==0){
            System.out.println( "this list user is null size = "+purchases.size());
          //  help.helpManager();
        }
        for (int i = 0; i <purchases.size() ; i++) {
            Purchase purchase = purchases.get(i);
            Integer datebuyyear = purchase.getDatebuyyear();
            Integer datebuymouth = purchase.getDatebuymouth();
            Integer datebuyday = purchase.getDatebuyday();
            System.out.println("NAME PURCHASE              : "+purchase.getNamepurchase());
            System.out.println("NAME USER BUY PURCHASE     : "+purchase.getUserName());
            System.out.println("SURNAME USER BUY PURCHASE  : "+purchase.getUserSURname());
            System.out.println("NAME ACTION BUY PURCHASE   : "+purchase.getAction().getActionW());
            System.out.println("NAMEID ACTION BUY PURCHASE   : "+purchase.getAction().getiDlocalization());
            System.out.println("PRICE ACTION BUY PURCHASE  : "+purchase.getAction().getPriceOpen());
            System.out.println("DATE BUY ACTION BUY PURCHASE  : "+datebuyday+"/"+datebuymouth+"/"+datebuyyear+"/");
            if(purchase.getAction().getPriceClose()==-1){
                System.out.println("For Purchase don't have sell value");
            }
        }
    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) {

    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist, ArrayList<User> user, ArrayList<ActionWallStreet> actionWallStreets) throws Exception {

    }



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

    @Override
    public void listeActionPrint(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public User ckeckuserlist(ArrayList<User> list, String name, String surname) throws Exception {
        return null;
    }

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) throws Exception {

    }
}

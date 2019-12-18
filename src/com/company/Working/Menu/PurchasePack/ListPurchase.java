package com.company.Working.Menu.PurchasePack;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.IdException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;

public class ListPurchase implements IMenu {


    public void helplistPurchase(ArrayList<Purchase> purchases){
        IMenu help = new HelpManager();
        if(purchases.size()==0){
            System.out.println( "this list user is null size = "+purchases.size());
            help.helpManager();
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
        }
    }

    @Override
    public void addPurchase(ArrayList<Purchase> purchases, int day, int month, int year, ActionWallStreet actionWallStreet, User user) {

    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist) throws EditingException {

    }

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
    public void createAction(ArrayList<ActionWallStreet> action) throws IdException {

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

    @Override
    public void listeActionPrint(ArrayList<ActionWallStreet> action) {

    }
}

package com.company.Working;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Interface all characteristique menu
 */
public interface IMenu {


    /**
     * print menu
     * @param purchases list purchase
     * @param user list user
     * @param action list action
     */
    public void helpManager(ArrayList<Purchase> purchases, ArrayList<User> user,ArrayList<ActionWallStreet>action);

    /**
     * create user
     * @param userlist list user
     */
    public void createUser(ArrayList<User> userlist);

    /**
     * editing user
     * @param listuser user list
     */
    public void editingUser(ArrayList<User> listuser,ArrayList<Purchase>purchases);

    public void removeUser(ArrayList<User> list,ArrayList<Purchase>purchases) throws Exception;

    /**
     * print list user
     * @param listuser list user
     */
    public void listUserCall(ArrayList<User> listuser);

    /**
     * create action
     * @param listaction list of action
     */
   // public void editingAction(ArrayList<ActionWallStreet> listaction);

    /**
     * create action in list action
     * @param action list action
     */
    public void createAction(ArrayList<ActionWallStreet> action);

    /**
     * editing action
     * @param listaction list action
     * @param purchases list purchase
     */
    public void editingAction(ArrayList<ActionWallStreet> listaction,ArrayList<Purchase> purchases,ArrayList<User>users) throws Exception;

    /**
     * print list action
     * @param action list action
     */
    public void listeActionPrint(ArrayList<ActionWallStreet> action);

    /**
     * check user list
     * @param list list check
     * @param name name check
     * @param surname surname check
     * @return
     * @throws Exception
     */
    public User ckeckuserlist(ArrayList<User> list, String name, String surname) throws Exception;

    /**
     * remove action
     * @param action list action
     * @param user list user
     * @param purchase list purchase
     */
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) throws Exception;

    /**
     * print list purchase and all characteristic
     * @param purchases purchase list
     */
    public void helplistPurchase(ArrayList<Purchase> purchases);

    /**
     * create purchase menu
     * @param actionlist action list
     * @param userlist user list
     * @param purchaseslist purchase list
     */

    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist);
}

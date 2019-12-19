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
    public void editingUser(ArrayList<User> listuser);

    public void removeUser(ArrayList<User> list,ArrayList<Purchase>purchases) throws Exception;

}
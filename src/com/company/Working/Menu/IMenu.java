package com.company.Working.Menu;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.IdException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;

public interface IMenu {


    public void helpManager();

    public void createUsersup(ArrayList<User>userlist);

    public void editingU(ArrayList<User> listuser) throws EditingException;

    public void helpManagerEditing(ArrayList<User> listuser,int valueselect);

    public void removeUser(ArrayList<User> list) throws RemoveException;

    public void createAction(ArrayList<ActionWallStreet> action) throws IdException;

    public void Buy(ArrayList<ActionWallStreet>action, ArrayList<User>user, ArrayList<Purchase>purchases) throws EditingException;

    public void editingAction(ArrayList<ActionWallStreet> listaction);

    public void helpManagerEditAction();

    public void removeAction(ArrayList<ActionWallStreet> action,ArrayList<User> user,ArrayList<Purchase> purchase);

    public void listUserCall(ArrayList<User> listuser);

    public void listeActionPrint(ArrayList<ActionWallStreet> action);

    public void helplistPurchase(ArrayList<Purchase> purchases);

    public void addPurchase(ArrayList<Purchase> purchases,int day,int month,int year,ActionWallStreet actionWallStreet,User user) throws EditingException;

}

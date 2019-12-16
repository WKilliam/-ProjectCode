package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.User;

import java.util.ArrayList;

public interface IMenu {


    public void helpManager();

    public void createUsersup(ArrayList<User>userlist);

    public void editingU(ArrayList<User> listuser) throws EditingException;

    public void helpManagerEditing(ArrayList<User> listuser,int valueselect);

    public void removeUser(ArrayList<User> list) throws RemoveException;

    public void createAction(ArrayList<ActionWallStreet> action);




}

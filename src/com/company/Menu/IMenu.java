package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.RemoveException;
import com.company.User;

import java.util.ArrayList;

public interface IMenu {


    public void helpManager();

    public void createUsersup(ArrayList<User>userlist);

    public void editingU(ArrayList<User> listuser) throws EditingException;

    public void helpManagerEditing(ArrayList<User> listuser,int valueselect);

    public void removeUser(ArrayList<User> list) throws RemoveException;




}

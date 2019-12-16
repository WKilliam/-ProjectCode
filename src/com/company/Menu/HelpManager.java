package com.company.Menu;

import com.company.User;

import java.util.ArrayList;

public class HelpManager implements IMenu {

    public void helpManager(){

        System.out.println("      POSSIBLE ORDERS ARE :  ");
        System.out.println("=============================");
        System.out.println("=      HELP                 =");
        System.out.println("=      CREATE USER          =");
        System.out.println("=      USER LIST            =");
        System.out.println("=      EDITING USER         =");
        System.out.println("=      TO LEAVE             =");
        System.out.println("=============================");

    }

    public void helpManagerEditing(ArrayList<User> listuser,int valueselect){

        System.out.println("SELECT YOUR OPTION EDITING OF USER ( NUMBER ):");
        System.out.println(" #1-NAME               " + listuser.get(valueselect).getName());
        System.out.println(" #2-SURNAME            " + listuser.get(valueselect).getSurname());
        System.out.println(" #3-FUNCTION           " + listuser.get(valueselect).getFonction());
        System.out.println(" #4-DEPARTEMENT        " + listuser.get(valueselect).getDepartement());
        System.out.println(" #5-OLD                " + listuser.get(valueselect).getOld());
    }


    @Override
    public void createUsersup(ArrayList<User> userlist) {

    }

    @Override
    public void editingU(ArrayList<User> listuser) {

    }


}

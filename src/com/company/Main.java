package com.company;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.OldException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.Menu.HelpManager;
import com.company.Menu.IMenu;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception, EditingException, OldException, RemoveException {


        ArrayList<User> listuser = new ArrayList<>();
        ArrayList<ActionWallStreet>  listeAction = new ArrayList<>();

        User test1 = new User("TEST","V","L",2,19);
        User test2 = new User("TET","V","L",2,19);
        listuser.add(test1);
        listuser.add(test2);

        IMenu help = new HelpManager();
        help.helpManager();


        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            FunctionalManager test = new FunctionalManager();
            test.gestionCommande(input,listuser,listeAction);
        }
    }
}
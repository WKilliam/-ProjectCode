package com.company.Working.Obeject;

import com.company.FunctionalManager;
import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.IdException;
import com.company.Working.ExceptionProgramme.OldException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception, EditingException, OldException, RemoveException, IdException {




        ArrayList<Purchase> listsellpurchar = new ArrayList<>();


        ArrayList<ActionWallStreet>  listeAction = new ArrayList<>();


        ArrayList<User> listuser = new ArrayList<>();


        ArrayList<Purchase> listpurchar = new ArrayList<>();


        IMenu help = new HelpManager();
        help.helpManager();


        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            FunctionalManager test = new FunctionalManager();
            test.gestionCommande(input,listuser,listeAction,listpurchar,listsellpurchar);
        }
    }
}
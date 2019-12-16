package com.company;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.OldException;
import com.company.Menu.HelpManager;
import com.company.Menu.IMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception, EditingException, OldException {


        ArrayList<User> listuser = new ArrayList<>();

        User test1 = new User("TEST","V","L",2,19);
        listuser.add(test1);

        IMenu help = new HelpManager();
        help.helpManager();


        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            FunctionalManager test = new FunctionalManager();
            test.gestionCommande(input,listuser);
        }
    }
}
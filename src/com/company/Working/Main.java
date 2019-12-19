package com.company.Working;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{


        ArrayList<ActionWallStreet>  listeAction = new ArrayList<>();


        ArrayList<User> listuser = new ArrayList<>();


        ArrayList<Purchase> listpurchar = new ArrayList<>();

        ActionWallStreet test3 = new ActionWallStreet("J","J",222);
        User test2 = new User("A","A","A",77,66);
        Purchase test1 = new Purchase(test2,test3,1,1,1);
        listeAction.add(test3);
        listpurchar.add(test1);
        listuser.add(test2);



        IMenu help = new HelpManager();
        help.helpManager(listpurchar,listuser,listeAction);


        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            FunctionalManager test = new FunctionalManager();
            test.gestionCommande(input,listuser,listeAction,listpurchar);
        }
    }
}
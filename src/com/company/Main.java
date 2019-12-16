package com.company;

import com.company.Menu.FunctionalManager;
import com.company.Menu.HelpManager;
import com.company.Menu.IMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        while (true){
            Scanner sc = new Scanner(System.in);
            IMenu help = new HelpManager();
            help.helpManager();
            String input = sc.nextLine();
            FunctionalManager test = new FunctionalManager();
            test.gestionCommande(input);
        }
    }
}
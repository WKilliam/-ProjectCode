package com.company.Working.Clone;

import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class CloneFunction implements IClone{


    public boolean leaveQ(){
        try {
            System.out.println(" YOU HAVE FINISH ? Y / N ");
            Scanner rep = new Scanner(System.in);
            String s3 = rep.nextLine();
            if (s3.equals("Y")) {
                return false;
            } else if (s3.equals("N")) {
               return true;
            }
        }catch(Exception e){
            System.out.println("ERROR INPUT");
        }
        return true;
    }

    public ArrayList<String> takeChain(String s){

        String test[] = s.split("_");

        ArrayList<String> listmots = new ArrayList<>();
        for (int i = 0; i < test.length; i++) {
            listmots.add(test[i]);
        }
        return listmots;
    }





}

package com.company.Working;


import java.io.IOException;
import java.util.ArrayList;

public class ListAction {



    public void listeActionPrint(ArrayList<ActionWallStreet> action) {
        if (action.size() == 0) {
            System.out.println("this list user is null size = " + action.size());
        }
        for (int i = 0; i < action.size(); i++) {
            System.out.println("NAME  : " + action.get(i).getActionW() +"\n "
                             + "ID    : " + action.get(i).getiDlocalization() +    "\n "
                              +"PRICE : " + action.get(i).getPriceOpen()  );

        }
    }


}

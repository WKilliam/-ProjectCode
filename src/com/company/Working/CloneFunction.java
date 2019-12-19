package com.company.Working;

import java.util.ArrayList;
import java.util.Scanner;

public class CloneFunction implements IClone {


    @Override
    public boolean leaveQ(boolean exit) {
        return false;
    }

    public ArrayList<String> takeChain(String s){

        String test[] = s.split(",");

        ArrayList<String> listmots = new ArrayList<>();
        for (int i = 0; i < test.length; i++) {
            listmots.add(test[i]);
        }
        return listmots;
    }





}

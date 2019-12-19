package com.company.Working;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Seriliz implements Serializable {

    private Map<String,ArrayList> map = new HashMap();


    public Seriliz(ArrayList<Purchase> purchases , ArrayList<User> user, ArrayList<ActionWallStreet> action){

        this.map.put("PURCHASE",purchases);
        this.map.put("USER",user);
        this.map.put("ACTION",action);
    }

}

package com.company.Working;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Seriliz implements Serializable {

    private HashMap<String, ArrayList> map ;


    public Seriliz(ArrayList<Purchase> purchases , ArrayList<User> user, ArrayList<ActionWallStreet> action){

        this.map = new HashMap<String, ArrayList>();
        this.map.put("Purchase",purchases);
        this.map.put("User",user);
        this.map.put("Action",action);

    }

    public Map<String, ArrayList> getMap() {
        return map;
    }
}

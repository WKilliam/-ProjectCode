package com.company.Working;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Seriliz implements Serializable {

    private ArrayList<Purchase> purchases =new ArrayList<>();
    private ArrayList<User> users=new ArrayList<>();
    private ArrayList<ActionWallStreet>actionWallStreets=new ArrayList<>();

    public Seriliz(ArrayList<Purchase> purchases , ArrayList<User> user, ArrayList<ActionWallStreet> action){

        this.purchases =new ArrayList<>();
        this.users=new ArrayList<>();
        this.actionWallStreets=new ArrayList<>();

        this.purchases=purchases;
        this.actionWallStreets=action;
        this.users=user;

    }

    public ArrayList<ActionWallStreet> getActionWallStreets() {
        return actionWallStreets;
    }

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}

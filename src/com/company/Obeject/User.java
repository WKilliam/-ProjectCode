package com.company.Obeject;

import com.company.ExceptionProgramme.OldException;

import java.io.File;
import java.util.ArrayList;

public class User {

    private String name;
    private String surname;
    private String fonction;
    private Integer departement;
    private Integer old;
    private ArrayList<Purchase> actionHas = new ArrayList<>();

    public User(String name,String surname,String fonction,int departement,int old) throws OldException {

        this.departement=departement;
        this.fonction=fonction;
        this.name=name;
        this.old=old;
        if(old<18 || old >100){
            throw new OldException();
        }
        this.surname=surname;
        this.actionHas=null;
    }

    public String getName() {
        return this.name;
    }
    public String getNameChange(String newName){
        this.name = newName;
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getSurNameChange(String newName){
        this.surname = newName;
        return this.surname;
    }

    public Integer getDepartement() {
        return this.departement;
    }

    public int getDepartementChange(int newName){
        this.departement = newName;
        return this.departement;
    }

    public Integer getOld() {
        return this.old;
    }

    public int getOldChange(int newName){
        this.old = newName;
        return this.old;
    }

    public String getFonction() {
        return this.fonction;
    }

    public String getFunctionChange(String newName){
        this.fonction = newName;
        return this.fonction;
    }

    public ArrayList<Purchase> getActionHas() {
        return actionHas;
    }
    public ArrayList<Purchase> getchangeActionHas(Purchase action) {
        this.actionHas.add(action);
        return this.actionHas;
    }
}

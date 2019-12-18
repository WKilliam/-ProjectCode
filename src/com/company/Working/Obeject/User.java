package com.company.Working.Obeject;

import com.company.Working.ExceptionProgramme.OldException;

import java.util.ArrayList;

public class User {

    private String name;
    private String surname;
    private String fonction;
    private Integer departement;
    private Integer old;
    private ArrayList<Purchase> actionHas;




    public User(String name,String surname,String fonction,int departement,int old) throws OldException {

        this.actionHas = new ArrayList<>();
        this.departement=departement;
        this.fonction=fonction;
        this.name=name;
        this.old=old;
        if(old<18 || old >100){
            throw new OldException("old bad value");
        }
        this.surname=surname;
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

    public ArrayList<Purchase> setActionHas(Purchase action) {
        this.actionHas.add(action);
        return this.actionHas;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setDepartement(Integer departement) {
        this.departement = departement;
    }

    public void setallstatus(){
        this.name=null;
        this.surname=null;
        this.fonction=null;
        this.departement=null;
        this.old=null;
    }
}

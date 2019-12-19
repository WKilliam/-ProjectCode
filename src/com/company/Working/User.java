package com.company.Working;

import java.util.ArrayList;

public class User {

    private String name;
    private String surname;
    private String fonction;
    private Integer departement;
    private Integer old;
    private ArrayList<Purchase> actionHas;


    /**
     * This object corresponds to the characteristic of a user
     * @param name name characteristic
     * @param surname surname characteristic
     * @param fonction function characteristic
     * @param departement departement characteristic
     * @param old old characteristic
     */
    public User(String name,String surname,String fonction,int departement,int old) throws Exception {

        this.actionHas = new ArrayList<>();
        this.departement=departement;
        this.fonction=fonction;
        this.name=name;
        this.old=old;
        if(old<18 || old >100){
            throw new Exception("old bad value");
        }
        this.surname=surname;
    }

    /**
     * Access to the variable this.name
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Access to the variable this.surname
     * @return this.surname
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Access to the variable this.departement
     * @return this.departement
     */
    public Integer getDepartement() {
        return this.departement;
    }

    /**
     * Access to the variable this.Old
     * @return this.Old
     */
    public Integer getOld() {
        return this.old;
    }

    /**
     * Access to the variable this.Fonction
     * @return this.Fonction
     */
    public String getFonction() {
        return this.fonction;
    }

    /**
     * Access to the variable this.ActionHas
     * @return this.ActionHas
     */
    public ArrayList<Purchase> getActionHas() {
        return actionHas;
    }

    /**
     * Access to the variable this.ActionHas and modify it with action
     * @param action modify variable
     */
    public ArrayList<Purchase> setActionHas(Purchase action) {
        this.actionHas.add(action);
        return this.actionHas;
    }

    /**
     * Access to the variable this.surname and modify it with surname
     * @param surname modify variable
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * Access to the variable this.Old and modify it with old
     * @param old modify variable
     */
    public void setOld(Integer old) {
        this.old = old;
    }
    /**
     * Access to the variable this.name and modify it with name
     * @param name modify variable
     * @return this.Name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Access to the variable this.Fonction and modify it with fonction
     * @param fonction modify variable
     */
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    /**
     * Access to the variable this.Departement and modify it with departement
     * @param departement modify variable
     */
    public void setDepartement(Integer departement) {
        this.departement = departement;
    }
}

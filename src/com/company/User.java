package com.company.Menu;

import java.io.File;

public class User {

    private String name;
    private String surname;
    private String fonction;
    private Integer departement;
    private Integer old;

    public User(String name,String surname,String fonction,int departement,int old){

        this.departement=departement;
        this.fonction=fonction;
        this.name=name;
        this.old=old;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.Purchase;
import com.company.Obeject.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAction implements IMenu {

    public void removeAction(ArrayList<ActionWallStreet> action,ArrayList<User> user,ArrayList<Purchase> purchase){
        IMenu help = new HelpManager();
        System.out.println("ID REMOVE ?");
        for (int i = 0; i <action.size() ; i++) {
            System.out.println(i+" ID STATUS : "+action.get(i).getiDlocalization());
        }
        try{

            System.out.println("WHRITE ID FOR A REMOVE ");
            Scanner sc1 = new Scanner(System.in);
            String index = sc1.nextLine();

            for (int i = 0; i <action.size() ; i++) {
                ActionWallStreet actionWallStreet = action.get(i);
                if(actionWallStreet.getiDlocalization().equals(index)){
                    System.out.println(action.get(i).getiDlocalization() +" is delete ");
                    action.remove(i);
                }
                else {
                    System.out.println("THIS ID NOT EXISTED IN DATA BASE");
                }
            }

        }catch (Exception e){

        }
    }


    @Override
    public void helpManager() {

    }

    @Override
    public void createUsersup(ArrayList<User> userlist) {

    }

    @Override
    public void editingU(ArrayList<User> listuser) throws EditingException {

    }

    @Override
    public void helpManagerEditing(ArrayList<User> listuser, int valueselect) {

    }

    @Override
    public void removeUser(ArrayList<User> list) throws RemoveException {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchases) {

    }

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction) {

    }

    @Override
    public void helpManagerEditAction() {

    }
}

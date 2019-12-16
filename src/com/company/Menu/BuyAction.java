package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.ExceptionProgramme.TextException;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyAction implements IMenu{


    public void Buy(ArrayList<ActionWallStreet>action ){

        IMenu help = new HelpManager();
        if(action.size()==0){
            System.out.println("you haven't action today !!! sorry !");
            help.helpManager();
        }
        else{
            System.out.println("***************************************");
            System.out.println("*      PURCHASE OPEN :                *");
            for (int i = 0; i < action.size(); i++) {
            System.out.println("*  "+i+" "+action.get(i).getActionW()+" "+action.get(i).getiDlocalization()+"                       *");
            }
            System.out.println("*                                     *");
            System.out.println("*                                     *");
            System.out.println("*                                     *");
            System.out.println("***************************************");

            try {
                Scanner sc = new Scanner(System.in);
                int indexbuy = sc.nextInt();

                
            }catch (Exception e){
                System.out.println("INCORRECT VALUE select between 0 and "+action.size());
            }
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
}

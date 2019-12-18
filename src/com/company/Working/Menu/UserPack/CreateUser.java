package com.company.Working.Menu.UserPack;

import com.company.Working.Clone.CloneFunction;
import com.company.Working.Clone.IClone;
import com.company.Working.ExceptionProgramme.OldException;
import com.company.Working.ExceptionProgramme.TextException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateUser implements IMenu {

    private String name = " NO DEFINED";
    private String surname = " NO DEFINED";
    private String function = " NO DEFINED";
    private Integer departement = null;
    private Integer old = null;


    /**
     * this function create user and stok
     *
     * @param userlist list data of user
     */
    public void createUsersup(ArrayList<User> userlist) {

        IClone clone = new CloneFunction();
        IMenu help = new HelpManager();

        boolean exit = true;

        do {
        try {

            System.out.println("     SELECT YOUR CREATE USER :                                      ");
            System.out.println("     HERE IS THE FORMAT TO ENTER PLEASE RESPECT IT :                ");

            System.out.println("     NAME_SURNAME_ _DEPARTEMENT_OLD :                               ");

            Scanner sc = new Scanner(System.in);
            String scan = sc.nextLine();
            ArrayList<String> text = clone.takeChain(scan);
            if(text.size()==5){
                String name = text.get(0);
                String surname = text.get(1);
                String function = text.get(2);
                String localization = text.get(3);
                String old = text.get(4);
                try{
                for (int i = 0; i <userlist.size() ; i++) {
                    User user = userlist.get(i);

                    if(user.getName().equals(name) && user.getSurname().equals(surname)){
                        System.out.println("THIS USER EXISTED IN DATA BASE");
                        throw new Exception();
                    }
                }
                    int depart = Integer.parseInt(localization);
                    int oldlace = Integer.parseInt(old);
                    createUser(name,surname,function,oldlace,depart,userlist);
                    System.out.println("USER CREATED SUCCES");

                }
                catch (OldException e) {
                    System.out.println("OLD IS NOT ACCEPTED THIS A LIMITE 18 <=> 100");
                }
            }else {
                System.out.println("YOUR LIST INPUT IS NOT GOOD");
            }
        }catch (Exception e){
            System.out.println(" THIS ERROR ON INPUT TEXT");

        }
            exit = clone.leaveQ();
        }while (exit==true);
    }

    @Override
    public void editingU(ArrayList<User> listuser) {

    }

    @Override
    public void helpManagerEditing(ArrayList<User> listuser, int valueselect) {

    }

    @Override
    public void removeUser(ArrayList<User> list) {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> action,ArrayList<User>user, ArrayList<Purchase>purchases) {

    }

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction) {

    }

    @Override
    public void helpManagerEditAction() {

    }

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) {

    }

    @Override
    public void listUserCall(ArrayList<User> listuser) {

    }

    @Override
    public void listeActionPrint(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }

    @Override
    public void addPurchase(ArrayList<Purchase> purchases, int day, int month, int year, ActionWallStreet actionWallStreet, User user) {

    }

    /**
     * this function creates objects of type USER
     * @param name String value name of Object
     * @param surname String value surname of Object
     * @param function String value function of Object
     * @param old integer value old of Object
     * @param departement integer value departement of Object
     * @param userlist list data
     */
    private void createUser(String name,String surname,String function,int old,int departement,ArrayList<User>userlist) throws OldException {


        User newUser = new User(name,surname,function,departement,old);
        userlist.add(newUser);
    }


    /**
     * override of IMenu
     */
    @Override
    public void helpManager() {

    }
}

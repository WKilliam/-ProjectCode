package com.company.Menu;

import com.company.ExceptionProgramme.IdException;
import com.company.ExceptionProgramme.OldException;
import com.company.ExceptionProgramme.TextException;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.Purchase;
import com.company.Obeject.User;

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

        IMenu help = new HelpManager();
        System.out.println("     SELECT YOUR CREATE USER :                                      ");
        System.out.println("     HERE IS THE FORMAT TO ENTER PLEASE RESPECT IT :                ");

        boolean exit = true;

        do {
        try {

            Scanner sc = new Scanner(System.in);
            String scan = sc.nextLine();
            String tab[] = scan.split("_");
            ArrayList<String> text = new ArrayList<>();
            for (int i = 0; i <tab.length ; i++) {
                text.add(tab[i]);
            }
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

                        throw new TextException(" THIS NAME AND SURNAME EXISTED IN DATA BASE");
                    }
                }
                    int depart = Integer.parseInt(localization);
                    int oldlace = Integer.parseInt(old);
                    createUser(name,surname,function,oldlace,depart,userlist);

                } catch (TextException e) {
                    e.printStackTrace();
                }
                catch (OldException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("YOUR LIST INPUT IS NOT GOOD");
            }
        }catch (Exception e){
            System.out.println(" THIS ERROR ON INPUT TEXT");
        }
            System.out.println("YOU HAVE FINISH ? Y / N ");
            Scanner rep = new Scanner(System.in);
            String s3 = rep.nextLine();
            if (s3.equals("Y")) {
                exit = false;
            }
            if (s3.equals("N")){
                break;
            }
            else if(s3.equals("N")){

            }
        }while (exit==true);
        help.helpManager();
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

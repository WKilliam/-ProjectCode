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
    private String surname= " NO DEFINED";
    private String function= " NO DEFINED";
    private Integer departement= null;
    private Integer old = null;


    /**
     * this function create user and stok
     * @param userlist list data of user
     */
    public void createUsersup(ArrayList<User>userlist){

        IMenu help = new HelpManager();
        try {
            System.out.println("NAME USER :");
            Scanner scname = new  Scanner(System.in);
            String sname = scname.nextLine();

            System.out.println("SURNAME USER :");
            Scanner scsurname = new  Scanner(System.in);
            String surname = scsurname.nextLine();

            for (int i = 0; i <userlist.size() ; i++) {
                if( userlist.get(i).getName().equals(sname)&& userlist.get(i).getSurname().equals(surname)){
                    throw new IdException(" this user already exists");
                }
            }

            System.out.println("FONCTION USER :");
            Scanner fonctionUser = new  Scanner(System.in);
            String functionUser = fonctionUser.nextLine();


            System.out.println("DEPARTEMENT USER( NUMBER ) :");
            Scanner departementUser = new  Scanner(System.in);
            int depart = departementUser.nextInt();
            if(depart<0){
                throw new TextException();
            }
            System.out.println("OLD USER( NUMBER ONLY) :");
            Scanner old = new  Scanner(System.in);
            int olduser = old.nextInt();

            if(olduser<18 || olduser >100){
                throw new OldException();
            }

            createUser(sname,surname,functionUser,olduser,depart,userlist);

        }catch (OldException old){
            help.createUsersup(userlist);
            System.out.println("THIS OLD IS NOT GOOD");
        }catch (IdException idE){
            help.createUsersup(userlist);
            System.out.println("USER EXISTED IN DATA BASE");
        }catch (TextException e) {
            help.createUsersup(userlist);
            System.out.println("you got the wrong touch :"+e.getMessage());
        }
        catch (Exception e){
            help.createUsersup(userlist);
            System.out.println(" YOUR PROBLEME IS :"+e.getMessage());
        }
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

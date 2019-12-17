package com.company.Working.Menu;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveUser implements IMenu {

    public void removeUser(ArrayList<User> list) throws RemoveException {

        IMenu help = new HelpManager();
        System.out.println("NAME REMOVE ?");
        System.out.println("Please select the name and first name in this format"
                        +"\n"+"name_surname");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String test[] = s.split("_");
        ArrayList<String> listedemot = new ArrayList<>();
        int length = test.length;
        if(test.length<=1 || test.length>3){
                throw new RemoveException();
        }else {

            for (int i = 0; i <length; i++) {
                listedemot.add(test[i]);
            }
            String namevalue = listedemot.get(0);
            String surnamevalue = listedemot.get(1);
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i).getName().equals(namevalue)&&list.get(i).getSurname().equals(surnamevalue)){
                    System.out.println(list.get(i).getName() + " "+list.get(i).getSurname()+" is delete ");
                    list.remove(i);
                    help.helpManager();
                }else {
                    System.out.println(" his user not existed in data base");
                    help.helpManager();
                }
            }
        }

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> action,ArrayList<User> user, ArrayList<Purchase>purchases) {

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

}

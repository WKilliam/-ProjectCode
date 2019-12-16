package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.User;

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
                }else {

                }
            }
            System.out.println(" his user not existed in data base");
            help.helpManager();
        }

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

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

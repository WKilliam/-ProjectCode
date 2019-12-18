package com.company.Working.Menu.UserPack;

import com.company.Working.Clone.CloneFunction;
import com.company.Working.Clone.IClone;
import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.ExceptionProgramme.TextException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveUser implements IMenu {

    public void removeUser(ArrayList<User> list) throws RemoveException {

        boolean exit = true;
        IMenu help = new HelpManager();
        IClone clone = new CloneFunction();
        do{
            try {
                if(list.size()==0){
                    System.out.println(" SORRY YOU DON'T HAVE USER !!!");
                    throw new RemoveException();
                }
                System.out.println("NAME REMOVE ?");
                System.out.println("Please select the name and first name in this format"
                        + "\n" + "name_surname");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                String test[] = s.split("_");
                ArrayList<String> listedemot = new ArrayList<>();

                int length = test.length;
                if (test.length != 2) {
                    System.out.println("YOU HAVE INPUT MORE VALUE IS POSSIBLE ");
                    throw new RemoveException();
                } else {

                    for (int i = 0; i < length; i++) {
                        listedemot.add(test[i]);
                    }
                    String namevalue = listedemot.get(0);
                    String surnamevalue = listedemot.get(1);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getName().equals(namevalue) && list.get(i).getSurname().equals(surnamevalue)) {
                            System.out.println(list.get(i).getName() + " " + list.get(i).getSurname() + " is delete ");
                            list.remove(i);
                            exit = clone.leaveQ();
                        } else {
                            System.out.println(" his user not existed in data base");
                            throw new RemoveException();
                        }
                    }
                }
            }catch (RemoveException e){
                System.out.println("INVALID INPUT ");
                exit = clone.leaveQ();
            }
        }while (exit == true);

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

package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.Menu.HelpManager;
import com.company.Menu.IMenu;
import com.company.User;

import java.util.ArrayList;
import java.util.Scanner;

public class EditingUser implements IMenu {

    public void editingU(ArrayList<User> listuser) throws EditingException {

        IMenu helpEditing = new HelpManager();

        for (int i = 0; i < listuser.size() ; i++) {
            System.out.println("SELECT YOUR EDITING USER ( NUMBER ):");
            System.out.println(i+" "+listuser.get(i).getName());
        }
        try{
            Scanner select = new Scanner(System.in);
            int valueselect = select.nextInt();

            if(valueselect>0||valueselect<listuser.size()) {

                boolean exit = true;
                do{
                    helpEditing.helpManagerEditing(listuser,valueselect);
                    Scanner chosen = new Scanner(System.in);
                    int chosenvalue = chosen.nextInt();
                    switch (chosenvalue) {
                        case 5:
                            Scanner newsurName4 = new Scanner(System.in);
                            int index2 = newsurName4.nextInt();
                            listuser.get(valueselect).getOldChange(index2);
                            break;
                        case 4:
                            Scanner newsurName3 = new Scanner(System.in);
                            int index1 = newsurName3.nextInt();
                            listuser.get(valueselect).getDepartementChange(index1);
                            break;
                        case 3:
                            Scanner newsurName2 = new Scanner(System.in);
                            String s2 = newsurName2.nextLine();
                            listuser.get(valueselect).getFunctionChange(s2);
                            break;
                        case 2:
                            Scanner newsurName1 = new Scanner(System.in);
                            String s1 = newsurName1.nextLine();
                            listuser.get(valueselect).getSurNameChange(s1);
                            break;
                        case 1:
                            Scanner newName = new Scanner(System.in);
                            String s = newName.nextLine();
                            listuser.get(valueselect).getNameChange(s);
                            break;
                        default:
                            System.out.println("please select a value from 1 to 5");
                            break;
                    }
                    System.out.println(" YOU HAVE FINISH ? Y / N ");
                    Scanner rep = new Scanner(System.in);
                    String s3 = rep.nextLine();
                    if (s3.equals("Y")) {
                        exit = false;
                        break;
                    }
                }while (exit==true);
            }
            else{
                System.out.println("please select a value from 1 to 5");
            }

        }catch (Exception e1){
            System.out.println("chosen value does not match please choose a corresponding number");

        }
    }

    @Override
    public void helpManagerEditing(ArrayList<User> listuser, int valueselect) {

    }

    @Override
    public void helpManager() {

    }

    @Override
    public void createUsersup(ArrayList<User> userlist) {

    }
}

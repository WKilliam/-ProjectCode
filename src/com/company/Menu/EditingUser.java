package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.IdException;
import com.company.ExceptionProgramme.TextException;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.Purchase;
import com.company.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class EditingUser implements IMenu {

    public void editingU(ArrayList<User> listuser) throws EditingException {

        IMenu helpEditing = new HelpManager();

        for (int i = 0; i < listuser.size() ; i++) {
            System.out.println("     SELECT YOUR EDITING USER :                                     ");
            System.out.println("     HERE IS THE FORMAT TO ENTER PLEASE RESPECT IT :                ");
            System.out.println("     NAME_SURNAME                                                   ");
            System.out.println(" "+listuser.get(i).getName()+"_"+listuser.get(i).getSurname()+"_"+listuser.get(i).getFonction()+"_"+listuser.get(i).getDepartement()+"_"+listuser.get(i).getOld());
        }
        try{
            boolean exit = true;

            do{

                Scanner select = new Scanner(System.in);
                String s = select.nextLine();

                String tab[] = s.split("_");
                ArrayList<String> listmots = new ArrayList<>();

                for (int i = 0; i <tab.length ; i++) {
                    listmots.add(tab[i]);
                }
                if(listmots.size()<=1&&listmots.size()>=3){
                    System.out.println("PROBLEME INPUT VALUE ");
                }else{

                    for (int i = 0; i <listuser.size() ; i++) {

                        String s2 = listmots.get(0);
                        String s1 = listmots.get(1);

                        if(listuser.get(i).getName().equals(s2)&& listuser.get(i).getSurname().equals(s1)){

                            if(listuser.get(i).getActionHas().size()==0){

                                System.out.println("     HERE IS THE FORMAT TO ENTER PLEASE RESPECT IT :                                 ");
                                System.out.println("     NAME_SURNAME_FUNCTION_DEPARTEMENT_OLD                                           ");
                                System.out.println("     IF YOU DIDN'T WANT TO CHANGE A VALUE LEAVE A SPACE LIKE THE FOLLOWING FORMAT    ");
                                System.out.println("     NAME_SURNAME_ _DEPARTEMENT_OLD                                                  ");

                                Scanner lect1 = new Scanner(System.in);
                                String s3 = lect1.nextLine();

                                String tab2[]=s3.split("_");

                                ArrayList<String> listmots2 = new ArrayList<>();

                                for (int j = 0; j <tab2.length ; j++) {
                                    listmots2.add(tab2[j]);
                                }
                                System.out.println(listmots2);

                                String name = listmots2.get(0);

                                String surname = listmots2.get(1);

                                String function = listmots2.get(2);

                                String s7 = listmots2.get(3);

                                String s8 = listmots2.get(4);



                                int old     = Integer.parseInt(s8);
                                for (int j = 0; j <listuser.size() ; j++) {
                                    User user = listuser.get(i);
                                    if(user.getSurname().equals(surname)&& user.getName().equals(name)){
                                        System.out.println(" THIS USER EXISTED PLEASE CHANGE NAME OR SURNAME");
                                    }else{

                                        try {
                                            for (int k = 0; k < listmots2.size(); k++) {

                                                switch (k) {
                                                    case 4:
                                                        if (s8.equals(" ")) {
                                                            s8 = "0";
                                                            int oldvalue1 = Integer.parseInt(s8);
                                                            user.setOld(oldvalue1);
                                                        } else {
                                                            try {
                                                                int oldvalue2 = Integer.parseInt(s8);
                                                                user.setOld(oldvalue2);
                                                            } catch (Exception e) {
                                                                System.out.println("PLEASE INPUT VALUE IN INTEGER ");
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        if (s7.equals(" ")) {
                                                            s7 = "0";
                                                            int departemen = Integer.parseInt(s7);
                                                            user.setDepartement(departemen);
                                                        } else {
                                                            try {
                                                                int departemen2 = Integer.parseInt(s7);
                                                                user.setDepartement(departemen2);
                                                            } catch (Exception e) {
                                                                System.out.println("PLEASE INPUT VALUE IN INTEGER ");
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        if (function.equals(" ")) {
                                                            user.setFonction(user.getFonction());
                                                        } else {
                                                            user.setFonction(function);
                                                        }
                                                        break;
                                                    case 1:
                                                        if (surname.equals(" ")) {
                                                            user.setSurname(user.getSurname());
                                                        } else {
                                                            user.setSurname(surname);
                                                        }
                                                        break;
                                                    case 0:
                                                        if (name.equals(" ")) {
                                                            user.setName(user.getName());
                                                        } else {
                                                            user.setName(name);
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }catch (Exception e){
                                            System.out.println("batar ");
                                        }
                                    }
                                }
                            }else{
                                System.out.println("SORRY THIS USER HAVE PURCHASE HE CANNOT BE DELETED");
                            }
                        }else{
                            System.out.println("USER NOT EXISITED IN DATA BASE ");
                        }
                    }
                }
                System.out.println(" YOU HAVE FINISH ? Y / N ");
                Scanner rep = new Scanner(System.in);
                String s3 = rep.nextLine();
                if (s3.equals("Y")) {
                    exit = false;
                    break;
                }
                else if(s3.equals("N")){

                }
            }while (exit==true);
        }catch (Exception e){

        }


    }

        /*IMenu helpEditing = new HelpManager();

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
                            for (int i = 0; i <listuser.size() ; i++) {
                                String nametesting = listuser.get(valueselect).getName();

                                if(listuser.get(i).getSurname().equals(s1)&& listuser.get(i).getName().equals(nametesting)){
                                    throw new IdException(" this user already exists");
                                }
                            }
                            break;
                        case 1:
                            Scanner newName = new Scanner(System.in);
                            String s = newName.nextLine();
                            listuser.get(valueselect).getNameChange(s);
                            for (int i = 0; i <listuser.size() ; i++) {

                                String surnametesting = listuser.get(valueselect).getSurname();

                                if(listuser.get(i).getName().equals(s)&& listuser.get(i).getSurname().equals(surnametesting)){
                                    throw new IdException(" this user already exists");
                                }
                            }
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

        }catch (IdException e1){
            System.out.println("this id existed");
        }catch (Exception e){
            System.out.println("chosen value does not match please choose a corresponding number");
        }
    }
*/
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
    public void helpManager() {

    }

    @Override
    public void createUsersup(ArrayList<User> userlist) {

    }
}

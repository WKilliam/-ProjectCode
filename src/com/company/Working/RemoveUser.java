package com.company.Working;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveUser implements IMenu {

    @Override
    public void helpManager(ArrayList<Purchase> purchases, ArrayList<User> user, ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void createUser(ArrayList<User> userlist) {

    }

    @Override
    public void editingUser(ArrayList<User> listuser, ArrayList<Purchase> purchases) {

    }



    /**
     * remove user in list
     * @param list list of user
     * @param purchase purchase list for check
     * @throws Exception
     */
    public void removeUser(ArrayList<User> list,ArrayList<Purchase>purchase) throws Exception {

        IMenu remove = new RemoveUser();
        boolean exit = true;
        do{
            try{
                int size = list.size();
                if(size==0){
                    throw new Exception(" Sorry You Don't Have User !!!");
                }
                IClone clone = new CloneFunction();
                IMenu help = new HelpManager();
                help.createUser(list);
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                ArrayList<String> strings = clone.takeChain(s);
                String nameindex = strings.get(0);
                String surnameindex = strings.get(1);
                if(strings.size() !=2){
                    throw new Exception("input is not valid");
                }

                for (int j = 0; j <purchase.size() ; j++) {
                    Purchase purchase1 = purchase.get(j);
                    if (purchase1.getUserName().equals(nameindex)&&purchase1.getUserSURname().equals(surnameindex)){
                        throw new Exception("This User Have purchase remove is not possible ");
                    }
                }
                try {
                    User ckeckuserlist = ckeckuserlist(list, nameindex, surnameindex);
                    list.remove(ckeckuserlist.getName());
                    System.out.println(ckeckuserlist + " Is Delete");
                }catch (Exception e){
                    System.out.println("User is not existed");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println(" continue ? y / n ");
            Scanner rep = new Scanner(System.in);
            String s3 = rep.nextLine();
            if (s3.equals("y")) {
                exit = true;
            }
            if (s3.equals("n")) {
                exit = false;
            }
        }while (exit==true);
    }

    @Override
    public void listUserCall(ArrayList<User> listuser) {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction, ArrayList<Purchase> purchases, ArrayList<User> users) throws Exception {

    }



    @Override
    public void listeActionPrint(ArrayList<ActionWallStreet> action) {

    }

    /**
     * return user for add list
     * @param list list user checking
     * @param name name id
     * @param surname surmane id
     * @return
     * @throws Exception
     */
    public User ckeckuserlist(ArrayList<User> list, String name, String surname) throws Exception {

        int size = list.size();
        for (int i = 0; i <= size; i++) {
            User user = list.get(i);
            if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                return user;
            }
        }
        throw new Exception("User existed");
    }





/*
        boolean exit = true;
        do{
            try {
                if(list.size()==0){
                    System.out.println(" SORRY YOU DON'T HAVE USER !!!");
                    throw new Exception();
                }
                System.out.println("NAME REMOVE ?");
                System.out.println("Please select the name and first name in this format"
                        + "\n" + "name_surname");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                String test[] = s.split(",");
                ArrayList<String> listedemot = new ArrayList<>();

                int length = test.length;
                if (test.length != 2) {
                    System.out.println("YOU HAVE INPUT MORE VALUE IS POSSIBLE ");
                    throw new Exception();
                } else {

                    for (int i = 0; i < length; i++) {
                        listedemot.add(test[i]);
                    }
                    String namevalue = listedemot.get(0);
                    String surnamevalue = listedemot.get(1);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getName().equals(namevalue) && list.get(i).getSurname().equals(surnamevalue)) {
                            if(list.get(i).getActionHas().size()==0) {
                                System.out.println(list.get(i).getName() + " " + list.get(i).getSurname() + " is delete ");
                                list.remove(i);

                            }else{
                                System.out.println("SORRY YOUR USER SELECTED HAVE PURCHASE ACTION ACTIVATE ");
                                throw new Exception();
                            }
                        } else {
                            System.out.println(" his user not existed in data base");
                            throw new Exception();
                        }
                    }
                }
            }catch (Exception e){
                System.out.println("INVALID INPUT ");
            }
        }while (exit == true);

    }*/
}

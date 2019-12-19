package com.company.Working;

import java.io.IOException;
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
    public void editingUser(ArrayList<User> listuser) {

    }

    public void removeUser(ArrayList<User> list,ArrayList<Purchase>purchase) throws Exception {

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
                String s1 = strings.get(0);
                String s2 = strings.get(1);
                if(strings.size() !=2){
                    throw new Exception("input is not valid");
                }

                for (int j = 0; j <purchase.size() ; j++) {
                    Purchase purchase1 = purchase.get(j);
                    boolean equals = purchase1.getUserName().equals(s1);
                    boolean equals1 = purchase1.getUserSURname().equals(s2);
                    if (purchase1.getUserName().equals(s1)&&purchase1.getUserSURname().equals(s2)){
                        throw new Exception("This User Have purchase remove is not possible ");
                    }
                }
                for (int i = 0; i <size ; i++) {

                    User user = list.get(i);
                    System.out.println(user);

                    if (user.getName().equals(s1) && user.getSurname().equals(s2)) {
                        throw new Exception("User ont existed");
                    }
                    else {
                        System.out.println(user.getName() + " " + user.getSurname() + " is delete ");
                        list.remove(i);
                        break;
                    }
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

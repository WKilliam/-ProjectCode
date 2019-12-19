package com.company.Working;

import java.util.ArrayList;
import java.util.Scanner;



public class CreateUser implements IMenu{

    /**
     * this function create user and stok
     *
     * @param userlist list data of user
     */
    public void createUser(ArrayList<User> userlist) {

        IClone clone = new CloneFunction();

        boolean exit = true;

        do {
        try {

            System.out.println("Select Your Create User :                                      ");
            System.out.println("Here Is The Fomat To Enter Please Respect It :                ");
            System.out.println("Name,Surname,Function,departement,old :                               ");

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
                        System.out.println("This User Existed In Data Base");
                        throw new Exception();
                    }
                }

                    int depart = Integer.parseInt(localization);
                    int oldlace = Integer.parseInt(old);

                    User neuwUser = new User(name,surname,function,depart,oldlace);
                    userlist.add(neuwUser);
                    System.out.println("User Create Succes");
                }
                catch (Exception e) {
                    System.out.println("Old Is Not Accepted This A Limite 18 <=> 100"+"\n"+
                            "Or Your Value Departement Is No Correct Please Write A Numeric Value");
                }
            }else {
                System.out.println("Your List Input Is Not Good");
            }
        }catch (Exception e){
            System.out.println(" This Error On Input Text");

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
    public void editingUser(ArrayList<User> listuser, ArrayList<Purchase> purchases) {

    }



    @Override
    public void removeUser(ArrayList<User> list, ArrayList<Purchase> purchases) throws Exception {

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

    @Override
    public User ckeckuserlist(ArrayList<User> list, String name, String surname) throws Exception {
        return null;
    }


    @Override
    public void helpManager(ArrayList<Purchase> purchases, ArrayList<User> user, ArrayList<ActionWallStreet> action) {

    }
}

package com.company.Working;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class EditingUser implements IMenu {

    /**
     * this function manages the entire user edit menu
     * @param listuser user list
     */
    public void editingUser(ArrayList<User> listuser,ArrayList<Purchase>purchases){

        boolean exit = true;
        do{
        try{

            IClone clone = new CloneFunction();

                for (int i = 0; i < listuser.size() ; i++) {
                    System.out.println("Select Your Editing User :                                     ");
                    System.out.println("Here Is The Format To Enter Please Respect It :                ");
                    System.out.println("Name,Surname                                                   ");
                    System.out.println(listuser.get(i).getName()+","+listuser.get(i).getSurname());
                    System.out.println("*****");
                }

                Scanner select = new Scanner(System.in);
                String s = select.nextLine();
                ArrayList<String> listmots = clone.takeChain(s);
                if(listmots.size()<=1&&listmots.size()>=3){
                    System.out.println("Probléme Input Value ");
                }else{

                    for (int i = 0; i <listuser.size() ; i++) {

                        String s2 = listmots.get(0);
                        String s1 = listmots.get(1);

                        if(listuser.get(i).getName().equals(s2)&& listuser.get(i).getSurname().equals(s1)){

                            if(listuser.get(i).getActionHas().size()==0){

                                System.out.println(listuser.get(i).getName()+","+listuser.get(i).getSurname()+","+listuser.get(i).getFonction()+","+listuser.get(i).getDepartement()+","+listuser.get(i).getOld());
                                System.out.println("Name : "+listuser.get(i).getName()+"\n"+"Surname : "+listuser.get(i).getSurname()+"\n"+"Function : "+listuser.get(i).getFonction()+"\n"+"Departement : "+listuser.get(i).getDepartement()+"\n"+"Old : "+listuser.get(i).getOld());


                                Scanner lect1 = new Scanner(System.in);
                                String s3 = lect1.nextLine();

                                ArrayList<String> listmots2 = clone.takeChain(s3);


                                String name = listmots2.get(0);

                                String surname = listmots2.get(1);

                                String function = listmots2.get(2);

                                String s7 = listmots2.get(3);

                                String s8 = listmots2.get(4);
                                for (int j = 0; j <purchases.size() ; j++) {
                                    Purchase purchase1 = purchases.get(j);
                                    if (purchase1.getUserName().equals(name)&&purchase1.getUserSURname().equals(surname)){
                                        throw new Exception("This User Have purchase remove is not possible ");
                                    }
                                }
                                for (int j = 0; j <listuser.size() ; j++) {
                                    User user = listuser.get(i);
                                    if(!user.getSurname().equals(surname)&&! user.getName().equals(name)){
                                       // System.out.println(" This User Existed Please Change Name Or Surname");
                                        throw new Exception(" This User Existed Please Change Name Or Surname");
                                    }else {
                                        for (int k = 0; k < listmots2.size(); k++) {
                                            switch (k) {
                                                case 0:
                                                    if (s8.equals(" ")) {
                                                        user.setOld(user.getOld());
                                                    } else {
                                                        try {
                                                            int oldvalue2 = Integer.parseInt(s8);
                                                            user.setOld(oldvalue2);
                                                        } catch (Exception e) {
                                                            throw new Exception("Text Old Is Invalid :" + e.getMessage());
                                                        }
                                                    }
                                                    break;
                                                case 1:
                                                    if (s7.equals(" ")) {
                                                        user.setDepartement(user.getDepartement());
                                                    } else {
                                                        try {
                                                            int departemen2 = Integer.parseInt(s7);
                                                            user.setDepartement(departemen2);
                                                        } catch (Exception e) {
                                                            throw new Exception("Text Old Is Invalid :" + e.getMessage());
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
                                                case 3:
                                                    if (surname.equals(" ")) {
                                                        user.setSurname(user.getSurname());
                                                    } else {
                                                        user.setSurname(surname);
                                                    }
                                                    break;
                                                case 4:
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
                                    }

                                }
                            }else{
                                System.out.println("Sorry This User Have Purchase He Cannot Be Deleted");
                            }
                        }else{
                        }
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
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) {

    }

    @Override
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) {

    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist, ArrayList<User> user, ArrayList<ActionWallStreet> actionWallStreets) throws Exception {

    }

    @Override
    public void GestionFileFilter(ArrayList<Purchase> purchases, ArrayList<User> user, ArrayList<ActionWallStreet> actionWallStreets) throws IOException {

    }

    @Override
    public void GestionFiledseri(ArrayList<Purchase> purchases, ArrayList<User> user, ArrayList<ActionWallStreet> actionWallStreets) {

    }

    @Override
    public void helpManager(ArrayList<Purchase> purchases, ArrayList<User> user, ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void createUser(ArrayList<User> userlist) {

    }
}

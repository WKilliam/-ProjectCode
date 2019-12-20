package com.company.Working;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CreateAction implements IMenu{


    /**
     * this function create action
     * @param action list action
     */
    public void createAction(ArrayList<ActionWallStreet> action) {
        IClone clone = new CloneFunction();
       IMenu help = new HelpManager();

           boolean exit = true;
           do {
               try {
               System.out.println("To Create An Action Followed This Format :");
               System.out.println("Actionname,Idref,Price");
               Scanner sc1 = new Scanner(System.in);
               String s = sc1.nextLine();
               ArrayList<String> listmots = clone.takeChain(s);
               String name = listmots.get(0);
               String id = listmots.get(1);
               String pricesta = listmots.get(2);
               if (listmots.size() == 3) {
                   for (int i = 0; i < action.size(); i++) {
                       if (action.get(i).getiDlocalization().equals(id)) {
                           throw new Exception("Action Id exist ");
                       }
                   }
                   try {
                       int price = Integer.parseInt(pricesta);
                       ActionWallStreet act = new ActionWallStreet(name, id, price);
                       action.add(act);
                       System.out.println("create");
                       break;

                   } catch (Exception e) {
                       throw new Exception("this price is not number");
                   }
               } else {
                   throw new Exception(" Probleme Input");
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
           } while (exit == true);
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

    @Override
    public void editingUser(ArrayList<User> listuser, ArrayList<Purchase> purchases) {

    }

    @Override
    public void removeUser(ArrayList<User> list, ArrayList<Purchase> purchases) throws Exception {

    }

    @Override
    public void listUserCall(ArrayList<User> listuser) {

    }
}

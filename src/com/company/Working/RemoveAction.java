package com.company.Working;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAction implements  IMenu{

    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) throws Exception {
        IMenu help = new HelpManager();
        IClone clone = new CloneFunction();

        boolean exit = true;
        do {
            try {
                if (action.size() == 0) {
                    throw new Exception(" Sorry You Don't Have Action In Wall Street !!!");
                }
                for (int i = 0; i < action.size(); i++) {
                    System.out.println(i + " Id Status : " + action.get(i).getiDlocalization());
                }
                System.out.println("Whrite Id For A Remove ");
                Scanner sc1 = new Scanner(System.in);
                String index = sc1.nextLine();
                ArrayList<String> strings = clone.takeChain(index);
                if (strings.size()!=1){
                    throw new Exception("Input value fail ");
                }
                String s = strings.get(0);
                ActionWallStreet actionWallStreet = checklistAction(action, s);
                checkpurchasemod(purchase,s);
                for (int i = 0; i <action.size() ; i++) {
                    if(action.get(i).equals(actionWallStreet)){
                        action.remove(i);
                        System.out.println("delete");
                    }
                }
            }catch (Exception e) {
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
        }while (exit == true);

    }

    public ActionWallStreet checklistAction(ArrayList<ActionWallStreet>action,String valueselect) throws Exception {

        for (int i = 0; i < action.size(); i++) {
            if (action.get(i).getiDlocalization().equals(valueselect)) {
                return action.get(i);
            }
        }
        throw new Exception("This Action isn't existed ");
    }
    public void checkpurchasemod(ArrayList<Purchase> purchases,String valueselect) throws Exception {

        for (int j = 0; j < purchases.size(); j++) {

            if (purchases.get(j).getIdAction().equals(valueselect) && purchases.get(j).getBuyOrSell().equals("Object Buy")) {//&& purchases.get(j).isBuyOrSell()
                throw new Exception("This Action existed in marcket ");
            }
        }
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
}

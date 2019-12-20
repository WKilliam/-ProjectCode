package com.company.Working;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SellPurchase implements IMenu {


    /**
     * this fonction create sell
     * @param purchaseslist purchase list
     * @param user user list
     * @param actionWallStreets action value test
     * @throws Exception
     */
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist,ArrayList<User>user,ArrayList<ActionWallStreet>actionWallStreets) throws Exception {


        IClone clone = new CloneFunction();
        IMenu helpEditing = new HelpManager();
        boolean exit = true;
        do{
            try {
                int size = purchaseslist.size();
                if (size == 0) {
                    throw new Exception("Purchase List Empty");
                }
                for (int i = 0; i < size; i++) {
                    Purchase purchase = purchaseslist.get(i);
                    System.out.println("This Purchase Reference : " + purchase.getNamepurchase() + "\n" +
                            "Name user and Surname : " + purchase.getUserName() + " " + purchase.getUserSURname() + "\n" +
                            "Action id : " + purchase.getIdAction() + "\n" +
                            "Qualify object : " + purchase.getBuyOrSell() + "\n" +
                            "*******************************************");
                }
                System.out.println("This Format Selection For Sell : " + "\n" +
                        "PurchaseRef,NameUser,SurnameUser,iDAction ");
                Scanner scn = new Scanner(System.in);
                String s = scn.nextLine();
                ArrayList<String> strings = clone.takeChain(s);
                if (strings.size() != 4) {
                    throw new Exception("Bad Value Input");
                }
                String purchaRef = strings.get(0);
                String NameUser = strings.get(1);
                String SurnameUser = strings.get(2);
                String idAction = strings.get(3);
                User ckeckuserlist = ckeckuserlist(user, NameUser, SurnameUser);
                ActionWallStreet actionWallStreet = checkAc(actionWallStreets, idAction);
                Purchase check = check(purchaseslist, NameUser, SurnameUser, purchaRef, idAction);
                if (check.getBuyOrSell().equals("Object Buy")) {

                    System.out.println("How Much Do You Want To Sell It To?");
                    Scanner sc = new Scanner(System.in);
                    String value = sc.nextLine();
                    int inp = Integer.parseInt(value);
                    if(inp<0){
                        throw new Exception("this value is négatif sorry your sell isn't completed");
                    }else{
                        check.getAction().setPriceClose(inp);
                        int day = 1 +((int) (Math.random() * 31));
                        int month = 1 +((int) (Math.random() * 12));
                        int year = 1+((int) (Math.random() * 999999));

                        check.setDatesellday(day);
                        check.setDatesellmonth(month);
                        check.setDatesellyear(year);
                        User sell = new User("sold", "sold", "sold",0,19);
                        check.setAllStatus(sell,actionWallStreet,sell.getName(),sell.getSurname(),day,month,year,check.getDatebuyday(),check.getDatebuymouth(),check.getDatebuyyear(),check.getNamepurchase(),check.getIdAction(),"Object Sold");
                        System.out.println("NAME PURCHASE              : "+check.getNamepurchase());
                        System.out.println("NAME USER BUY PURCHASE     : "+check.getUserName());
                        System.out.println("SURNAME USER BUY PURCHASE  : "+check.getUserSURname());
                        System.out.println("NAME ACTION BUY PURCHASE   : "+check.getAction().getActionW());
                        System.out.println("NAMEID ACTION BUY PURCHASE   : "+check.getAction().getiDlocalization());
                        System.out.println("PRICE ACTION BUY PURCHASE  : "+check.getPriceO());
                        System.out.println("DATE BUY ACTION BUY PURCHASE  : "+check.getDatebuyday()+"/"+check.getDatebuymouth()+"/"+check.getDatebuyyear());
                        System.out.println("DATE SELL : " +check.getDatesellday()+"/"+check.getDatesellmonth()+"/"+check.getDatesellyear());
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
    public ActionWallStreet checkAc(ArrayList<ActionWallStreet>actionWallStreets,String id) throws Exception {
        for (int i = 0; i < actionWallStreets.size(); i++) {
            if (actionWallStreets.get(i).getiDlocalization().equals(id)) {
                return actionWallStreets.get(i);
            }
        }
        throw new Exception("This Action isn't existed ");
    }



    public Purchase check(ArrayList<Purchase>purchases,String name,String surname,String refpur,String id) throws Exception {

        for (int i = 0; i <purchases.size() ; i++) {
            Purchase purchase = purchases.get(i);
            if (purchase.getNamepurchase().equals(refpur)&&purchase.getUserName().equals(name)&&purchase.getUserSURname().equals(surname)&&purchase.getIdAction().equals(id)){
                return purchase;
            }
        }
        throw new Exception("This Purchase Not Existed");
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
        int size = list.size();
        for (int i = 0; i <= size; i++) {
            User user = list.get(i);
            if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                return user;
            }
        }
        throw new Exception("User existed");
    }

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) throws Exception {

    }

    @Override
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) {

    }
}

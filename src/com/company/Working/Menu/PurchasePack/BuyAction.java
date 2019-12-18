package com.company.Working.Menu.PurchasePack;

import com.company.Working.Clone.CloneFunction;
import com.company.Working.Clone.IClone;
import com.company.Working.ExceptionProgramme.*;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;
import com.company.Working.Menu.HelpManager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class BuyAction implements IMenu {


    @Override
    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) throws EditingException, OldException {

        IClone clone = new CloneFunction();
        IMenu help = new HelpManager();
        boolean exit = true;
        do {

                int sizeAction = actionlist.size();
                int sizeUser = userlist.size();
                int sizePurcha = purchaseslist.size();
                if (sizeAction == 0) {
                    System.out.println("list 1");
                } else if (sizeUser == 0) {
                    System.out.println("list 12");
                }
                help.Buy(actionlist, userlist, purchaseslist);
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                ArrayList<String> strings = clone.takeChain(input);
                System.out.println(strings);
                String name = strings.get(0);
                String surname = strings.get(1);
                String idAction = strings.get(2);
                for (int i = 0; i < sizeUser ; i++) {
                    User user = userlist.get(i);
                    if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                        System.out.println("user test");
                        for (int j = 0; j <sizeAction ; j++) {
                            ActionWallStreet actionWallStreet = actionlist.get(j);
                            if(actionWallStreet.getiDlocalization().equals(idAction)){
                                System.out.println("action test");
                                if (sizePurcha==0){
                                    System.out.println("CONGRATULATION YOU HAVE BUY ACTION ");
                                    Purchase pur = new Purchase(user, actionWallStreet, 1, 1, 1);
                                    purchaseslist.add(pur);
                                }
                                for (int k = 0; k <sizePurcha ; k++) {
                                    Purchase purchase = purchaseslist.get(k);
                                    if(purchase.getIdAction().equals(idAction)&& purchase.isBuyOrSell()){
                                        System.out.println("this purchase belongs to someone");
                                    }
                                    if (purchase.getIdAction().equals(idAction)&&purchase.getUserName().equals("@null@")&&purchase.getUserSURname().equals("@null@")){

                                        int day = (int) (Math.random() * 31);
                                        int month = (int) (Math.random() * 12);
                                        int year = (int) (Math.random() * 999999);
                                        purchase.setUser(user);
                                        purchase.setUserName(user.getName());
                                        purchase.setUserSURname(user.getSurname());
                                        purchase.setBuyOrSell(true);
                                        purchase.setDatesellday(day);
                                        purchase.setDatesellmonth(month);

                                        System.out.println(purchase.getDatebuyday()+"-"+purchase.getDatebuymouth()+"-"+purchase.getDatebuyyear());
                                        while (purchase.getDatebuyyear()>=year){
                                            int i1 = year * 2;
                                            purchase.setDatesellyear(i1);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("user is not existed ");
            exit = clone.leaveQ();
            } while (exit == true);
    }





/*
        do {
            try {

                if (userlist.size() == 0) {
                    throw new EditingException("YOU DON'T HAVE USER ");
                }
                System.out.println(userlist);
                help.Buy(actionlist, userlist, purchaseslist);
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                ArrayList<String> strings = clone.takeChain(input);
                if (strings.size() != 3) {
                    throw new EditingException("YOU DON'T HAVE PRESS INPUT ");
                }
                String name = strings.get(0);
                String surname = strings.get(1);
                String idAction = strings.get(2);

                System.out.println(userlist.size());
                try {


                    for (int i = 0; i < userlist.size(); i++) {
                        User user = userlist.get(i);



                        try {
                            if (user.getName().equals(name) && user.getSurname().equals(surname)) {


                                for (int j = 0; j < actionlist.size(); j++) {
                                    ActionWallStreet actionWallStreet = actionlist.get(i);

                                    if (actionWallStreet.getiDlocalization().equals(idAction)) {


                                        for (int k = 0; k < purchaseslist.size(); k++) {
                                            Purchase purchase = purchaseslist.get(k);
                                            String name1 = purchase.getUser().getName();
                                            String surname1 = purchase.getUser().getSurname();
                                            String sid = purchase.getAction().getiDlocalization();


                                            if (!purchase.isBuyOrSell() && name1.equals("@null@") && surname1.equals("@null@")) {
                                                int dayN = (int) (Math.random() * 31);
                                                int monthN = (int) (Math.random() * 12);
                                                int yearN = (int) (Math.random() * 999999);
                                                purchase.setUser(user);
                                                purchase.setUserName(user.getName());
                                                purchase.setUserSURname(user.getSurname());
                                                purchase.setBuyOrSell(true);
                                                purchase.setDatebuyday(dayN);
                                                purchase.setDatebuymouth(monthN);

                                                System.out.println(purchase.getDatebuyday() + "-" + purchase.getDatebuymouth() + "-" + purchase.getDatebuyyear());
                                                while (purchase.getDatebuyyear() >= yearN) {
                                                    int i1 = yearN * 2;
                                                    purchase.setDatebuyyear(i1);
                                                    break;
                                                }

                                                throw new EditingException("CONGRATULATION USER SELECTED HAVE TAKE THIS ACTION ");
                                            }
                                            if (name1.equals(name) && surname1.equals(surname) && sid.equals(idAction) && purchase.isBuyOrSell()) {
                                                throw new EditingException("PURCHASE HAS EXISTED FOR USER");
                                            }

                                        }
                                        for (int k = 0; k < purchaseslist.size(); k++) {
                                            Purchase purchase = purchaseslist.get(k);
                                            String name1 = purchase.getUser().getName();
                                            String surname1 = purchase.getUser().getSurname();
                                            String sid = purchase.getAction().getiDlocalization();
                                            if (name1.equals(name) && surname1.equals(surname) && sid.equals(idAction) && !purchase.isBuyOrSell()) {
                                                purchase.setUser(user);
                                                purchase.setBuyOrSell(true);
                                            }
                                        }
                                        int day = (int) (Math.random() * 31);
                                        int month = (int) (Math.random() * 12);
                                        int year = (int) (Math.random() * 9999);
                                        Purchase neWPurchase = new Purchase(user, actionWallStreet, year, day, month);
                                        purchaseslist.add(neWPurchase);
                                        throw new EditingException("PURCHASE HAS CREE SUCCES : " + "\n" +
                                                "USER   : " + user.getName() + "\n" +
                                                "ACTIONID : " + actionWallStreet.getiDlocalization() + "\n" +
                                                "DATE BUY : " + neWPurchase.getDatebuyday() + "/" + neWPurchase.getDatebuymouth() + "/" + neWPurchase.getDatebuyyear());
                                    } else {
                                        throw new EditingException("ACTION NOT EXISTED ");
                                    }
                                }
                            } else {

                            }
                        }catch (Exception e){
                            e.fillInStackTrace();
                        }
                    }
                }catch (Exception e){
                    System.out.println(e.fillInStackTrace());
                    System.out.println(e.getCause());
                } catch (EditingException e) {
                    System.out.println(e.getMessage());
                } catch (OldException e) {
                    e.printStackTrace();
                }
            }catch (EditingException e){
                System.out.println(e.getMessage());
            }
            exit =clone.leaveQ();
        }while (exit==true);
    }*/

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

    @Override
    public void removeUser(ArrayList<User> list) throws RemoveException {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) throws IdException {

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
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }

    @Override
    public void addPurchase(ArrayList<Purchase> purchases, int day, int month, int year, ActionWallStreet actionWallStreet, User user) throws EditingException {

    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist) throws EditingException {

    }
}
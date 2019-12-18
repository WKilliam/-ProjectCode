package com.company;

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
    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) throws EditingException {

        IClone clone = new CloneFunction();
        IMenu help = new HelpManager();

        boolean exit = true;
        do {
            try {
                if (actionlist.size() == 0) {
                    throw new EditingException("YOU DON'T HAVE ACTION ");
                }
                if (userlist.size() == 0) {
                    throw new EditingException("YOU DON'T HAVE USER ");
                }
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

                try {
                    for (int i = 0; i < userlist.size(); i++) {
                        User user = userlist.get(i);
                        if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                            for (int j = 0; j < actionlist.size(); j++) {
                                ActionWallStreet actionWallStreet = actionlist.get(i);
                                if (actionWallStreet.getiDlocalization().equals(idAction)) {
                                    for (int k = 0; k < purchaseslist.size(); k++) {
                                        Purchase purchase = purchaseslist.get(k);
                                        String name1 = purchase.getUser().getName();
                                        String surname1 = purchase.getUser().getSurname();
                                        String sid = purchase.getAction().getiDlocalization();
                                        if (name1.equals(name) && surname1.equals(surname) && sid.equals(idAction)) {
                                            throw new EditingException("PURCHASE HAS EXISTED");
                                        }
                                    }
                                    int day = (int) (Math.random() * 31);
                                    int month = (int) (Math.random() * 12);
                                    int year = (int) (Math.random() * 9999);
                                    Purchase neWPurchase = new Purchase(user, actionWallStreet,year,day,month);
                                    purchaseslist.add(neWPurchase);
                                    throw new EditingException("PURCHASE HAS CREE SUCCES ");
                                }
                                throw new EditingException("ACTION NOT EXISTED ");
                            }
                        }
                        throw new EditingException("USER NOT EXISTED ");
                    }
                } catch (EditingException e) {
                    System.out.println(e.getMessage());
                }
            }catch (EditingException e){
                System.out.println(e.getMessage());
            }
            exit =clone.leaveQ();
        }while (exit==true);
    }

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
}
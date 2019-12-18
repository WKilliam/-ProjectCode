package com.company;

import com.company.Working.Clone.CloneFunction;
import com.company.Working.Clone.IClone;
import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.IdException;
import com.company.Working.ExceptionProgramme.OldException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class SellPurchase implements IMenu {



    public void sellPurchasemode(ArrayList<Purchase> purchaseslist) throws EditingException, OldException {


        User usernull =new User("@null@","@null@","@null@",0,18);
        IClone clone = new CloneFunction();
        IMenu help = new HelpManager();
        boolean exit =true;
        do{
            try {
                if (purchaseslist.size() == 0) {
                    throw new EditingException(" YOU DON'T HAVE PURCHASE ");
                }
                for (int i = 0; i < purchaseslist.size(); i++) {
                    Purchase purchase = purchaseslist.get(i);
                    if (!purchase.isBuyOrSell()) {
                        System.out.println("DATE SELL             : " + purchase.getDatesellday() + "/" + purchase.getDatesellmonth() + "/" + purchase.getDatesellyear());
                        System.out.println("REFERENCE OF PURCHASE : " + purchase.getNamepurchase());
                        System.out.println("FORME HOLDER USER     : " + purchase.getUserName());
                        System.out.println("REFERENCE OF ACTION   : " + purchase.getIdAction());
                        System.out.println("PRICE OF ACTION       : " + purchase.getAction().getPriceOpen());
                        System.out.println("DATE BUY              : " + purchase.getDatebuyday() + "/" + purchase.getDatebuymouth() + "/" + purchase.getDatebuyyear());

                    }else if(purchase.isBuyOrSell()) {
                        System.out.println("REFERENCE OF PURCHASE :" + purchase.getNamepurchase());
                        System.out.println("USER IN POSSESSION    : " + purchase.getUserName());
                        System.out.println("REFERENCE OF ACTION   : " + purchase.getIdAction());
                        System.out.println("PRICE OF ACTION       : " + purchase.getAction().getPriceOpen());
                        System.out.println("DATE BUY              : " + purchase.getDatebuyday() + "/" + purchase.getDatebuymouth() + "/" + purchase.getDatebuyyear());
                        System.out.println("DATE SELL             :   NO DATE   ");
                    }
                }
                System.out.println("PLEASE SELECT REFERENCE ACTION :");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                ArrayList<String> strings = clone.takeChain(s);
                if (strings.size()!=1){
                    throw new EditingException("REFERENCE INPUT IS NOT GOOD FORMAT ");
                }
                String idAction = strings.get(0);
                for (int i = 0; i < purchaseslist.size() ; i++) {
                    Purchase purchase = purchaseslist.get(i);
                    if(purchase.getIdAction().equals(idAction) && purchase.isBuyOrSell()) {

                        int day = (int) (Math.random() * 31);
                        int month = (int) (Math.random() * 12);
                        int year = (int) (Math.random() * 999999);
                        purchase.setUser(usernull);
                        purchase.setUserName(usernull.getName());
                        purchase.setUserSURname(usernull.getSurname());
                        purchase.setBuyOrSell(false);
                        purchase.setDatesellday(day);
                        purchase.setDatesellmonth(month);

                        System.out.println(purchase.getDatebuyday()+"-"+purchase.getDatebuymouth()+"-"+purchase.getDatebuyyear());
                        while (purchase.getDatebuyyear()>=year){
                            int i1 = year * 2;
                            purchase.setDatesellyear(i1);
                            break;
                        }
                        System.out.println("sell "+purchase.getDatesellday()+"-"+purchase.getDatebuymouth()+"-"+purchase.getDatebuyyear());
                    }
                    if(!purchase.isBuyOrSell()){

                    }else {
                        throw new EditingException("THIS ACTION IS NOT BUY ");
                    }
                }
            }catch (EditingException e){
                System.out.println(e.getMessage());
            }
            exit=clone.leaveQ();
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
    public void Buy(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchases) throws EditingException {

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

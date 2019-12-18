package com.company.Working.Menu.ActionPack;

import com.company.Working.Clone.CloneFunction;
import com.company.Working.Clone.IClone;
import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAction implements IMenu {

    public void removeAction(ArrayList<ActionWallStreet> action,ArrayList<User> user,ArrayList<Purchase> purchase){
        IMenu help = new HelpManager();
        IClone clone = new CloneFunction();

        boolean exit = true;
        do {
            if(action.size()==0){
                System.out.println(" SORRY YOU DON'T HAVE ACTION IN WALL STREET !!!");
                exit = clone.leaveQ();
            }
            for (int i = 0; i <action.size() ; i++) {
                System.out.println(i+" ID STATUS : "+action.get(i).getiDlocalization());
            }
            try{
                System.out.println("ID REMOVE ?");
                System.out.println("WHRITE ID FOR A REMOVE ");
                Scanner sc1 = new Scanner(System.in);
                String index = sc1.nextLine();
                for (int i = 0; i <action.size() ; i++) {
                    ActionWallStreet actionWallStreet = action.get(i);
                    if(actionWallStreet.getiDlocalization().equals(index)){
                        for (int j = 0; j <purchase.size() ; j++) {
                            Purchase purchase1 = purchase.get(j);
                            if(purchase1.getAction().equals(actionWallStreet)){
                                System.out.println("SORRY THIS ACTION IS IN MARCKET MOVEMENT");
                                throw new RemoveException();
                            }else{
                                System.out.println(action.get(i).getiDlocalization() +" is delete ");
                                action.remove(i);
                                exit = clone.leaveQ();
                            }
                        }
                    }
                    else {
                        System.out.println();
                        throw new Exception();
                    }
                }
            }catch (Exception e){
                System.out.println("THIS ID NOT EXISTED IN DATA BASE");
                exit = clone.leaveQ();
            }catch ( RemoveException e){
                System.out.println("SELECTED INPUT ERROR");
                exit = clone.leaveQ();
            }
        }while (exit == true);

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
    public void addPurchase(ArrayList<Purchase> purchases, int day, int month, int year, ActionWallStreet actionWallStreet, User user) {

    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist) throws EditingException {

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
    public void createAction(ArrayList<ActionWallStreet> action) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchases) {

    }

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction) {

    }

    @Override
    public void helpManagerEditAction() {

    }
}

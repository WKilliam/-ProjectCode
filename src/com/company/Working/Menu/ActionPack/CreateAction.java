package com.company.Working.Menu.ActionPack;

import com.company.Working.Clone.CloneFunction;
import com.company.Working.Clone.IClone;
import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.IdException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAction implements IMenu {

    public void createAction(ArrayList<ActionWallStreet> action) throws IdException {
        IClone clone = new CloneFunction();
       IMenu help = new HelpManager();

           boolean exit = true;
           do {
               try {
               System.out.println("TO CREATE AN ACTION FOLLOWED THIS FORMAT :");
               System.out.println("        ACTION_IDREF_PRICE                ");
               Scanner sc1 = new Scanner(System.in);
               String s = sc1.nextLine();
               ArrayList<String> listmots = clone.takeChain(s);
               String name = listmots.get(0);
               String id = listmots.get(1);
               String pricesta = listmots.get(2);
               if (listmots.size() == 3) {
                   for (int i = 0; i < action.size(); i++) {
                       if (action.get(i).getiDlocalization().equals(id)) {
                           System.out.println("probléme");
                           throw new Exception();
                       }
                   }
                   try {

                       int price = Integer.parseInt(pricesta);
                       ActionWallStreet act = new ActionWallStreet(name, id, price);
                       action.add(act);
                       System.out.println("CREATE SUCCES");
                       exit = clone.leaveQ();

                   } catch (Exception e) {
                       System.out.println("YOUR HAVE BAD INPUT");
                       throw new Exception();
                   }
               } else {
                   System.out.println(" PROBLEM INPUT");
                   throw new Exception();
               }
               }catch (Exception e){
                   exit = clone.leaveQ();
               }
           } while (exit == true);
    }
    @Override
    public void Buy(ArrayList<ActionWallStreet> action,ArrayList<User>user, ArrayList<Purchase>purchases) {

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
    public void addPurchase(ArrayList<Purchase> purchases, int day, int month, int year, ActionWallStreet actionWallStreet, User user) {

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
}

package com.company.Working;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class BuyAction implements IMenu {


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

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) throws Exception {

    }

    @Override
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }

    /**
     * this function create purchase
     * @param actionlist action list
     * @param userlist user list
     * @param purchaseslist purchase list
     */

    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) {

        IClone clone = new CloneFunction();
        IMenu help = new HelpManager();
        boolean exit = true;
        do {
            try {
                int sizeAction = actionlist.size();
                int sizeUser = userlist.size();
                int sizePurcha = purchaseslist.size();

                if (sizeAction == 0 || sizeUser == 0 || sizePurcha == 0) {
                    throw new Exception("Action List , User List ,Or Purchase list  Is Empty ");
                }
                System.out.println("To Create A Sales Action Wrote Like In This Format : ");
                System.out.println("NameUser,SurnameUser,iDReference ");
                for (int i = 0; i < sizeUser; i++) {
                    System.out.println("User Name : " + userlist.get(i).getName() + "\n" + "User Surname : " + userlist.get(i).getSurname());
                }
                for (int i = 0; i < sizeAction; i++) {
                    System.out.println("Name Action : " + actionlist.get(i).getActionW() + "\n" + "Id Reference Action : " + actionlist.get(i).getiDlocalization());
                }
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                ArrayList<String> strings = clone.takeChain(input);
                if (strings.size()!=3){
                    throw new Exception("Input fail");
                }
                String name = strings.get(0);
                String surname = strings.get(1);
                String id = strings.get(2);
                User checkuser = checkuser(userlist, name, surname);
                ActionWallStreet actionWallStreet = checkAction(actionlist, id);
                Purchase chechpurchase = chechpurchase(purchaseslist, name, surname, id, checkuser, actionWallStreet);

            } catch (Exception e) {
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
        } while (exit == true) ;
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


    /**
     * check purchase list for catch exception and create purchase
     * @param purchases list purchase
     * @param name name value cheking
     * @param surname surname value checking
     * @param id id value checking
     * @param user user value take
     * @param actionWallStreet action value take
     * @return
     * @throws Exception
     */

    public Purchase chechpurchase(ArrayList<Purchase> purchases,String name,String surname ,String id,User user,ActionWallStreet actionWallStreet) throws Exception {

        for (int i = 0; i <purchases.size() ; i++) {

            Purchase purchasen = purchases.get(i);
            if(purchasen.getUser().getSurname().equals(surname)&&purchasen.getUser().getName().equals(name)&&purchasen.getAction().getiDlocalization().equals(id)){
                throw new Exception("this purchase existed for one user ");
            }
            if(purchasen.getAction().getiDlocalization().equals(id)&&purchasen.getBuyOrSell().equals("Object Buy")){
                throw new Exception("this action is in marcket wait sell");
            }
            if(purchasen.getAction().getiDlocalization().equals(id)&&purchasen.getBuyOrSell().equals("Object Sold")&&purchasen.getUserName().equals("sold")&&purchasen.getUserSURname().equals("sold")){
                int day = 1+(int) (Math.random() * 31);
                int month = 1+(int) (Math.random() * 12);
                int year = 1+(int) (Math.random() * 999999);
                purchases.remove(purchasen);
                purchasen.setAllStatus(user,actionWallStreet,name,surname,year,month,day,purchasen.getDatebuyday(),purchasen.getDatebuymouth(),purchasen.getDatebuyyear(),purchasen.getNamepurchase(),purchasen.getIdAction(),purchasen.getBuyOrSell());

                break;
            }

        }
        int day = 1+(int) (Math.random() * 31);
        int month = 1+(int) (Math.random() * 12);
        int year = 1+(int) (Math.random() * 999999);
        Purchase purch = new Purchase(user,actionWallStreet,year,day,month);
        purchases.add(purch);
        System.out.println("This purchase "+purch.getNamepurchase()+" - "+purch.getIdAction()+" - "+purch.getIdAction());
        return purch;
    }


    /**
     * check user list
     * @param users list user
     * @param name name value
     * @param surname surname value
     * @return
     * @throws Exception
     */

    public User checkuser(ArrayList<User>users, String name, String surname) throws Exception {

        int size = users.size();
        for (int i = 0; i <= size; i++) {
            User user = users.get(i);
            if (user.getName().equals(name) && user.getSurname().equals(surname)) {
                return user;
            }
        }
        throw new Exception("User not existed");
    }


    /**
     * check action list
     * @param actionWallStreets action list
     * @param s value for check
     * @return
     * @throws Exception
     */

    public ActionWallStreet checkAction (ArrayList<ActionWallStreet>actionWallStreets,String s) throws Exception {

        for (int i = 0; i < actionWallStreets.size(); i++) {
            if (actionWallStreets.get(i).getiDlocalization().equals(s)) {
                return actionWallStreets.get(i);
            }
        }
        throw new Exception("This Action isn't existed ");
    }
    public void changesendnull(ArrayList<Purchase>purchases){

    }
}
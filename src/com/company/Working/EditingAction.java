package com.company.Working;


import java.util.ArrayList;
import java.util.Scanner;

public class EditingAction implements IMenu {


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

    public void editingAction(ArrayList<ActionWallStreet> listaction, ArrayList<Purchase> purchases, ArrayList<User> users) throws Exception {

        IClone clone = new CloneFunction();
        IMenu helpEditing = new HelpManager();
        boolean exit = true;
        do {
            try {
                int size = listaction.size();
                if (size == 0) {
                    throw new Exception("You Don't Have Action ");
                }
                for (int i = 0; i < size; i++) {
                    System.out.println("Selectable Action " + listaction.get(i).getiDlocalization());
                }
                Scanner scn = new Scanner(System.in);
                String id = scn.nextLine();
                ArrayList<String> strings = clone.takeChain(id);
                String idtake = strings.get(0);
                if (strings.size() != 1) {
                    throw new Exception("You Don't Have Good Input ");
                }
                ActionWallStreet actionWallStreet = checklistAction(listaction, idtake);
                checkpurchasemod(purchases,idtake);

                helpEditing.editingAction(listaction,purchases,users);
                Scanner scanner = new Scanner(System.in);
                String change = scanner.nextLine();
                ArrayList<String> changelist = clone.takeChain(change);
                if (changelist.size()!= 4){
                    throw new Exception("You Have Input Bab Text ");
                }
                String nametake = changelist.get(0);
                String iDtake = changelist.get(1);
                String priceopen = changelist.get(2);
                String priceclose = changelist.get(3);
                try{
                    int testN = Integer.parseInt(priceclose);
                    int testN1 = Integer.parseInt(priceopen);
                    if(testN<0||testN1<0){
                        throw new Exception("value Négatif is not good");
                    }
                    for (int j = 0; j <strings.size() ; j++) {
                        switch (j){
                            case 4:
                                if(priceclose.equals(" ")){
                                    actionWallStreet.setPriceClose(actionWallStreet.getPriceClose());
                                }else{
                                    actionWallStreet.setPriceClose(testN);
                                }
                                break;
                            case 3:
                                if (priceopen.equals(" ")){
                                    actionWallStreet.setPriceOpen(actionWallStreet.getPriceOpen());
                                }else {
                                    actionWallStreet.setPriceOpen(testN1);
                                }
                                break;
                            case 1:
                                if(nametake.equals(" ")){
                                    String actionW = actionWallStreet.getActionW();
                                    actionWallStreet.setActionW(actionW);
                                }else {
                                    actionWallStreet.setActionW(nametake);
                                }
                                break;
                            case 0:
                                if(iDtake.equals(" ")){
                                    String acid = actionWallStreet.getiDlocalization();
                                    actionWallStreet.setiDlocalization(acid);
                                }else {
                                    actionWallStreet.setiDlocalization(iDtake);
                                }
                                break;
                            default:
                                throw new Exception("ERROR SWITCH");
                        }
                    }
                }catch (Exception e){
                    throw new Exception("You Have The Bad Value For The Price Open Or Close");
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
        }while (exit == true) ;
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
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) {

    }

    @Override
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) {

    }

    public ActionWallStreet checklistAction(ArrayList<ActionWallStreet>action,String valueselect) throws Exception {

        for (int i = 0; i < action.size(); i++) {
            if (action.get(i).getiDlocalization().equals(valueselect)) {
               return action.get(i);
            }
        }
        throw new Exception("This Action isn't existed ");
    }


    /**
     * check purchase
     * @param purchases purchase list
     * @param valueselect value check
     * @throws Exception
     */
    public void checkpurchasemod(ArrayList<Purchase> purchases,String valueselect) throws Exception {

        for (int j = 0; j < purchases.size(); j++) {

            if (purchases.get(j).getIdAction().equals(valueselect) && purchases.get(j).getBuyOrSell().equals("Object Buy")) {//&& purchases.get(j).isBuyOrSell()
                throw new Exception("This Action existed in marcket ");
            }
        }
    }

}

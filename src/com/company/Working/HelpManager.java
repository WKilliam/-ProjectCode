package com.company.Working;


import java.util.ArrayList;

public class HelpManager implements IMenu {

    /**
     * print menu creating action menu
     * @param action list action
     * @param user list user
     * @param purchases purchase list
     */

    public void Buy(ArrayList<ActionWallStreet> action,ArrayList<User> user, ArrayList<Purchase>purchases) {

        System.out.println("    HERE IS THE LIST OF POTENTIAL BUYERS AND THEIR PURCHASE IN POSSESSION :      ");
        for (int i = 0; i < user.size() ; i++) {
            System.out.println("NAME USER        : "+  user.get(i).getName());
            System.out.println("SURNAME USER     : "+  user.get(i).getSurname());
            System.out.println("            *****           ");
        }
        for (int i = 0; i < action.size(); i++) {
            System.out.println("ACTION WALL STREET ON THE MARKET    : "+action.get(i).getActionW());
            System.out.println("ID-ACTION WALL STREET ON THE MARKET : "+action.get(i).getiDlocalization());
        }
        System.out.println("HERE IS THE FORMAT TO ENTER PLEASE RESPECT IT : ");
        System.out.println("NAMEUSER,SURNAME,IDACTION  ");
    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist, ArrayList<User> user, ArrayList<ActionWallStreet> actionWallStreets) throws Exception {

    }


    /**
     * Add new purchase
     * @param purchases list purchase
     * @param day day of reference
     * @param month month reference
     * @param year year reference
     * @param actionWallStreet action reference
     * @param user user reference
     */
    public void addPurchase(ArrayList<Purchase> purchases,int day,int month,int year,ActionWallStreet actionWallStreet,User user) {

        Purchase pur = new Purchase(user, actionWallStreet,year, day, month);
        purchases.add(pur);
        user.setActionHas(pur);
        System.out.println(user.getName() + " NAME : " + user.getSurname() + "\n" +
                " BUY : " + actionWallStreet.getActionW() + " ID : " + actionWallStreet.getiDlocalization() + "\n" +
                " AND USER HAVE :" + user.getActionHas() + "\n"
                + " DATE :" + pur.getDatebuyday() + "/" + pur.getDatebuymouth() + "/" + pur.getDatebuyyear());
    }

    /**
     * Print menu
     */
    public void helpManager(ArrayList<Purchase> purchases, ArrayList<User> user,ArrayList<ActionWallStreet>action){

        int p = purchases.size();
        int u = user.size();
        int a = action.size();

        System.out.println("                                          POSSIBLE ORDERS ARE :                                            ");
        System.out.println("***********************************************************************************************************");
        System.out.println("*    action data number["+a+"]         **    user data number["+u+"]        **    purchase data number["+p+"]        **");
        System.out.println("*    create action                 **    create user                **    create purchase                **");
        System.out.println("*    list action                   **    list user                  **    list purchase                  **");
        System.out.println("*    editing action                **    editing user               **    sell purchase                  **");
        System.out.println("*    remove action                 **    remove user                **    save data                      **");
        System.out.println("***********************************************************************************************************");

    }

    @Override
    public void createUser(ArrayList<User> userlist) {

        for (int i = 0; i < userlist.size(); i++) {
            User user = userlist.get(i);
            System.out.println("This is user in base data :");
            System.out.println("this is fomat use for delete :"+user.getName()+","+user.getSurname());
        }
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
    public void editingAction(ArrayList<ActionWallStreet> listaction, ArrayList<Purchase> purchases,ArrayList<User>users) {
                System.out.println("This Is Format of editing Write : "+"\n" + "NameA,iD,PriceO,PriceC  <= ");
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


    /**
     * Print characteristic Action Editing
     */
    public void helpManagerEditAction(){

        System.out.println("        POSSIBLE ORDERS ARE :           ");
        System.out.println("              NAME          :           ");
        System.out.println("              ID_REFERENCE  :           ");
        System.out.println("              PRICE BUY     :           ");
        System.out.println("              PRICE SELL    :           ");

    }

}

package com.company.Working;


import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class Save implements IMenu{

    public void GestionFileFilter(ArrayList<Purchase>purchases,ArrayList<User> user,ArrayList<ActionWallStreet>actionWallStreets) throws IOException {

        //this absolute path

        File fileDosFilt = new File("src/com.company/Working/Data/");

        // check the existence of the final discovery

        if(!fileDosFilt.exists()){
            // create directory
            fileDosFilt.mkdirs();

            FileOutputStream fos = new FileOutputStream("src/com.company/Working/Data/data.txt");

            Seriliz neSeri = new Seriliz(purchases,user,actionWallStreets);

            ObjectOutputStream outputStream=new ObjectOutputStream(fos);

            outputStream.writeObject(neSeri);
            outputStream.close();

        }else {
            FileOutputStream fos = new FileOutputStream("src/com.company/Working/Data/data.txt");

            Seriliz neSeri = new Seriliz(purchases,user,actionWallStreets);

            ObjectOutputStream outputStream=new ObjectOutputStream(fos);

            outputStream.writeObject(neSeri);
            outputStream.close();
        }
    }

    public void GestionFiledseri(ArrayList<Purchase>purchases,ArrayList<User> user,ArrayList<ActionWallStreet>actionWallStreets) {

        try {
            File fileDosFilt = new File("src/com.company/Working/Data/");

            if (!fileDosFilt.exists()) {
                System.out.println("Your have not disrectory save ");
            }else {

                FileInputStream fileInputStream = new FileInputStream("src/com.company/Working/Data/data.txt");
                ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

                Seriliz seriliz = (Seriliz) inputStream.readObject();

                ArrayList list = seriliz.getMap().get("Purchase");
                list=purchases;
                ArrayList list1 = seriliz.getMap().get("User");
                list1=user;
                ArrayList list2 = seriliz.getMap().get("Action");
                list2=actionWallStreets;

                inputStream.close();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
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

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) throws Exception {

    }

    @Override
    public void helplistPurchase(ArrayList<Purchase> purchases) {

    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) {

    }

    @Override
    public void sellPurchasemode(ArrayList<Purchase> purchaseslist, ArrayList<User> user, ArrayList<ActionWallStreet> actionWallStreets) throws Exception {

    }

}

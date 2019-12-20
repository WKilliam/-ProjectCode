package com.company.Working;


import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class Save implements IMenu,Serializable{

    public void GestionFileFilter(ArrayList<Purchase>purchases,ArrayList<User> user,ArrayList<ActionWallStreet>actionWallStreets) {

        //this absolute path


       // File fileDosFilt = new File("src/com.company/Working/Data/");

        Seriliz neSeri = new Seriliz(purchases,user,actionWallStreets);
        // check the existence of the final discovery


            try(FileOutputStream fos = new FileOutputStream("data.bin");
                ObjectOutputStream outputStream=new ObjectOutputStream(fos);){

                outputStream.writeObject(neSeri);

            }catch (IOException e){
                System.out.println(e.fillInStackTrace());
            }

    }

    public void GestionFiledseri(ArrayList<Purchase>purchases,ArrayList<User> user,ArrayList<ActionWallStreet>actionWallStreets) {




                try(FileInputStream fileInputStream = new FileInputStream("data.bin");
                    ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);) {
                Seriliz seriliz = (Seriliz) inputStream.readObject();
                    System.out.println(seriliz.getActionWallStreets());
                //purchases=seriliz.getPurchases();
                //user=seriliz.getUsers();
                //actionWallStreets=seriliz.getActionWallStreets();

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

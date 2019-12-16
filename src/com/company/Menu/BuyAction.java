package com.company.Menu;

import com.company.ExceptionProgramme.EditingException;
import com.company.ExceptionProgramme.RemoveException;
import com.company.ExceptionProgramme.TextException;
import com.company.Obeject.ActionWallStreet;
import com.company.Obeject.Purchase;
import com.company.Obeject.User;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyAction implements IMenu{


    public void Buy(ArrayList<ActionWallStreet>action,ArrayList<User> user,ArrayList<Purchase> purchases){

        IMenu help = new HelpManager();
        if(action.size()==0){
            System.out.println("you haven't action today !!! sorry !");
            help.helpManager();
        }
        else{


            System.out.println("***************************************");
            System.out.println("*      PURCHASE OPEN :                *");
            for (int i = 0; i < action.size(); i++) {
            System.out.println("*  "+i+" "+action.get(i).getActionW()+" "+action.get(i).getiDlocalization()+"                       *");
            }
            System.out.println("*                                     *");
            System.out.println("*                                     *");
            System.out.println("*                                     *");
            System.out.println("***************************************");

            try {
                Scanner sc = new Scanner(System.in);
                int indexbuy = sc.nextInt();


                System.out.println("***************************************");
                System.out.println("*      WHO USER BUY  :                *");
                for (int i = 0; i < action.size(); i++) {
                    System.out.println("*  "+i+" "+user.get(i).getName()+" "+user.get(i).getSurname()+"                          *");
                }
                System.out.println("*                                     *");
                System.out.println("*                                     *");
                System.out.println("*                                     *");
                System.out.println("***************************************");

                Scanner sc1 = new Scanner(System.in);
                int indexbuy1 = sc1.nextInt();


                System.out.println("ADD DATE OF BUY        :");
                System.out.println("THIS IS FORMAT INPUT   :");
                System.out.println("    31/12/9999         :");

                Scanner sc2 = new Scanner(System.in);
                String indexbuy2 = sc2.nextLine();

                String[] test = indexbuy2.split("/");

                ArrayList<Integer> listedemot = new ArrayList<>();

                for (int i = 0; i <test.length ; i++) {

                    int pars = Integer.parseInt(test[i]);
                    System.out.println(pars);
                    listedemot.add(pars);
                }
                if(listedemot.size()<2&&listedemot.size()>3){
                    System.out.println("bad value date input");
                    help.helpManager();
                }else {
                    Integer indexDAY = listedemot.get(0);
                    Integer indexMOUTH = listedemot.get(1);
                    Integer indexYEAR = listedemot.get(2);
                    Purchase pur=new Purchase(user.get(indexbuy1),action.get(indexbuy),indexYEAR,indexDAY,indexMOUTH);
                    purchases.add(pur);
                    user.get(indexbuy1).getActionHas().add(pur);
                    System.out.println("PURCHASE VALID");
                }
            }catch (Exception | EditingException e){
                System.out.println("INCORRECT VALUE select between 0 and "+action.size());
            }
        }
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
}

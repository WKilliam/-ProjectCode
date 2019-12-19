package com.company.Working;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAction {

    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase){
        IMenu help = new HelpManager();
        IClone clone = new CloneFunction();

        boolean exit = true;
        do {
            if(action.size()==0){
                System.out.println(" SORRY YOU DON'T HAVE ACTION IN WALL STREET !!!");
              //  exit = clone.leaveQ();
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
                                throw new Exception();
                            }else{
                                System.out.println(action.get(i).getiDlocalization() +" is delete ");
                                action.remove(i);
                            //    exit = clone.leaveQ();
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
             //   exit = clone.leaveQ();
            }
        }while (exit == true);

    }
}

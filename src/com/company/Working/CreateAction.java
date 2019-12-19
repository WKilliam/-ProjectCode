package com.company.Working;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateAction  {


    public void createAction(ArrayList<ActionWallStreet> action) {
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
                    //   exit = clone.leaveQ();

                   } catch (Exception e) {
                       System.out.println("YOUR HAVE BAD INPUT");
                       throw new Exception();
                   }
               } else {
                   System.out.println(" PROBLEM INPUT");
                   throw new Exception();
               }
               }catch (Exception e){
           //        exit = clone.leaveQ();
               }
           } while (exit == true);
    }
}

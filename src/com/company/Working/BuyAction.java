package com.company.Working;

import com.company.Working.Clear.Clone.ExceptionProgramme.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BuyAction {



    public void Buy(ArrayList<ActionWallStreet> actionlist, ArrayList<User> userlist, ArrayList<Purchase> purchaseslist) throws EditingException, OldException {

        IClone clone = new CloneFunction();
        IMenu help = new HelpManager();
        boolean exit = true;
        do {
            //try {
                int sizeAction = actionlist.size();
                int sizeUser = userlist.size();
                int sizePurcha = purchaseslist.size();
                if (sizeAction == 0|| sizeUser == 0) {
                    System.out.println("ACTION OR USER IS NOT EXISTED");
                    do{
                   //     boolean b = clone.leaveQ();
                   //     exit =b;

                    }while (exit==true);
                    break;
                } else
                    {
                   // help.Buy(actionlist, userlist, purchaseslist);
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    ArrayList<String> strings = clone.takeChain(input);
                    System.out.println(strings);
                    if (strings.size() != 3) {
                     do{
                            System.out.println("error input");
                           // boolean b = clone.leaveQ();
                         //   exit =b;


                       }while (exit==true);
                        break;
                    }
                    String name = strings.get(0);
                    String surname = strings.get(1);
                    String idAction = strings.get(2);
                    for (int i = 0; i < sizeUser; i++) {
                        User user = userlist.get(i);
                        if (user.getName().equals(name) && user.getSurname().equals(surname)) {

                            for (int j = 0; j < sizeAction; j++) {
                                ActionWallStreet actionWallStreet = actionlist.get(j);
                                if (actionWallStreet.getiDlocalization().equals(idAction)) {

                                    if (sizePurcha == 0) {
                                        System.out.println("CONGRATULATION YOU HAVE BUY ACTION ");
                                        Purchase pur = new Purchase(user, actionWallStreet, 1, 1, 1);
                                        purchaseslist.add(pur);
                                    }
                                    for (int k = 0; k < sizePurcha; k++) {
                                        Purchase purchase = purchaseslist.get(k);
                                        if (purchase.getIdAction().equals(idAction) && purchase.isBuyOrSell()) {
                                            System.out.println("this purchase belongs to someone");
                                            //            throw new Exception("this purchase belongs to someone");
                                        }
                                        if (purchase.getIdAction().equals(idAction) && purchase.getUserName().equals("@null@") && purchase.getUserSURname().equals("@null@")) {

                                            int day = (int) (Math.random() * 31);
                                            int month = (int) (Math.random() * 12);
                                            int year = (int) (Math.random() * 999999);
                                            purchase.setUser(user);
                                            purchase.setUserName(user.getName());
                                            purchase.setUserSURname(user.getSurname());
                                            purchase.setBuyOrSell(true);
                                            purchase.setDatesellday(day);
                                            purchase.setDatesellmonth(month);

                                            System.out.println(purchase.getDatebuyday() + "-" + purchase.getDatebuymouth() + "-" + purchase.getDatebuyyear());
                                            while (purchase.getDatebuyyear() >= year) {
                                                int i1 = year * 2;
                                                purchase.setDatesellyear(i1);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
          //  exit = clone.leaveQ();
            } while (exit == true);
    }
}
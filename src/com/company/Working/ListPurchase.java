package com.company.Working;

import java.util.ArrayList;

public class ListPurchase {


    public void helplistPurchase(ArrayList<Purchase> purchases){
        IMenu help = new HelpManager();
        if(purchases.size()==0){
            System.out.println( "this list user is null size = "+purchases.size());
          //  help.helpManager();
        }
        for (int i = 0; i <purchases.size() ; i++) {
            Purchase purchase = purchases.get(i);
            Integer datebuyyear = purchase.getDatebuyyear();
            Integer datebuymouth = purchase.getDatebuymouth();
            Integer datebuyday = purchase.getDatebuyday();
            System.out.println("NAME PURCHASE              : "+purchase.getNamepurchase());
            System.out.println("NAME USER BUY PURCHASE     : "+purchase.getUserName());
            System.out.println("SURNAME USER BUY PURCHASE  : "+purchase.getUserSURname());
            System.out.println("NAME ACTION BUY PURCHASE   : "+purchase.getAction().getActionW());
            System.out.println("NAMEID ACTION BUY PURCHASE   : "+purchase.getAction().getiDlocalization());
            System.out.println("PRICE ACTION BUY PURCHASE  : "+purchase.getAction().getPriceOpen());
            System.out.println("DATE BUY ACTION BUY PURCHASE  : "+datebuyday+"/"+datebuymouth+"/"+datebuyyear+"/");
        }
    }

}

package com.company.Working.Obeject;

import java.util.ArrayList;

public class ActionWallStreet {

    private String actionW;
    private Integer priceOpen;
    private Integer priceClose;
    private String iDlocalization;


    public ActionWallStreet(String actionW,String iDlocalization,boolean ramdom,int price){

        this.actionW=actionW;
        this.priceOpen=price;
        this.priceClose = null;
        this.iDlocalization=iDlocalization;

    }

    private String coderambom(String id){

        ArrayList<String> listid = new ArrayList<>();
        listid.add("A");
        listid.add("B");
        listid.add("C");
        listid.add("D");
        listid.add("E");
        listid.add("F");
        listid.add("1");
        listid.add("2");
        listid.add("3");
        listid.add("4");
        listid.add("5");

       return this.iDlocalization=listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()));

    }

    public int ramdom(int limite){
        int v = 0 + (int)(Math.random() * ((limite - 0) + 1));;
        return v;
    }

    public Integer getPriceClose() {
        return this.priceClose;
    }

    public Integer getPriceOpen() {
        return this.priceOpen;
    }
    public Integer getPriceOpencreate(Integer value) {
        this.priceOpen =value;
        return this.priceOpen;
    }


    public String getActionW() {
        return this.actionW;
    }

    public String getiDlocalization() {
        return this.iDlocalization;
    }

    public void setPriceOpen(Integer priceOpen) {
        this.priceOpen = priceOpen;
    }

    public void setPriceClose(Integer priceClose) {
        this.priceClose = priceClose;
    }

    public void setiDlocalization(String iDlocalization) {
        this.iDlocalization = iDlocalization;
    }

    public void setActionW(String actionW) {
        this.actionW = actionW;
    }

}

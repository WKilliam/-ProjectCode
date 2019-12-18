package com.company.Working.Obeject;

import java.util.ArrayList;

public class ActionWallStreet {

    private String actionW;
    private Integer priceOpen;
    private Integer priceClose;
    private String iDlocalization;


    public ActionWallStreet(String actionW,String iDlocalization,int price){

        this.actionW=actionW;
        this.priceOpen=price;
        this.priceClose = null;
        this.iDlocalization=iDlocalization;

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

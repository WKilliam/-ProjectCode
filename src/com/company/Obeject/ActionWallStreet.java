package com.company.Obeject;

public class ActionWallStreet {

    private String actionW;
    private Integer priceOpen;
    private Integer priceClose;
    private String iDlocalization;


    public ActionWallStreet(String actionW,String iDlocalization){

        this.actionW=actionW;
        this.priceOpen=null;
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
}

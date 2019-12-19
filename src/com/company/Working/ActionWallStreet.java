package com.company.Working;


public class ActionWallStreet {

    private String actionW;
    private Integer priceOpen;
    private Integer priceClose;
    private String iDlocalization;

    /**
     * This object corresponds to the characteristic of a ActionWallStreet
     * @param actionW characteristic actionName write user
     * @param iDlocalization characteristic idAction write user
     * @param price characteristic price write user
     */
    public ActionWallStreet(String actionW,String iDlocalization,int price){

        this.actionW=actionW;
        this.priceOpen=price;
        this.priceClose = null;
        this.iDlocalization=iDlocalization;

    }

    /**
     * Access to the variable this.PriceOpen
     * @return this.PriceOpen
     */
    public Integer getPriceOpen() {
        return this.priceOpen;
    }

    /**
     * Access to the variable this.ActionW
     * @return this.ActionW
     */
    public String getActionW() {
        return this.actionW;
    }
    /**
     * Access to the variable this.iDlocalization
     * @return this.iDlocalization
     */
    public String getiDlocalization() {
        return this.iDlocalization;
    }

    /**
     * Access to the variable this.PriceOpen
     * @param priceOpen modify argument
     */
    public void setPriceOpen(Integer priceOpen) {
        this.priceOpen = priceOpen;
    }

    /**
     * Access to the variable this.PriceClose
     * @param priceClose modify argument
     */
    public void setPriceClose(Integer priceClose) {
        this.priceClose = priceClose;
    }

    /**
     * Access to the variable this.iDlocalization
     * @param iDlocalization modify argument
     */
    public void setiDlocalization(String iDlocalization) {
        this.iDlocalization = iDlocalization;
    }

    /**
     * Access to the variable this.ActionW
     * @param actionW modify argument
     */
    public void setActionW(String actionW) {
        this.actionW = actionW;
    }

}
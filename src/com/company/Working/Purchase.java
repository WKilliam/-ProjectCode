package com.company.Working;

import java.util.ArrayList;

public class Purchase {

    private User user;
    private ActionWallStreet action;
    private String userName;
    private String userSURname;
    private Integer datebuyyear;
    private Integer datebuymouth;
    private Integer datebuyday;
    private Integer datesellday;
    private Integer datesellmonth;
    private Integer datesellyear;
    private String namepurchase;
    private String idAction;
    private String buyOrSell;

    /**
     * This object corresponds to the characteristic of a user
     * @param user characteristic user
     * @param action characteristic action
     * @param datebuyyear characteristic year date
     * @param datebuyday characteristic day date
     * @param datebuymouth characteristic month date
     */
    public Purchase(User user,ActionWallStreet action,Integer datebuyyear,Integer datebuyday,Integer datebuymouth)  {


        this.action=action;

        this.datebuyday = datebuyday;
        this.datebuymouth = datebuymouth;
        this.datebuymouth=datebuymouth;
        this.datebuyday=datebuyday;
        this.datebuyyear=datebuyyear;
        this.user=user;


        this.userName =this.user.getName();
        this.userSURname =this.user.getSurname();
        this.idAction=this.action.getiDlocalization();

        this.datesellday=31;
        this.datesellmonth=12;
        this.datesellyear=9999;
        this.namepurchase=coderambom();
        this.buyOrSell=action.getTake();

    }

    public String getBuyOrSell() {
        return buyOrSell;
    }

    public void setBuyOrSell(String buyOrSell) {
        this.buyOrSell = buyOrSell;
    }

    private String coderambom(){

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

        return this.namepurchase=listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()))+listid.get(ramdom(listid.size()));

    }

    private int ramdom(int limite){
        int v = (int)(Math.random() * limite );
        return v;
    }

    /**
     * Access to the variable this.datesellday
     * @return this.datesellday
     */
    public Integer getDatesellday() {
        return this.datesellday;
    }

    /**
     * Access to the variable this.datesellmonth
     * @return datesellmonth
     */
    public Integer getDatesellmonth() {
        return this.datesellmonth;
    }

    /**
     * Access to the variable this.datesellyear
     * @return datesellyear
     */
    public Integer getDatesellyear() {
        return datesellyear;
    }

    /**
     * Access to the variable this.idAction
     * @return idAction
     */
    public String getIdAction() {
        return idAction;
    }

    /**
     * Access to the variable this.user
     * @return user
     */
    public User getUser() {
        return user;
    }

    /**
     * Access to the variable this.namepurchase
     * @return namepurchase
     */
    public String getNamepurchase() {
        return namepurchase;
    }

    /**
     * Access to the variable this.action
     * @return action
     */
    public ActionWallStreet getAction() {
        return action;
    }

    /**
     * Access to the variable this.userName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Access to the variable this.userSURname
     * @return userSURname
     */
    public String getUserSURname() {
        return userSURname;
    }
    /**
     * Access to the variable this.datebuyday
     * @return datebuyday
     */
    public Integer getDatebuyday() {
        return datebuyday;
    }
    /**
     * Access to the variable this.datebuymouth
     * @return datebuymouth
     */
    public Integer getDatebuymouth() {
        return datebuymouth;
    }
    /**
     * Access to the variable this.datebuyyear
     * @return datebuyyear
     */
    public Integer getDatebuyyear() {
        return datebuyyear;
    }

    /**
     * Access to the variable this.datesellday with datesellday
     * @return datesellday
     */
    public void setDatesellday(Integer datesellday) {
        this.datesellday = datesellday;
    }

    /**
     * Access to the variable this.user with user
     * @return user
     */
    public void setUser(User user) {
        this.user = user;
    }
    /**
     * Access to the variable this.datesellmonth with datesellmonth
     * @return datesellmonth
     */
    public void setDatesellmonth(Integer datesellmonth) {
        this.datesellmonth = datesellmonth;
    }
    /**
     * Access to the variable this.datesellyear with datesellyear
     * @return datesellyear
     */
    public void setDatesellyear(Integer datesellyear) {
        this.datesellyear = datesellyear;
    }
    /**
     * Access to the variable this.action with action
     * @return action
     */
    public void setAction(ActionWallStreet action) {
        this.action = action;
    }
    /**
     * Access to the variable this.datebuyday with datebuyday
     * @return datebuyday
     */
    public void setDatebuyday(Integer datebuyday) {
        this.datebuyday = datebuyday;
    }
    /**
     * Access to the variable this.datebuymouth with datebuymouth
     * @return datebuymouth
     */
    public void setDatebuymouth(Integer datebuymouth) {
        this.datebuymouth = datebuymouth;
    }
    /**
     * Access to the variable this.datebuyyear with datebuyyear
     * @return datebuyyear
     */
    public void setDatebuyyear(Integer datebuyyear) {
        this.datebuyyear = datebuyyear;
    }
    /**
     * Access to the variable this.idAction with idAction
     * @return idAction
     */
    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }
    /**
     * Access to the variable this.namepurchase with namepurchase
     * @return namepurchase
     */
    public void setNamepurchase(String namepurchase) {
        this.namepurchase = namepurchase;
    }
    /**
     * Access to the variable this.userName with userName
     * @return userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * Access to the variable this.userSURname with userSURname
     * @return userSURname
     */
    public void setUserSURname(String userSURname) {
        this.userSURname = userSURname;
    }
}

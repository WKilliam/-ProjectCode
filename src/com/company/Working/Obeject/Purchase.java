package com.company.Working.Obeject;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.OldException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

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
    private boolean buyOrSell;


    public Purchase(User user,ActionWallStreet action,Integer datebuyyear,Integer datebuyday,Integer datebuymouth) throws EditingException, OldException {
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

        this.buyOrSell = true;
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

    public Integer getDatesellday() {
        return datesellday;
    }

    public Integer getDatesellmonth() {
        return datesellmonth;
    }

    public Integer getDatesellyear() {
        return datesellyear;
    }

    public String getIdAction() {
        return idAction;
    }

    public User getUser() {
        return user;
    }

    public String getNamepurchase() {
        return namepurchase;
    }

    public int ramdom(int limite){
        int v = (int)(Math.random() * limite );
        return v;
    }

    public ActionWallStreet getAction() {
        return action;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSURname() {
        return userSURname;
    }

    public Integer getDatebuyday() {
        return datebuyday;
    }

    public Integer getDatebuymouth() {
        return datebuymouth;
    }

    public Integer getDatebuyyear() {
        return datebuyyear;
    }

    public boolean isBuyOrSell() {
        return buyOrSell;
    }

    public void setBuyOrSell(boolean buyOrSell) {
        this.buyOrSell = buyOrSell;
    }

    public void setDatesellday(Integer datesellday) {
        this.datesellday = datesellday;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDatesellmonth(Integer datesellmonth) {
        this.datesellmonth = datesellmonth;
    }

    public void setDatesellyear(Integer datesellyear) {
        this.datesellyear = datesellyear;
    }

    public void setAction(ActionWallStreet action) {
        this.action = action;
    }

    public void setDatebuyday(Integer datebuyday) {
        this.datebuyday = datebuyday;
    }

    public void setDatebuymouth(Integer datebuymouth) {
        this.datebuymouth = datebuymouth;
    }

    public void setDatebuyyear(Integer datebuyyear) {
        this.datebuyyear = datebuyyear;
    }

    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    public void setNamepurchase(String namepurchase) {
        this.namepurchase = namepurchase;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSURname(String userSURname) {
        this.userSURname = userSURname;
    }
}

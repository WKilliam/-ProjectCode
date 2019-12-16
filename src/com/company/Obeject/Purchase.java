package com.company.Obeject;

public class Purchase {

    private User user;
    private ActionWallStreet action;
    private String userrname;
    private String usersurname;
    private Integer datebuy;
    private Integer datesell;


    public Purchase(User user,ActionWallStreet action,Integer datebuy){
        this.action=action;
        this.datebuy=datebuy;
        this.user=user;
        this.userrname=this.user.getName();
        this.usersurname=this.user.getSurname();
        this.datesell=null;
    }
}

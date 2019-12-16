package com.company.Obeject;

import com.company.ExceptionProgramme.EditingException;
import com.company.Menu.HelpManager;
import com.company.Menu.IMenu;

public class Purchase {

    private User user;
    private ActionWallStreet action;
    private String userrname;
    private String usersurname;
    private Integer datebuyyear;
    private Integer datebuymouth;
    private Integer datebuyday;
    private Integer datesell;


    public Purchase(User user,ActionWallStreet action,Integer datebuyyear,Integer datebuyday,Integer datebuymouth) throws EditingException {
        this.action=action;
        IMenu help = new HelpManager();
        if(datebuymouth%2==0&& datebuymouth >=1 && datebuymouth<=12){
            this.datebuymouth=datebuymouth;
        }if (datebuymouth%1==0 && datebuymouth>=1 && datebuymouth<=12){
            this.datebuymouth=datebuymouth;
        }else if (datebuymouth==0&&datebuymouth<1&&datebuymouth>12){
            System.out.println("bad date mouth ");
            throw new EditingException();
        }
        if(datebuyday>=1 && datebuyday<=31){
            this.datebuyday=datebuyday;
        }else {
            System.out.println("bad date value day");
            throw new EditingException();
        }
        this.datebuymouth=datebuymouth;
        this.datebuyday=datebuyday;
        this.datebuyyear=datebuyyear;
        this.user=user;
        this.userrname=this.user.getName();
        this.usersurname=this.user.getSurname();
        this.datesell=null;
    }

    public ActionWallStreet getAction() {
        return action;
    }

    public String getUserrname() {
        return userrname;
    }
}

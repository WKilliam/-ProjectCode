package com.company.Working.Obeject;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

public class Purchase {

    private User user;
    private ActionWallStreet action;
    private String userrname;
    private String usersurname;
    private Integer datebuyyear;
    private Integer datebuymouth;
    private Integer datebuyday;
    private Integer datesell;
    private String namepurchase;


    public Purchase(User user,ActionWallStreet action,Integer datebuyyear,Integer datebuyday,Integer datebuymouth) throws EditingException {
        this.action=action;
        IMenu help = new HelpManager();

        this.datebuyday = datebuyday;
        this.datebuymouth = datebuymouth;
        this.datebuymouth=datebuymouth;
        this.datebuyday=datebuyday;
        this.datebuyyear=datebuyyear;
        this.user=user;
        this.userrname=this.user.getName();
        this.usersurname=this.user.getSurname();
        this.datesell=null;
        this.namepurchase=" ACTION BUY ";
    }

    public ActionWallStreet getAction() {
        return action;
    }

    public String getUserrname() {
        return userrname;
    }

    public String getUsersurname() {
        return usersurname;
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
}

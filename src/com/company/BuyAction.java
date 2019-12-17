package com.company;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyAction implements IMenu {


    public void Buy(ArrayList<ActionWallStreet>action,ArrayList<User> user,ArrayList<Purchase> purchases) throws EditingException {
        IMenu help = new HelpManager();
        if(action.size()==0){
            System.out.println("you haven't action today !!! sorry !");
            help.helpManager();
        }
        else{

            boolean exit = true;
            do {
            System.out.println("    HERE IS THE LIST OF POTENTIAL BUYERS AND THEIR PURCHASE IN POSSESSION :      ");
            for (int i = 0; i < user.size() ; i++) {
                System.out.println(" NAME USER              : "+                                 user.get(i).getName());
                System.out.println(" SURNAME USER              : "+                           user.get(i).getSurname());
                System.out.println("                            *****                                                ");
            }
            for (int i = 0; i < action.size(); i++) {
                System.out.println(" ACTION WALL STREET ON THE MARKET : "+                  action.get(i).getActionW());
                System.out.println(" ID_ACTION WALL STREET ON THE MARKET : "+        action.get(i).getiDlocalization());
            }
            System.out.println("     HERE IS THE FORMAT TO ENTER PLEASE RESPECT IT :         ");
            System.out.println("         NAMEUSER_SURNAME_IDACTION_DD_MONTH_YERA             ");

            Scanner sc1 = new Scanner(System.in);
            String indexbuy = sc1.nextLine();

            String tab[] = indexbuy.split("_");

            ArrayList<String> listmots = new ArrayList<>();

            for (int i = 0; i <tab.length ; i++) {
                listmots.add(tab[i]);
            }
            if(listmots.size()<6){
                System.out.println("PROBLEME INPUT VALUE ");
            }else{

                for (int i = 0; i <user.size() ; i++) {

                    String name     = listmots.get(0);
                    String surname  = listmots.get(1);
                    String idac     = listmots.get(2);
                    String m1 = listmots.get(3);
                    String m2 = listmots.get(4);
                    String m3 = listmots.get(5);

                    int day      = Integer.parseInt(m1);
                    int month     = Integer.parseInt(m2);
                    int yeras     = Integer.parseInt(m3);

                    if(user.get(i).getName().equals(name)&& user.get(i).getSurname().equals(surname)){

                        for (int j = 0; j <action.size() ; j++) {

                            if (action.get(j).getiDlocalization().equals(idac)){

                                if(month>=1 && month<=12){
                                    if(month%2==0){
                                        if (day>=1&&day<=30){
                                            Purchase pur = new Purchase(user.get(i),action.get(i),yeras,day,month);
                                            purchases.add(pur);
                                            user.get(i).setActionHas(pur);
                                            System.out.println(user.get(i).getName()+" NAME : "+user.get(i).getSurname()+"\n"+
                                                    " BUY : "+action.get(i).getActionW()+" ID : "+action.get(i).getiDlocalization()+"\n"+
                                                    " AND USER HAVE :"+user.get(i).getActionHas()+"\n"
                                                    +" DATE :"+pur.getDatebuyday()+"/"+pur.getDatebuymouth()+"/"+pur.getDatebuyyear());
                                        }else{
                                            System.out.println("THIS FORMAT IS NOT GOOD MONTH IS :"+month+" AND DAY IS :"+day+" IS NOT POSSIBLE ");
                                        }

                                    }else{
                                        if (day>=1&&day<=31){
                                            Purchase pur1 = new Purchase(user.get(i),action.get(i),yeras,day,month);
                                            purchases.add(pur1);
                                            user.get(i).setActionHas(pur1);
                                            System.out.println(user.get(i).getName()+" NAME : "+user.get(i).getSurname()+"\n"+
                                                    " BUY : "+action.get(i).getActionW()+" ID : "+action.get(i).getiDlocalization()+"\n"+
                                                    " AND USER HAVE :"+user.get(i).getActionHas()+"\n"
                                                    +" DATE :"+pur1.getDatebuyday()+"/"+pur1.getDatebuymouth()+"/"+pur1.getDatebuyyear());
                                        }else{
                                            System.out.println("THIS FORMAT IS NOT GOOD MONTH IS :"+month+" AND DAY IS :"+day+" IS NOT POSSIBLE ");
                                        }
                                    }
                                }else{
                                    System.out.println("FORMAT MONTH NOT GOOD PLEASE SELECT OF A VALUE BETWEEN 1 OR 12");
                                }
                            }else {
                                System.out.println(" THIS ACTION NOT EXISTED IN DATA BASE ");
                            }
                        }
                    }else{
                        System.out.println(" USER IS NOT EXISTED IN DATA BASE");
                    }
                }
            }
                System.out.println("YOU HAVE FINISH ? Y / N ");
                Scanner rep = new Scanner(System.in);
                String s3 = rep.nextLine();
                if (s3.equals("Y")) {
                    exit = false;
                    help.helpManager();
                }
                if (s3.equals("N")){

                }
                else if(s3.equals("N")){

                }
            }while (exit==true);
        }
    }
/*

        IMenu help = new HelpManager();
        if(action.size()==0){
            System.out.println("you haven't action today !!! sorry !");
            help.helpManager();
        }
        else{


            System.out.println("***************************************");
            System.out.println("*      PURCHASE OPEN :                *");
            for (int i = 0; i < action.size(); i++) {
            System.out.println("*  "+i+" "+action.get(i).getActionW()+" "+action.get(i).getiDlocalization()+"                       *");
            }
            System.out.println("*                                     *");
            System.out.println("*                                     *");
            System.out.println("*                                     *");
            System.out.println("***************************************");

            try {



                System.out.println("***************************************");
                System.out.println("*      WHO USER BUY  :                *");
                for (int i = 0; i < action.size(); i++) {
                    System.out.println("*  "+i+" "+user.get(i).getName()+" "+user.get(i).getSurname()+"                          *");
                }
                System.out.println("*                                     *");
                System.out.println("*                                     *");
                System.out.println("*                                     *");
                System.out.println("***************************************");

                Scanner sc1 = new Scanner(System.in);
                int indexbuy1 = sc1.nextInt();


                System.out.println("ADD DATE OF BUY        :");
                System.out.println("THIS IS FORMAT INPUT   :");
                System.out.println("    31/12/9999         :");

                Scanner sc2 = new Scanner(System.in);
                String indexbuy2 = sc2.nextLine();

                String[] test = indexbuy2.split("/");

                ArrayList<Integer> listedemot = new ArrayList<>();

                for (int i = 0; i <test.length ; i++) {

                    int pars = Integer.parseInt(test[i]);
                    listedemot.add(pars);
                }
                if(listedemot.size()<2&&listedemot.size()>3){
                    System.out.println("bad value date input");
                    help.helpManager();
                }else {
                    Integer indexDAY = listedemot.get(0);
                    Integer indexMOUTH = listedemot.get(1);
                    Integer indexYEAR = listedemot.get(2);
                    Purchase pur=new Purchase(user.get(indexbuy1),action.get(indexbuy),indexYEAR,indexDAY,indexMOUTH);
                    purchases.add(pur);
                    user.get(indexbuy1).getActionHas().add(pur);
                    System.out.println("PURCHASE VALID");
                    help.helpManager();
                }
            }catch (Exception | EditingException e){
                System.out.println("INCORRECT VALUE select between 0 and "+action.size());
            }
        }
    }
*/

    @Override
    public void editingAction(ArrayList<ActionWallStreet> listaction) {

    }

    @Override
    public void helpManagerEditAction() {

    }

    @Override
    public void removeAction(ArrayList<ActionWallStreet> action, ArrayList<User> user, ArrayList<Purchase> purchase) {

    }

    @Override
    public void listUserCall(ArrayList<User> listuser) {

    }

    @Override
    public void listeActionPrint(ArrayList<ActionWallStreet> action) {

    }


    @Override
    public void helpManager() {

    }

    @Override
    public void createUsersup(ArrayList<User> userlist) {

    }

    @Override
    public void editingU(ArrayList<User> listuser) throws EditingException {

    }

    @Override
    public void helpManagerEditing(ArrayList<User> listuser, int valueselect) {

    }

    @Override
    public void removeUser(ArrayList<User> list) throws RemoveException {

    }

    @Override
    public void createAction(ArrayList<ActionWallStreet> action) {

    }
}

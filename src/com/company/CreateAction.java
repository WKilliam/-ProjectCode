package com.company;

import com.company.Working.ExceptionProgramme.EditingException;
import com.company.Working.ExceptionProgramme.IdException;
import com.company.Working.ExceptionProgramme.RemoveException;
import com.company.Working.Obeject.ActionWallStreet;
import com.company.Working.Obeject.Purchase;
import com.company.Working.Obeject.User;
import com.company.Working.Menu.HelpManager;
import com.company.Working.Menu.IMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAction implements IMenu {

    public void createAction(ArrayList<ActionWallStreet> action){

        IMenu help = new HelpManager();
        try{
            System.out.println("TO CREATE AN ACTION FOLLOWED THIS FORMAT :");
            System.out.println("ACTION_REFERENCE");
            Scanner sc1 = new Scanner(System.in);
            String s = sc1.nextLine();
            String test[] = s.split("_");
            ArrayList<String> listmots = new ArrayList<>();
            ArrayList<Integer> listvalue = new ArrayList<>();
            for (int i = 0; i <test.length ; i++) {
                listmots.add(test[i]);
            }
            if(test.length<=1 || test.length>3){
                throw new EditingException();
            }else{
                String actiontake = listmots.get(0);
                String referencetake = listmots.get(1);
                for (int i = 0; i <action.size(); i++) {
                    if (action.get(i).getActionW().equals(actiontake) && action.get(i).getiDlocalization().equals(referencetake)) {
                        throw new IdException(action.get(i).getActionW() +" "+ action.get(i).getiDlocalization()+" existed ");
                    }
                }
                System.out.println("TO CREATE AN ACTION  PRICE FOLLOWED THIS FORMAT :");
                System.out.println("PRICE");

                Scanner pricesc = new Scanner(System.in);
                int indexprice = pricesc.nextInt();

                ActionWallStreet actionCreate =new ActionWallStreet(actiontake,referencetake);

                actionCreate.getPriceOpencreate(indexprice);

                action.add(actionCreate);
                help.helpManager();
            }
        }catch (EditingException e){
            help.helpManager();
            System.out.println("this input is not good");
        }catch (IdException e) {
            help.helpManager();
            System.out.println("this value existed");;
        }
        catch (Exception e){
            System.out.println("this input is not good");
        }
    }

    @Override
    public void Buy(ArrayList<ActionWallStreet> action,ArrayList<User>user, ArrayList<Purchase>purchases) {

    }

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
}

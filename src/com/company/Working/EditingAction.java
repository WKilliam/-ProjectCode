package com.company.Working;


import java.util.ArrayList;
import java.util.Scanner;

public class EditingAction  {


    public void editingAction(ArrayList<ActionWallStreet> listaction){

        IMenu helpEditing = new HelpManager();
        for (int i = 0; i < listaction.size() ; i++) {
            System.out.println("SELECT YOUR EDITING USER ( NUMBER ):");
            System.out.println(i+" "+listaction.get(i).getiDlocalization());
        }
        try{

            System.out.println("WHRITE ID FOR A CHANGE ");
            Scanner select = new Scanner(System.in);
            String valueselect = select.nextLine();


            for (int i = 0; i <listaction.size() ; i++) {
                if (listaction.get(i).getiDlocalization().equals(valueselect)){

                    ActionWallStreet actionWallStreet = listaction.get(i);
                    boolean exit = true;
                    do {

                       // helpEditing.helpManagerEditAction();

                        Scanner select1 = new Scanner(System.in);
                        String valueselect1 = select1.nextLine();



                        switch (valueselect1){
                            case"PRICE SELL":
                                System.out.println("NEW PRICE SELL:");
                                Scanner select5 = new Scanner(System.in);
                                int valueselect5 = select5.nextInt();
                                actionWallStreet.setPriceClose(valueselect5);
                                break;
                            case "PRICE BUY":
                                System.out.println("NEW PRICE BUY :");
                                Scanner select4 = new Scanner(System.in);
                                int valueselect4 = select4.nextInt();
                                actionWallStreet.setPriceOpen(valueselect4);
                                break;
                            case "ID_REFERENCE":
                                System.out.println("NEW ID_REFERENCE :");
                                Scanner select3 = new Scanner(System.in);
                                String valueselect3 = select3.nextLine();
                                for (int j = 0; j <listaction.size() ; j++) {
                                    String nametesting = listaction.get(i).getiDlocalization();
                                    if(listaction.get(j).getiDlocalization().equals(valueselect3)){
                                        throw new Exception("this user already exists");
                                    }
                                }
                                actionWallStreet.setiDlocalization(valueselect3);
                                break;
                            case"NAME":
                                System.out.println("NEW NAME :");
                                Scanner select2 = new Scanner(System.in);
                                String valueselect2 = select2.nextLine();
                                actionWallStreet.setActionW(valueselect2);
                                break;
                            default:
                                System.out.println("mauvaise partie");
                                break;
                        }
                        System.out.println("YOU HAVE FINISH ? Y / N ");
                        Scanner rep = new Scanner(System.in);
                        String s3 = rep.nextLine();
                        if (s3.equals("Y")) {
                            exit = false;
                            break;
                        }else if (s3.equals("N")){

                        }
                    }while (exit==true);
                }
                else {
                    System.out.println("probléme 1");
                }
            }
        }catch (Exception  e){
            System.out.println("exception ");
        }

    }


}

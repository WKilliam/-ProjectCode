package com.company.Working;


import java.io.*;
import java.util.ArrayList;

public class Open {


    public void openfile(ArrayList<Purchase> purchases , ArrayList<User> user, ArrayList<ActionWallStreet> action) throws IOException {


        try (FileInputStream f = new FileInputStream("src/com.company/Working/Data/saving.ser");
             ObjectInputStream ois = new ObjectInputStream(f)) {

            Seriliz seriliz = (Seriliz) ois.readObject();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }






}

package com.company.Working;


import java.io.*;
import java.util.ArrayList;

public class Save {


    public void savefile(ArrayList<Purchase> purchases , ArrayList<User> user, ArrayList<ActionWallStreet> action) throws IOException {

        Seriliz ser = new Seriliz(purchases, user, action);

        try (FileOutputStream f = new FileOutputStream("src/com.company/Working/Data/saving.ser");
        ObjectOutputStream oos = new ObjectOutputStream(f)) {

            oos.writeObject(ser);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}

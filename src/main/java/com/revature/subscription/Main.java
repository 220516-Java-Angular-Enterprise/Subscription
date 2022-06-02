package com.revature.subscription;

import com.revature.subscription.util.database.DatabaseConnection;

public class Main {
    public static void main(String[] args){
        System.out.println(DatabaseConnection.getCon());

    }

}

package com.java.designpatterns;

import com.java.designpatterns.singleton.MobileUser;
import com.java.designpatterns.singleton.ServersController;
import com.java.designpatterns.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        //Singleton
        Singleton singleton = Singleton.returnInstance();
        Singleton singleton2 = Singleton.returnInstance();
        if (singleton == singleton2) {
            System.out.println("Objects are the same.");
        }

        MobileUser mobileUser = MobileUser.returnMobileUser();
        MobileUser mobileUser2 = MobileUser.returnMobileUser();
        mobileUser.logIn("Karolina12", "Karolina", "Lewinska", 22, "aaa1");
        System.out.println(mobileUser.getLogin() + " is the same as " + mobileUser2.getLogin());

        ServersController serversController = ServersController.returnServerController();
        ServersController serversController2 = ServersController.returnServerController();
        if (serversController == serversController2) {
            System.out.println("The same instance.");
        }
        for (int i = 0; i < 16; i++) {
            String server = serversController.setServer();
            System.out.println(server);
        }
    }
}
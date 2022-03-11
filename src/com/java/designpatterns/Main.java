package com.java.designpatterns;

import com.java.designpatterns.builder.builder1.Builder;
import com.java.designpatterns.builder.builder1.BuilderQW;
import com.java.designpatterns.builder.builder1.BuilderXY;
import com.java.designpatterns.builder.builder1.Director;
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

        ////////////
        MobileUser mobileUser = MobileUser.returnMobileUser();
        MobileUser mobileUser2 = MobileUser.returnMobileUser();
        mobileUser.logIn("Karolina12", "Karolina", "Lewinska", 22, "aaa1");
        System.out.println(mobileUser.getLogin() + " is the same as " + mobileUser2.getLogin());

        ////////////
        ServersController serversController = ServersController.returnServerController();
        ServersController serversController2 = ServersController.returnServerController();
        if (serversController == serversController2) {
            System.out.println("The same instance.");
        }
        for (int i = 0; i < 16; i++) {
            String server = serversController.setServer();
            System.out.println(server);
        }

        //Builder
        Director director = new Director();
        Builder builderXY = new BuilderXY();
        Builder builderQW = new BuilderQW();

        director.assembly(builderXY);
        builderXY.returnProduct().showPieces();

        director.assembly(builderQW);
        builderQW.returnProduct().showPieces();
        ////////////
    }
}
package com.java.designpatterns;

import com.java.designpatterns.builder.buider2.FlashPlayerCreator;
import com.java.designpatterns.builder.buider2.Generator;
import com.java.designpatterns.builder.buider2.HtmlPlayerCreator;
import com.java.designpatterns.builder.builder1.Builder;
import com.java.designpatterns.builder.builder1.BuilderQW;
import com.java.designpatterns.builder.builder1.BuilderXY;
import com.java.designpatterns.builder.builder1.Director;
import com.java.designpatterns.factory.militaryunit.FactoryUnit;
import com.java.designpatterns.factory.militaryunit.MilitaryFactory;
import com.java.designpatterns.factory.militaryunit.MilitaryUnit;
import com.java.designpatterns.singleton.MobileUser;
import com.java.designpatterns.singleton.ServersController;
import com.java.designpatterns.singleton.Singleton;

public class Main {

    public static void main(String[] args) throws Exception {
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

        director.assemblePieces(builderXY);
        builderXY.returnProduct().showPieces();

        director.assemblePieces(builderQW);
        builderQW.returnProduct().showPieces();

        ////////////
        Generator generator = new Generator();
        FlashPlayerCreator flashCreator = new FlashPlayerCreator();
        HtmlPlayerCreator htmlCreator = new HtmlPlayerCreator();

        generator.assemblePlayer(flashCreator);
        flashCreator.returnPlayer().showName();

        generator.assemblePlayer(htmlCreator);
        htmlCreator.returnPlayer().showName();

        //Factory
        MilitaryFactory factory = new FactoryUnit();
        MilitaryUnit tank = factory.createUnit(MilitaryFactory.UnitType.TANK);
        MilitaryUnit shooter = factory.createUnit(MilitaryFactory.UnitType.SHOOTER);
        System.out.println(tank.life);
        System.out.println(shooter.forceOfDestruction);
    }
}
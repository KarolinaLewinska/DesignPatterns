package com.java.designpatterns;

import com.java.designpatterns.abstractfactory.ArmyAbstractFactory;
import com.java.designpatterns.abstractfactory.BlueFactory;
import com.java.designpatterns.abstractfactory.RedFactory;
import com.java.designpatterns.abstractfactory.militaryunits.AirUnit;
import com.java.designpatterns.abstractfactory.militaryunits.GroundUnit;
import com.java.designpatterns.abstractfactory.militaryunits.WalkingUnit;
import com.java.designpatterns.adapter.Adapter;
import com.java.designpatterns.adapter.DestinationElement;
import com.java.designpatterns.adapter.temperatures.FahrenheitSensor;
import com.java.designpatterns.adapter.temperatures.Sensor;
import com.java.designpatterns.adapter.temperatures.TemperaturesAdapter;
import com.java.designpatterns.facade.Facade;
import com.java.designpatterns.facade.bank.Client;
import com.java.designpatterns.facade.bank.Mortgage;
import com.java.designpatterns.factory.pizzerias.FirstPizzeria;
import com.java.designpatterns.factory.pizzerias.Pizzeria;
import com.java.designpatterns.factory.pizzerias.SecondPizzeria;
import com.java.designpatterns.factory.sales.CompanySale;
import com.java.designpatterns.factory.sales.IndividualSale;
import com.java.designpatterns.factory.sales.SaleFactory;
import com.java.designpatterns.builder.players.FlashPlayerCreator;
import com.java.designpatterns.builder.players.Generator;
import com.java.designpatterns.builder.players.HtmlPlayerCreator;
import com.java.designpatterns.builder.builder.Builder;
import com.java.designpatterns.builder.builder.BuilderQW;
import com.java.designpatterns.builder.builder.BuilderXY;
import com.java.designpatterns.builder.builder.Director;
import com.java.designpatterns.factory.militaryunits.FactoryUnit;
import com.java.designpatterns.factory.militaryunits.MilitaryFactory;
import com.java.designpatterns.factory.militaryunits.MilitaryUnit;
import com.java.designpatterns.flyweight.FlyweightsFactory;
import com.java.designpatterns.flyweight.SpecificFlyweight;
import com.java.designpatterns.flyweight.signs.SignsFactory;
import com.java.designpatterns.prototype.PrototypeX;
import com.java.designpatterns.prototype.PrototypeY;
import com.java.designpatterns.prototype.colors.Color;
import com.java.designpatterns.prototype.colors.ColorService;
import com.java.designpatterns.singleton.MobileUser;
import com.java.designpatterns.singleton.ServersController;
import com.java.designpatterns.singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

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

        ////////////
        List<SaleFactory> saleFactory = new ArrayList<>();
        saleFactory.add(new IndividualSale());
        saleFactory.add(new CompanySale());
        saleFactory.forEach(SaleFactory::createSaleDocument);
        saleFactory.forEach(s -> {
            String name = s.createSaleDocument().name;
            int numberOfItems = s.createSaleDocument().numberOfItems;
            float singleItemPrice = s.createSaleDocument().singleItemPrice;
            System.out.println(name + "\n" + numberOfItems + "\n" + singleItemPrice);
        });

        ////////////
        List<Pizzeria> pizzerias = new ArrayList<>();
        pizzerias.add(new FirstPizzeria());
        pizzerias.add(new SecondPizzeria());

        pizzerias.forEach(p -> {
            try {
                p.addPizza("Neapolitan");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //Abstract Factory
        ArmyAbstractFactory blueFactory = new BlueFactory();
        ArmyAbstractFactory redFactory = new RedFactory();

        GroundUnit redTank = redFactory.createGroundUnit(MilitaryFactory.UnitType.TANK);
        GroundUnit blueTank = blueFactory.createGroundUnit(MilitaryFactory.UnitType.TANK);
        System.out.println("Red tank life: " + redTank.life + "\n" + "Blue tank life: " + blueTank.life);

        WalkingUnit redShooter = redFactory.createWalkingUnit(MilitaryFactory.UnitType.SHOOTER);
        WalkingUnit blueShooter = blueFactory.createWalkingUnit(MilitaryFactory.UnitType.SHOOTER);
        System.out.println("Red shooter experience: " + redShooter.experience + "\n"
                + "Blue shooter experience: " + blueShooter.experience);

        AirUnit redHelicopter = redFactory.createAirUnit(MilitaryFactory.UnitType.HELICOPTER);
        AirUnit blueHelicopter = blueFactory.createAirUnit(MilitaryFactory.UnitType.HELICOPTER);
        System.out.println("Red helicopter force of destruction: " + redHelicopter.forceOfDestruction + "\n"
                + "Blue helicopter force of destruction: " + blueHelicopter.experience);

        //Prototype
        PrototypeX px = new PrototypeX("xyz");
        PrototypeX cloneX = (PrototypeX) px.clone();
        PrototypeY py = new PrototypeY("abc");
        PrototypeY cloneY = (PrototypeY) py.clone();
        System.out.println("Clone of prototypeX: " + cloneX.id + " and of PrototypeY: " + cloneY.id);

        ////////////
        ColorService service = new ColorService();

        service.setColor("red", new Color(255, 0, 0));
        service.setColor("blue", new Color(0, 0, 255));
        service.setColor("green", new Color(0, 255, 0));
        service.setColor("fire", new Color(211, 33, 19));

        Color redClone = (Color) service.getColors().get("red").clone();
        Color blueClone = (Color) service.getColors().get("blue").clone();
        Color greenClone = (Color) service.getColors().get("green").clone();
        Color fireColor = (Color) service.getColors().get("fire").clone();

        //Facade
        Facade facade = new Facade();
        facade.MethodA();
        facade.MethodB();

        ////////////
        Mortgage mortgage = new Mortgage();
        Client client = new  Client("Karolina Lewińska");
        boolean isQualifiedForMortgage = mortgage.ifIsQualifiedForMortgage(client, 300000);
        System.out.println(client.getName() + " is qualified in the system as: "
                + (isQualifiedForMortgage ? "accepted" : "rejected"));

        //Adapter
        DestinationElement destinationElement = new Adapter();
        destinationElement.MethodA();

        ////////////
        Sensor celsius = new TemperaturesAdapter(new FahrenheitSensor());
        System.out.println("Fahrenheit sensor shows temperature in celsius: " + celsius.getTemperature() + "°C");

        //Flyweight
        int externalData = 42;
        FlyweightsFactory flyweightFactory = new FlyweightsFactory();
        SpecificFlyweight sf = (SpecificFlyweight) flyweightFactory.getFlyweight("Q");
        sf.method(--externalData);

        SpecificFlyweight sf2 = (SpecificFlyweight) flyweightFactory.getFlyweight("W");
        sf2.method(--externalData);

        SpecificFlyweight sf3 = (SpecificFlyweight) flyweightFactory.getFlyweight("E");
        sf3.method(--externalData);

        ////////////
        String text = "bsASWbsd";
        char[] chars = text.toCharArray();

        SignsFactory signsFactory = new SignsFactory();
        for (char sign: chars) {
            signsFactory.getSign(sign).draw();
        }

        SignsFactory signsFactory2 = new SignsFactory(24);
        for (char sign: chars) {
            signsFactory2.getSign(sign).draw();
        }
    }
}
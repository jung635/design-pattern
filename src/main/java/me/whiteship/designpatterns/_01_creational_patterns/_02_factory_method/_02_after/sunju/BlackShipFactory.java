package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.sunju;

//java8의 경우 DefaultShipFactory 상속
//java8의 경우 ShipFactory을 implement
public class BlackShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}

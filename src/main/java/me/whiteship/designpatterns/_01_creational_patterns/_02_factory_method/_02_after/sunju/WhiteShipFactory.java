package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.sunju;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}

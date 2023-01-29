package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.sunju.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.sunju.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}

package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju.ShipPartsFactory;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju.WhiteshipPartsFactory;

//Client
public class WhiteshipFactory extends DefaultShipFactory {

    ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        shipPartsFactory.createAnchor( );
        shipPartsFactory.createWheel();

        Ship ship = new Whiteship();
        //부품을 바꿀때 마다 바꾸어 주어야한다.
        //ex. WhiteAnchor -> WhiteAdvancedAnchor
        //코드 변경 없이 제품군을 바꿀 수 있는 방법을 생각해보자.
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());

        return ship;
    }
}

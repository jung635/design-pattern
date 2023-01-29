package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;
import org.springframework.beans.factory.FactoryBean;

//Product를 우리가 구현하고, Client는 Spring을 사용하여 구현하는 쪽
public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}

package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju.ShipPartsFactory;

public class WhiteshipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}

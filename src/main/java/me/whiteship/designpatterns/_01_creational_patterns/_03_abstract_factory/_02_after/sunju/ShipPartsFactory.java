package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}

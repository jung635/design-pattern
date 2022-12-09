package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._01_before;

public class Client {

    public static void main(String[] args) {
        // OOP 규칙: 확장에는 오픈되고, 변경에는 닫혀잇어야한다.
        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}

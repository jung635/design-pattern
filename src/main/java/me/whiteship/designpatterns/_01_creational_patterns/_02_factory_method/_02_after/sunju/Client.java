package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.sunju;

public class Client {

    public static void main(String[] args) {
        // client 코드가 수정되는데, 과연 의존적이지 않다고 할 수 있는가?
        // 그래서 보통 변경되는 부분을 의존성 주입시키면 클라이언트 코드도 최대한 수정없이 변경 가능하다.
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "sunju@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "sunju@mail.com");
        System.out.println(blackship);

        // -> 주입시킨 버전
        Client client = new Client();
        client.print(new WhiteShipFactory(), "Whiteship", "sunju@mail.com");
        client.print(new BlackShipFactory(), "Blackship", "sunju@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
